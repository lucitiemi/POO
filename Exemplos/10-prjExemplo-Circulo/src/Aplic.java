import fatec.poo.model.Circulo;
import java.util.Scanner;

/**
 *
 * @author ltshi
 */
public class Aplic {
    public static void main(String[] args) {
        
        Circulo objCirculo = new Circulo();
        Scanner entrada = new Scanner(System.in);
        
        double raio;
        
        System.out.println("Digite o raio do círculo: ");
        raio = entrada.nextDouble();
        
        objCirculo.setRaio(raio);
        
        System.out.println("\n\nDADOS DO CÍRCULO\n");
        System.out.println("Raio: " + raio);
        System.out.println("Diâmetro: " + objCirculo.calcDiametro());
        System.out.println("Área: " + objCirculo.calcArea());
        System.out.println("Perímetro: " + objCirculo.calcPerimetro());
        
        
        
    }
    
}
