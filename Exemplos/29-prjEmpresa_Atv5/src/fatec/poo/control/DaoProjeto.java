package fatec.poo.control;

import fatec.poo.model.Projeto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ltshi
 */
public class DaoProjeto {
    private Connection conn;

    public DaoProjeto(Connection conn) {
        this.conn = conn;
    }
    
    public Projeto consultar(int codigo){
        Projeto objProj = null;
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("SELECT * from tblProjeto where Codigo_Proj = ?");
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery(); 
           
            if (rs.next()) {
                objProj = new Projeto(rs.getInt("Codigo_Proj"),rs.getString("Descricao_Proj"));
                objProj.setDtInicio(rs.getString("DtInicio_Proj"));
                objProj.setDtTermino(rs.getString("DtTermino_Proj"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        
        return(objProj);
    }
    
    public void inserir(Projeto objProj) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("INSERT INTO tblProjeto(Codigo_Proj, Descricao_Proj, DtInicio_Proj, DtTermino_Proj) VALUES (?,?,?,?)");
            ps.setInt(1, objProj.getCodigo());
            ps.setString(2, objProj.getDescricao());
            ps.setString(3, objProj.getDtInicio());
            ps.setString(4, objProj.getDtTermino());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void alterar(Projeto objProj) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("UPDATE tblProjeto SET Descricao_Proj = ?, " +
                                                              "DtInicio_Proj = ?, " +
                                                              "DtTermino_Proj = ? " +
                                                         "WHERE Codigo_Proj = ?");
            ps.setString(1, objProj.getDescricao());
            ps.setString(2, objProj.getDtInicio());
            ps.setString(3, objProj.getDtTermino());
            ps.setInt(4, objProj.getCodigo());
            
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void excluir(Projeto objProj) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("DELETE FROM tblProjeto WHERE Codigo_Proj = ?");
            ps.setInt(1, objProj.getCodigo());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    

    
}
