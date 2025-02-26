
/**
 *
 * @author 0030482321006
 */
public class Exemplo2 {
    public static void main(String[] args) {
        int x;
        
        x = (int)(Math.random()*100);
        
        // ESTRUTURA CONDICIONAL IF
        if (x < 50){
            System.out.println("O valor " + x + " e menor que 50");
        }else{
            System.out.println("O valor " + x + " e maior ou igual a 50");
        }
    }
}
