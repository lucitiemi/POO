
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import java.text.DecimalFormat;

/**
 *
 * @author ltshi
 */
public class Aplic {
    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("#,##0.00");
        FuncionarioHorista funcHor = new FuncionarioHorista(1010, "Pedro Silveira", "14/05/1978", "Auxiliar de produção", 15.80);
        FuncionarioMensalista funcMens = new FuncionarioMensalista(1011, "Marcia Oliveira", "06/12/2000", "Gerente", 1200.00);
        
        funcHor.setQtdeHorTrab(90);
        funcMens.setNumSalMin(5);
        
        System.out.println("\nFUNCIONARIO HORISTA");
        System.out.println("Registro:        " + funcHor.getRegistro());
        System.out.println("Nome:            " + funcHor.getNome());
        System.out.println("Data Admissão:   " + funcHor.getDtAdminissao());
        System.out.println("Cargo:           " + funcHor.getCargo());
        System.out.println("Salário Bruto:   " + df.format(funcHor.calcSalBruto()));
        System.out.println("Desconto:        " + df.format(funcHor.calcDesconto()));
        System.out.println("Gratificação:    " + df.format(funcHor.calcGratificacao()));
        System.out.println("Salário Líquido: " + df.format(funcHor.calcSalLiquido()));
        
        System.out.println("\nFUNCIONARIO MENSALISTA");
        System.out.println("Registro:        " + funcMens.getRegistro());
        System.out.println("Nome:            " + funcMens.getNome());
        System.out.println("Data Admissão:   " + funcMens.getDtAdminissao());
        System.out.println("Cargo:           " + funcMens.getCargo());
        System.out.println("Salário Bruto:   " + df.format(funcMens.calcSalBruto()));
        System.out.println("Desconto:        " + df.format(funcMens.calcDesconto()));
        System.out.println("Salário Líquido: " + df.format(funcMens.calcSalLiquido()));
        
    }
    
}
