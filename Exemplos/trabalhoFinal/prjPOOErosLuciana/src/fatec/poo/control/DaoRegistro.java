package fatec.poo.control;

import fatec.poo.model.Hospede;
import fatec.poo.model.Quarto;
import fatec.poo.model.Recepcionista;
import fatec.poo.model.Registro;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

/**
 *
 * @author eros
 */
public class DaoRegistro {
    private Connection conn;

    public DaoRegistro(Connection conn) {
        this.conn = conn;
    }
    
    public Registro consultar(int codigo) {
        Registro registro = null;
        
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("SELECT * FROM tblRegistro WHERE Codigo_Registro = ?");
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
                
                // consultar e instanciar recepcionista
                DaoRecepcionista daoRecep = new DaoRecepcionista(conn);
                Recepcionista recepcionista = daoRecep.consultar(rs.getInt("RegFunc_Recep"));
                
                // pegar a data entrada (converter para LocalDate)
                LocalDate dtEntrada = rs.getDate("DtEntrada_Registro").toLocalDate();
                
                // instanciar registro e associar ao recepcionista
                registro = new Registro(codigo, dtEntrada, recepcionista);
                recepcionista.addRegistro(registro);
                
                // pegar a data saida(converter para LocalDate)
                if (rs.getDate("DtSaida_Registro") != null) {
                    LocalDate dtSaida = rs.getDate("DtSaida_Registro").toLocalDate();
                    registro.setDataSaida(dtSaida);
                }
                
                // instanciar quarto e associar ao registro
                DaoQuarto daoQuarto = new DaoQuarto(conn);
                Quarto quarto = daoQuarto.consultar(rs.getInt("Numero_Quarto"));
                registro.setQuarto(quarto);

                // instanciar os Servicos de Quarto
                DaoServicoQuarto daoServQuarto = new DaoServicoQuarto(conn);
                registro.setListaServ(daoServQuarto.consultarServicosPorRegistro(codigo));
                
                // instanciar hospede e associar ao registro
                DaoHospede daoHospede = new DaoHospede(conn);
                Hospede hospede = daoHospede.consultar(rs.getString("Cpf_Hospede"));
                registro.setHospede(hospede);
                
                // settar valor hospedagem
                registro.setValorHospedagem(rs.getDouble("ValHospedagem_Registro"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());         
        }
        return registro;
    }
    
    public void inserir(Registro registro) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("INSERT INTO tblRegistro(Codigo_Registro, RegFunc_Recep, Cpf_Hospede, Numero_Quarto, DtEntrada_Registro) VALUES(?,?,?,?,?)");
            ps.setInt(1, registro.getCodigo());
            ps.setInt(2, registro.getRecepcionista().getRegFunc());
            ps.setString(3, registro.getHospede().getCpf());
            ps.setInt(4, registro.getQuarto().getNumero());
            ps.setDate(5, Date.valueOf(registro.getDataEntrada())); 
            
            ps.execute();
            
            new DaoQuarto(conn).alterar(registro.getQuarto());
            
        } catch (SQLException ex) {
            System.out.println(ex.toString());         
        }
    }
    
    public void alterar (Registro registro) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("UPDATE tblRegistro " +
                                        "SET DtEntrada_Registro = ?, " +
                                            "DtSaida_Registro = ?, " +
                                            "ValHospedagem_Registro = ?, " +
                                            "RegFunc_Recep = ?, " +
                                            "Cpf_Hospede = ?, " +
                                            "Numero_Quarto = ? " +
                                            "WHERE Codigo_Registro = ? ");
            ps.setDate(1, Date.valueOf(registro.getDataEntrada()));
            ps.setDate(2, Date.valueOf(registro.getDataSaida()));
            ps.setDouble(3, registro.getValorHospedagem());
            ps.setInt(4, registro.getRecepcionista().getRegFunc());
            ps.setString(5, registro.getHospede().getCpf());
            ps.setInt(6, registro.getQuarto().getNumero());
            ps.setInt(7, registro.getCodigo());

            ps.execute();
            new DaoQuarto(conn).alterar(registro.getQuarto());
        } catch (SQLException ex) {
            System.out.println(ex.toString());         
        }
    }
    
    public void deletar(Registro registro) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("DELETE FROM tblRegistro where Codigo_Registro = ?");
            ps.setInt(1, registro.getCodigo());
            
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());         
        }
    }    
}
