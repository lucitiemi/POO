package fatec.poo.model;

/**
 *
 * @author ltshi
 */
public class Turma {
    private String sigla;
    private int qtdeVagas;
    private Curso curso;
    private Aluno[] alunos;
    private int qtdeAlunos;
    private Professor professor;
    
    
    public Turma(String s, int qt){
        sigla = s;
        qtdeVagas = qt;
        alunos = new Aluno[qt];
    }

    public String getSigla() {
        return sigla;
    }
    public int getQtdeVagas() {
        return qtdeVagas;
    }
    
    public Curso getCurso(){
        return curso;
    }
    public void setCurso(Curso c){
        curso = c;
    }
    
    public void addAluno(Aluno a){
        alunos[qtdeAlunos] = a;
        qtdeAlunos++;
    }
    public void listasAlunos(){
        System.out.println("\n\n\t\t\t-- Lista de Frequência --");
        System.out.print("\nSigla do Curso: " + curso.getSigla());
        System.out.println("\t\tNome do Curso: " + curso.getDescricao());
        System.out.println("Sigla Turma: " + sigla);
        System.out.println("Nome do Professor: " + professor.getNome());
        
        System.out.println("\n\t\tNome do Aluno");
        for(int cont=0; cont < qtdeAlunos; cont++){
            System.out.println((cont+1) + " - " + alunos[cont].getNome());
        }
    }
    
    public Professor getProfessor(){
        return professor;
    }
    public void setProfessor(Professor p){
        professor = p;
    }
}
