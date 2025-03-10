import fatec.poo.model.Circulo;
import java.util.Scanner;

/**
 *
 * @author ltshi
 */
public class Aplic {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double raio;
        String unidade;
        
        System.out.print("Digite o raio do círculo: ");
        raio = entrada.nextDouble();
        
        System.out.print("Digite a unidade de medida do raio do círculo: ");
        unidade = entrada.next();
        
        Circulo objCirculo = new Circulo(unidade);
        objCirculo.setRaio(raio);
        
        System.out.println("\n\nDADOS DO CÍRCULO\n");
        System.out.println("Raio: " + raio + " " + objCirculo.getUnidadeMedida());
        System.out.println("Diâmetro: " + objCirculo.calcDiametro() + " " + objCirculo.getUnidadeMedida());
        System.out.println("Área: " + objCirculo.calcArea() + " " + objCirculo.getUnidadeMedida() + "²");
        System.out.println("Perímetro: " + objCirculo.calcPerimetro() + " " + objCirculo.getUnidadeMedida());
        
        
        
    }
    
}
