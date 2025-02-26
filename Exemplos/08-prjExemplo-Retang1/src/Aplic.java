
import fatec.poo.model.Retangulo;

/**
 *
 * @author ltshi
 */
public class Aplic {
    public static void main(String[] args) {
        
        // Definição do ponteiro para o objeto
        Retangulo objRet, objRet1;
        
        // Instanciação (alocação) de um objeto a partir de uma classe
        objRet = new Retangulo();
        objRet1 = new Retangulo();
        
        // Passagem de mensagem
        objRet.setAltura(3.0);
        objRet.setBase(4.0);
        
        System.out.println("RETANGULO 1");
        System.out.println("Medida da Altura: " + objRet.getAltura());
        System.out.println("Medida da Base: " + objRet.getBase());
        System.out.println("Medida da Área: " + objRet.calcArea());
        System.out.println("Medida do Perímetro: " + objRet.calcPerimetro());
        System.out.println("Medida da Diagonal: " + objRet.calcDiagonal());
        
        objRet1.setAltura(7.0);
        objRet1.setBase(5.0);
        
        System.out.println("");
        System.out.println("RETANGULO 2");
        System.out.println("Medida da Altura: " + objRet1.getAltura());
        System.out.println("Medida da Base: " + objRet1.getBase());
        System.out.println("Medida da Área: " + objRet1.calcArea());
        System.out.println("Medida do Perímetro: " + objRet1.calcPerimetro());
        System.out.println("Medida da Diagonal: " + objRet1.calcDiagonal());
        
        
    }
    
}
