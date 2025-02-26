
import fatec.poo.model.Aluno;
import java.util.Scanner;

/**
 *
 * @author ltshi
 */
public class Aplic {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Aluno aluno = new Aluno();
        
        int opcao = 0;
        
        System.out.print("Digite o RA do aluno: ");
        aluno.setRa(entrada.nextInt());
        System.out.print("Digite a nota da primeira prova: ");
        aluno.setNtPrv1(entrada.nextDouble());
        System.out.print("Digite a nota da segunda prova: ");
        aluno.setNtPrv2(entrada.nextDouble());
        System.out.print("Digite a nota do primeiro trabalho: ");
        aluno.setNtTrab1(entrada.nextDouble());
        System.out.print("Digite a nota do segundo trabalho: ");
        aluno.setNtTrab2(entrada.nextDouble());
        
        /*
        System.out.println(aluno.getRa());
        System.out.println(aluno.getNtPrv1());
        System.out.println(aluno.getNtPrv2());
        System.out.println(aluno.getNtTrab1());
        System.out.println(aluno.getNtTrab2());
        */
        
        
        do {
            System.out.println("\n\n\tMENU\n");
            System.out.println("1 - Exibir Notas das Provas/Trbalhos");
            System.out.println("2 - Exibir Média dos Trbalhos/Provas");
            System.out.println("3 - Exibir Média Final");
            System.out.println("4 - Sair");
            
            System.out.print("\n\n\tDigite a opcao: ");
            opcao = entrada.nextInt();
            
            switch (opcao) {
                case 1: // notas
                    System.out.println("\nRA do aluno: " + aluno.getRa());
                    System.out.println("Nota Prova 1: " + aluno.getNtPrv1());
                    System.out.println("Nota Prova 2: " + aluno.getNtPrv2());
                    System.out.println("Nota Trabalho 1: " + aluno.getNtTrab1());
                    System.out.println("Nota Trabalho 2: " + aluno.getNtTrab2());
                    break;
                case 2: // medias
                    System.out.println("\nRA do aluno: " + aluno.getRa());
                    System.out.println("Média provas: " + aluno.calcMediaProva());
                    System.out.println("Média trabalhos: " + aluno.calcMediaTrab());
                    break;
                case 3: // media final
                    System.out.println("\nRA do aluno: " + aluno.getRa());
                    System.out.println("Média Final: " + aluno.calcMediaFinal());
                    break;
                case 4: // sair
                    System.out.println("\nFim do programa!");
                    break;
                default:
                    System.out.println("\nValor inválido! Digite outra opção.");
            }
        } while (opcao != 4);
    }  
}
