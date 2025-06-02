package fatec.poo.control;

import fatec.poo.model.Departamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ltshi
 */
public class DaoDepartamento {
    private Connection conn;

    public DaoDepartamento(Connection conn) {
        this.conn = conn;
    }
    
    public Departamento consultar(String sigla) {
        Departamento objDepto = null;
        PreparedStatement ps;
        
        try {
            ps = conn.prepareStatement("SELECT * FROM tblDepartamento WHERE Sigla_Dep = ?");
            ps.setString(1, sigla);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                objDepto = new Departamento(rs.getString("Sigla_Dep"), rs.getString("Nome_Dep"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return objDepto; 
    }
    
    public void inserir(Departamento objDpto) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("INSERT INTO tblDepartamento(Sigla_Dep, Nome_Dep) VALUES(?, ?) ");
            ps.setString(1, objDpto.getSigla());
            ps.setString(2, objDpto.getNome());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void alterar(Departamento objDepto) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("UPDATE tblDepartamento SET Nome_Dep = ? WHERE Sigla_Dep = ?");
            ps.setString(1, objDepto.getNome());
            ps.setString(2, objDepto.getSigla());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void excluir(Departamento objDepto) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("DELETE FROM tblDepartamento WHERE Sigla_Dep = ?");
            ps.setString(1, objDepto.getSigla());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
}
