
import fatec.poo.model.PessoaFisica;
import fatec.poo.model.PessoaJuridica;
import java.text.DecimalFormat;

import java.util.Scanner;

/**
 *
 * @author ltshi
 */
public class Aplic {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String c, n;
        int a;
               
        System.out.println("-- ENTRADA DE DADOS - PESSOA FÍSICA --");
        System.out.print("Digite o nome: ");
        n = entrada.next();
        System.out.print("Digite o ano de inscrição: ");
        a = entrada.nextInt();
        System.out.print("Digite o cpf: ");
        c = entrada.next();
        
        PessoaFisica pf = new PessoaFisica(c, n, a);
        
        System.out.println("\n-- ENTRADA DE DADOS - PESSOA JURÍDICA --");
        System.out.print("Digite o nome: ");
        n = entrada.next();
        System.out.print("Digite o ano de inscrição: ");
        a = entrada.nextInt();
        System.out.print("Digite o cgc: ");
        c = entrada.next();
        
        PessoaJuridica pj = new PessoaJuridica(c, n, a);
        
        System.out.println("\n----------------------------------------");
        
        System.out.print("Digite o valor base para pessoa física: ");
        pf.setBase(entrada.nextDouble());
        System.out.print("Digite a taxa de incentivo para pessoa jurídica: ");
        pj.setTaxaIncentivo(entrada.nextDouble());
        System.out.print("Digite o ano atual: ");
        a = (entrada.nextInt());
        
        System.out.println("\n----------------------------------------");
        
        
        // implementar o while!!!
        
        
        System.out.println("\nRESUMO PESSOA FÍSICA");
        System.out.println("Nome:              " + pf.getNome());
        System.out.println("CPF:               " + pf.getCpf());
        System.out.println("Ano de Inscrição:  " + pf.getNome());
        System.out.println("Base:              " + df.format(pf.getBase()));
        System.out.println("Total compras:     " + df.format(pf.getTotalCompras()));
        System.out.println("Bônus:             " + df.format(pf.calcBonus(a)));
        
        System.out.println("\n\nRESUMO PESSOA JURÍDICA");
        System.out.println("Nome:              " + pj.getNome());
        System.out.println("CGC:               " + pj.getCgc());
        System.out.println("Ano de Inscrição:  " + pj.getNome());
        System.out.println("Taxa de Incentivo: " + df.format(pj.getTaxaIncentivo()) + "%");
        System.out.println("Total compras:     " + df.format(pj.getTotalCompras()));
        System.out.println("Bônus:             " + df.format(pj.calcBonus(a)));
        
        
        
    }
    
}
