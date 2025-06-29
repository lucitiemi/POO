package fatec.poo.control;

import fatec.poo.model.ServicoQuarto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author eros
 */
public class DaoServicoQuarto {
    private Connection conn;

    public DaoServicoQuarto(Connection conn) {
        this.conn = conn;
    }
    
    public ServicoQuarto consultar (int codigo) {
        ServicoQuarto servicoQuarto = null;
        
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("SELECT * FROM tblServicoQuarto WHERE Codigo_ServQuarto = ?");
            
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) {
                servicoQuarto = new ServicoQuarto(codigo, rs.getString("Descricao_ServQuarto"));
                servicoQuarto.setValor(rs.getDouble("Valor_ServQuarto"));
            }
        } catch (SQLException ex) { 
            System.out.println(ex.toString());   
        }
        return servicoQuarto;
    }
    
    public void inserir (ServicoQuarto servicoQuarto) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("INSERT INTO tblServicoQuarto "+
                    "(Codigo_ServQuarto,Descricao_ServQuarto,Valor_ServQuarto) VALUES (?,?,?)");
            ps.setInt(1, servicoQuarto.getCodigo());
            ps.setString(2, servicoQuarto.getDescricao());
            ps.setDouble(3, servicoQuarto.getValor());
            
            ps.execute();
        } catch (SQLException ex) { 
            System.out.println(ex.toString());   
        }
    }
    
    public void alterar (ServicoQuarto servicoQuarto) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("UPDATE tblServicoQuarto "+
                    "SET Descricao_ServQuarto = ?, Valor_ServQuarto = ? "+
                    "WHERE Codigo_ServQuarto = ?");
            ps.setString(1, servicoQuarto.getDescricao());
            ps.setDouble(2, servicoQuarto.getValor());
            ps.setInt(3, servicoQuarto.getCodigo());
            
            ps.execute();
        } catch (SQLException ex) { 
            System.out.println(ex.toString());   
        }
    }
    
    public void excluir (ServicoQuarto servicoQuarto) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("DELETE FROM tblServicoQuarto WHERE Codigo_ServQuarto  = ?");
            ps.setInt(1, servicoQuarto.getCodigo());
            
            ps.execute();
        } catch (SQLException ex) { 
            System.out.println(ex.toString());   
        }
    }
    
    public ArrayList<ServicoQuarto> consultarServicosPorRegistro(int codigo){
        ArrayList<ServicoQuarto> servicos = new ArrayList<ServicoQuarto>();
        
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from tblListaServ  WHERE Codigo_Registro = ?");
            ps.setInt(1, codigo);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                servicos.add(consultar(rs.getInt("Codigo_ServQuarto")));
            }
        }
        catch (SQLException ex) {
             System.out.println(ex.toString());   
        }        
        return servicos;
    }
}
