
package fatec.poo.model;

/**
 *
 * @author ltshi
 */
public class Pessoa {
    private String nome;
    private String dtNascimento;
    private String endereco;
    private String cidade;
    
    public Pessoa (String nome) {
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    public String getDtNascimento(){
        return dtNascimento;
    }
    public String getEndereco(){
        return endereco;
    }
    public String getCidade(){
        return cidade;
    }
    
    public void setNome(String n){
        nome = n;
    }
    public void setDtNascimento(String dt){
        dtNascimento = dt;
    }
    public void setEndereco(String e){
        endereco = e;
    }
    public void setCidade(String c){
        cidade = c;
    }
    
    
}
