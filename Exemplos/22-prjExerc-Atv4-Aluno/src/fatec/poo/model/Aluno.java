package fatec.poo.model;

/**
 *
 * @author ltshi
 */
public class Aluno extends Pessoa{
    private String ra;
    private int escolaridade;
    
    public Aluno(String r, String n){
        super(n);
        ra = r;
    }

    public String getRa() {
        return ra;
    }
    public int getEscolaridade() {
        return escolaridade;
    }
    public void setEscolaridade(int escolaridade) {
        this.escolaridade = escolaridade;
    }
    
}
