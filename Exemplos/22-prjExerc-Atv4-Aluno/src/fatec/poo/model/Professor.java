package fatec.poo.model;

/**
 *
 * @author ltshi
 */
public class Professor extends Pessoa {
    private String regFunc;
    private int titularidade;
    private int areaAtuacao;
    private Turma[] turmas;
    private int qtdeTurmas;

    public Professor(String regFunc, String nome) {
        super(nome);
        this.regFunc = regFunc;
        turmas = new Turma[10];
    }

    public String getRegFunc() {
        return regFunc;
    }
    public int getTitularidade() {
        return titularidade;
    }
    public void setTitularidade(int titularidade) {
        this.titularidade = titularidade;
    }
    public int getAreaAtuacao() {
        return areaAtuacao;
    }
    public void setAreaAtuacao(int areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }
    public void addTurma(Turma t){
        turmas[qtdeTurmas] = t;
        qtdeTurmas++;       
    }
    
    
    
}
