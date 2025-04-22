
import fatec.poo.model.*;
import java.util.Scanner;

/**
 *
 * @author ltshi
 */
public class Aplic {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       Curso curso = new Curso("ADM", "Administração", "300 horas");
       Professor prof = new Professor("1010", "Dimas");
       Turma turma = new Turma("A", 2);
       
       turma.setCurso(curso);
       prof.addTurma(turma);
       
       Aluno[] tabAlunos = new Aluno[2];
       
       for(int cont=0; cont < tabAlunos.length; cont++) {
           System.out.print("Digite o RA do aluno: ");
           String r = entrada.next();
           System.out.print("Digite o nome do aluno: ");
           String n = entrada.next();
           
           tabAlunos[cont] = new Aluno(r,n);
           
           turma.addAluno(tabAlunos[cont]);
       }
       
       turma.listasAlunos();
       
       
       
       
       
    }
    
}
