
import fatec.poo.model.Retangulo;
import java.util.Scanner;

/**
 *
 * @author ltshi
 */
public class Aplic {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Retangulo objRet = new Retangulo();
        double medAlt, medBase;
        
        System.out.println("Digite a medida da altura: ");
        medAlt = entrada.nextDouble();
        
        System.out.println("Digite a medida da base: ");
        medBase = entrada.nextDouble();
        
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
        
        System.out.println("");
        System.out.println("DADOS DO RETANGULO");
        System.out.println("Medida da Altura: " + objRet.getAltura());
        System.out.println("Medida da Base: " + objRet.getBase());
        System.out.println("Medida da Área: " + objRet.calcArea());
        System.out.println("Medida do Perímetro: " + objRet.calcPerimetro());
        System.out.println("Medida da Diagonal: " + objRet.calcDiagonal());
        
    }
    
}
