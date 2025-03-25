
import fatec.poo.model.FuncionarioComissionado;
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
        FuncionarioHorista funcHor = new FuncionarioHorista(1010, "Pedro Silveira", "14/05/1978", 15.80);
        FuncionarioMensalista funcMens = new FuncionarioMensalista(1011, "Marcia Oliveira", "06/12/2000", 1200.00);
        FuncionarioComissionado funcComis = new FuncionarioComissionado(1020, "Alexandre Soares", "20/03/2020", 5);
        
        funcHor.setQtdeHorTrab(90);
        funcHor.setCargo("Auxiliar de produção");
        
        funcMens.setNumSalMin(5);
        funcMens.setCargo("Gerente");
        
        funcComis.setSalBase(2000);
        funcComis.addVendas(12000);
        funcComis.setCargo("Vendedor");
        
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
        
        System.out.println("\nFUNCIONARIO COMISSIONADO");
        System.out.println("Registro:        " + funcComis.getRegistro());
        System.out.println("Nome:            " + funcComis.getNome());
        System.out.println("Data Admissão:   " + funcComis.getDtAdminissao());
        System.out.println("Cargo:           " + funcComis.getCargo());
        System.out.println("Salário Bruto:   " + df.format(funcComis.calcSalBruto()));
        System.out.println("Total Vendas:    " + funcComis.getTotalVendas());
        System.out.println("Desconto:        " + df.format(funcComis.calcDesconto()));
        System.out.println("Gratificação:    " + df.format(funcComis.calcGratificacao()));
        System.out.println("Salário Líquido: " + df.format(funcComis.calcSalLiquido()));
        
    }
    
}
