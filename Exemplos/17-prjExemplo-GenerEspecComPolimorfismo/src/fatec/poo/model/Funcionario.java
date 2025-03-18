package fatec.poo.model;

/**
 *
 * @author ltshi
 */
public abstract class Funcionario {
    private int registro;
    private String nome;
    private String dtAdmissao;
    private String cargo;
    
    public Funcionario(int r, String n, String dtAdm) {
        registro = r;
        nome = n;
        dtAdmissao = dtAdm;
    }
    
    public int getRegistro(){
        return registro;
    }
     
    public String getNome(){
        return nome;
    }
    
    public String getDtAdminissao(){
        return dtAdmissao;
    }
    
    public String getCargo(){
        return cargo;
    }
     
    abstract public double calcSalBruto();
        
    public double calcDesconto(){
        return (0.10 * calcSalBruto());
    }
    
    abstract public double calcSalLiquido();
}
