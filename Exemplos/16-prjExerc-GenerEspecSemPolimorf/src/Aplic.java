
import fatec.poo.model.Cliente;
import fatec.poo.model.Instrutor;
import java.util.Scanner;

/**
 *
 * @author ltshi
 */
public class Aplic {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int id;
        String nom, tel, c;
        
        System.out.print("Digite a identificação do instrutor: ");
        id = entrada.nextInt();
        System.out.print("Digite o nome do instrutor: ");
        nom = entrada.next();
        System.out.print("Digite o telefone do instrutor: ");
        tel = entrada.next();
        
        Instrutor objInstr = new Instrutor(id, nom, tel);
        
        System.out.print("Digite a área de atuação do instrutor: ");
        objInstr.setAreaAtuacao(entrada.next());
        
        System.out.println("------------------------");
        
        System.out.print("Digite o cpf do cliente: ");
        c = entrada.next();
        System.out.print("Digite o nome do cliente: ");
        nom = entrada.next();
        System.out.print("Digite o telefone do cliente: ");
        tel = entrada.next();
        
        Cliente objCliente = new Cliente(c, nom, tel);
        
        System.out.print("Digite o peso do cliente: ");
        objCliente.setPeso(entrada.nextDouble());
        System.out.print("Digite a altura do cliente: ");
        objCliente.setAltura(entrada.nextDouble());
        
        System.out.println("------------------------");
        System.out.println("------------------------");
        System.out.println("\n- DADOS COLETADOS -\n");
        
        System.out.println("- Instrutor " + objInstr.getNome() + " -");
        System.out.println("Cód de identificação: " + objInstr.getIdentificacao());
        System.out.println("Telefone: " + objInstr.getTelefone());
        System.out.println("Área de atuação: " + objInstr.getAreaAtuacao());
        
        System.out.println("\n- Cliente " + objCliente.getNome() + " -");
        System.out.println("Cpf: " + objCliente.getCpf());
        System.out.println("Telefone: " + objCliente.getTelefone());
        System.out.println("Peso: " + objCliente.getPeso());
        System.out.println("Altura: " + objCliente.getAltura());
        
        
        
    }
    
}
