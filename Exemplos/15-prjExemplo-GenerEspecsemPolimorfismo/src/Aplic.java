
import fatec.poo.model.Aluno;
import fatec.poo.model.Professor;

/**
 *
 * @author Dimas
 */
public class Aplic {
    public static void main(String[] args) {       
        //Instanciação de um objeto da classe Aluno
        Aluno objAlu = new Aluno(1010,
                                "Carlos Silveira", 
                                "15/03/1978");
    
        //passagem de mensagens   
        objAlu.setMensalidade(1500);
        System.out.println("-DADOS ALUNO-");
        System.out.println("Registro escolar: " + objAlu.getRegEscolar());
        System.out.println("Nome: " + objAlu.getNome());
        System.out.println("Data de Nascimento: " + objAlu.getDataNascimento());
        System.out.println("Mensalidade: " + objAlu.getMensalidade()); 


        //Instanciação de um objeto da classe Professor
        Professor objProf = new Professor(1001, "Dimas", "05/09/1981");

        objProf.setSalario(10000);
        System.out.println("\n-DADOS PROFESSOR-");
        System.out.println("Registro Funcional: " + objProf.getRegFuncional());
        System.out.println("Nome: " + objProf.getNome());
        System.out.println("Data de Nascimento: " + objProf.getDataNascimento());
        System.out.println("Salário: " + objProf.getSalario());
      
    }
}
