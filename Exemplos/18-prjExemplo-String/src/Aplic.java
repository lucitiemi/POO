
/**
 *
 * @author Fatec
 */
public class Aplic {
    public static void main(String[] args) {
        
        //Instanciação de um objeto da classe String
        //Forma implícita
        String nome1 = "Carlos Silva Souza";
        
        //Instanciação de um objeto da classe String
        //Forma explícita
        String nome2 = new String("Ana Beatriz");
        
        //Exibindo a sequência de caracteres armazenada nos objetos
        System.out.println("Nome: " + nome1);
        System.out.println("Nome: " + nome2);
        
        //Exibindo o tamanho da String
        System.out.println("\nString: " + nome1 + "  Tamanho: " + nome1.length());
        System.out.println("String: " + nome2 + "  Tamanho: " + nome2.length());
        
        //Convertendo a String para a forma minúscula e maiúscula
        System.out.println("\nString: " + nome1 + 
                           "  Forma Minúscula: " + nome1.toLowerCase());
        System.out.println("String: " + nome2 + 
                           "  Forma Maiúcula: " + nome2.toUpperCase());
        
        if (nome1.equals(nome2)){
            System.out.println("\nA String " + nome1 + " é igual a " + 
                               "String " + nome2);
        }else{
             System.out.println("\nA String " + nome1 + " não é igual a " + 
                               "String " + nome2);
        }
        
        nome1 = nome2;
       
        if (nome1.equalsIgnoreCase(nome2)){
            System.out.println("\nA String " + nome1 + " é igual a " + 
                               "String " + nome2);
        }else{
             System.out.println("\nA String " + nome1 + " não é igual a " + 
                               "String " + nome2);
        }
    }
    
}
