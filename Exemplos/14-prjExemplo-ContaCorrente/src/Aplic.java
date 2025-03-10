
import fatec.poo.model.ContaCorrente;
import java.util.Scanner;

/**
 *
 * @author ltshi
 */
public class Aplic {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int num, opcao;
        double sal;
        
        System.out.print("Digite o numero da conta: ");
        num = entrada.nextInt();
        System.out.print("Digite o saldo inicial da conta: ");
        sal = entrada.nextDouble();
        
        ContaCorrente conta = new ContaCorrente(num, sal);
        
        do {
            System.out.println("\n\nMENU\n");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Sair");
            
            System.out.print("\nDigite a opção: ");
            opcao = entrada.nextInt();
            
            switch (opcao) {
                case 1: // depositar
                    System.out.println("\n\n- CONTA " + conta.getNumero() + " -\n");
                    System.out.print("Digite o valor que deseja depositar: ");
                    conta.depositar(entrada.nextDouble());
                    System.out.println("\nDepósito feito com sucesso!");
                    System.out.println("Novo saldo: " + conta.getSaldo());
                    break;
                case 2: // sacar
                    System.out.println("\n\n- CONTA " + conta.getNumero() + " -\n");
                    System.out.print("Digite o valor que deseja sacar: ");
                    double valor = entrada.nextDouble();
                    if(valor<=conta.getSaldo()){
                        conta.sacar(valor);
                        System.out.println("\nSaque feito com sucesso!");
                        System.out.println("Novo saldo: " + conta.getSaldo());
                    } else {
                        System.out.println("Saldo insuficiente!");
                    }
                    break;
                case 3: // consultar saldo
                    System.out.println("\n\n- CONTA " + conta.getNumero() + " -\n");
                    System.out.println("Saldo: " + conta.getSaldo());
                    break;
                case 4: // sair
                    System.out.println("\nFim do programa!\n");
                    break;
                default:
                    System.out.println("\nValor inválido! Digite outra opção.");
            }
        } while (opcao != 4);
    }
}
