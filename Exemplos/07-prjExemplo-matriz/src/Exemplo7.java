/**
 *
 * @author 0030482321006
 */
public class Exemplo7 {
    public static void main(String[] args) {
        
        // MATRIZ (inicializando ela com valores)
        int tabNum[] = {4,8,7,23,17,23,87};
        int cont;
        
        for(cont=0;cont<tabNum.length;cont++) {                         // propriedade lenght retorna o tamanho da matriz
            System.out.print("Conteudo de TabNum[" + cont + "]= ");
            System.out.println(tabNum[cont]);
        }
    }
    
}
