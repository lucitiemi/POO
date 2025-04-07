package fatec.poo.model;

/**
 *
 * @author Dimas
 */
abstract public class Funcionario {
    private int registro;
    private String nome;
    private String dtAdmissao;  
    private String cargo;
    private Departamento departamento; // definicao do ponteiro para multiplicidade 1
    private Projeto projeto;
    
    // construtor
    public Funcionario(int r, String n, String dtAdm){
        registro = r;
        nome = n;
        dtAdmissao = dtAdm;  
    }   
    
    
    // getters e setters
    public int getRegistro(){
        return(registro);
    }
    public String getNome(){
        return(nome);
    }
    public String getDtAdmissao(){
        return(dtAdmissao);
    }
    public String getCargo(){
        return(cargo);
    }
    public void setCargo(String c){
        cargo = c;
    }
    
    // retorna o endereco de um objeto da classe Departamento
    public Departamento getDepartamento() {
        return departamento; 
    }
    // recebe como parametro o endereco de um objeto da classe Departamento
    public void setDepartamento(Departamento departamento) {  
        this.departamento = departamento;
    }
    // retorna o endereco de um objeto da classe Projeto
    public Projeto getProjeto() {
        return projeto; 
    }
    // recebe como parametro o endereco de um objeto da classe Projeto
    public void setProjeto(Projeto projeto) {  
        this.projeto = projeto;
    }
    
    
    // outros metodos
    public abstract double calcSalBruto();
    
    public double calcDesconto(){
        return(0.10 * calcSalBruto());
    }
    public double calcSalLiquido(){
        return(calcSalBruto() - calcDesconto());
    }
}
