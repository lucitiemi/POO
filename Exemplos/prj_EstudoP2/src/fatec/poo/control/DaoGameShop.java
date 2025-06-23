package fatec.poo.control;

import fatec.poo.model.GameShop;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ltshi
 */
public class DaoGameShop {
    private Connection conn;

    public DaoGameShop(Connection conn) {
        this.conn = conn;
    }
    
    public GameShop consultar(int codigo) {
        GameShop gameShop = null;
        
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("SELECT * FROM tblGameShop WHERE codigo = ?");
            ps.setInt(1, codigo);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                gameShop = new GameShop(codigo, rs.getString("nome"),rs.getInt("saldo"));
                gameShop.setIdade(rs.getInt("idade"));
                gameShop.setTipoGamer(rs.getString("tipoGamer"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return gameShop;
    }
    
    public void inserir(GameShop gameShop) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("INSERT INTO tblGameShop(codigo, nome, idade, tipoGamer, saldo) VALUES (?,?,?,?,?)");
            ps.setInt(1, gameShop.getCodigo());
            ps.setString(2, gameShop.getNome());
            ps.setInt(3, gameShop.getIdade());
            ps.setString(4, gameShop.getTipoGamer());
            ps.setInt(5, gameShop.getSaldo());
            
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void alterar(GameShop gameShop) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("UPDATE tblGameShop SET nome = ?, idade = ?, tipoGamer = ?, saldo = ? WHERE codigo = ?");
            ps.setString(1, gameShop.getNome());
            ps.setInt(2, gameShop.getIdade());
            ps.setString(3, gameShop.getTipoGamer());
            ps.setInt(4, gameShop.getSaldo());
            ps.setInt(5, gameShop.getCodigo());
            
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void deletar(GameShop gameShop) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("DELETE tblGameShop WHERE codigo = ?");
            ps.setInt(1, gameShop.getCodigo());
            
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    
}
