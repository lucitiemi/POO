
import fatec.poo.model.PedidoCompra;
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
        
        /*
        PessoaFisica pf = new PessoaFisica("322", "Luciana", 2001);
        pf.setBase(150);
        System.out.print("Digite o ano atual: ");
        a = (entrada.nextInt());
        
        PedidoCompra pedido = new PedidoCompra(1010);
        pedido.setValor(15000);
        pedido.setDataPedido("15/02/2022");


        pedido.setPessoa(pf);
        pf.addPedido(pedido);
        
        pf.listarPedidos();
        
        */
               
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
               
        PedidoCompra[] cadPedidos = new PedidoCompra[10];
        
        
        System.out.println("\n-- PEDIDOS DE COMPRAS --");
        
        System.out.print("Digite quantas compras serão lançadas (1 a 10): ");
        int qtde = entrada.nextInt();
        System.out.println("");
        
        for(int cont=0; cont<qtde; cont++){
            System.out.print("\nDigite o numero do pedido: ");
            int numero = entrada.nextInt();
            cadPedidos[cont] = new PedidoCompra(numero);
            
            System.out.print("Digite o valor da compra: ");
            double valor = entrada.nextDouble();
            cadPedidos[cont].setValor(valor);
            
            System.out.print("Digite a data do pedido: ");
            String data = entrada.next();
            cadPedidos[cont].setDataPedido(data);
            
            System.out.print("Digite 1 para pessoa física ou 2 para pessoa jurídica: ");
            int tipo = entrada.nextInt();
            
            do {
                switch (tipo){
                    case 1:
                        pf.addPedido(cadPedidos[cont]);
                        break;
                    case 2:
                        pj.addPedido(cadPedidos[cont]);
                        break;
                    default:
                        System.out.println("Valor inválido");
                        tipo = 0;
                }
            } while (tipo == 0);

        }  

        
        System.out.println("\n----------------------------------------");
        
        System.out.println("\nPEDIDOS LANÇADOS\n");
        
        for (int cont=0; cont<qtde; cont++){
            System.out.println("-- Pedido número " + cadPedidos[cont].getNumero());
            System.out.println("Data pedido:       " + cadPedidos[cont].getDataPedido());
            System.out.println("Valor pedido:      " + cadPedidos[cont].getValor());
            System.out.println("Pedido feito por:  " + cadPedidos[cont].getPessoa().getNome());
            System.out.println("");
        }
        
        System.out.println("\n----------------------------------------");
        
        System.out.println("\nRESUMO PESSOA FÍSICA");
        System.out.println("Nome:              " + pf.getNome());
        System.out.println("CPF:               " + pf.getCpf());
        System.out.println("Ano de Inscrição:  " + pf.getAnoInscricao());
        System.out.println("Base:              " + df.format(pf.getBase()));
        System.out.println("Total compras:     " + df.format(pf.getTotalCompras()));
        System.out.println("Bônus:             " + df.format(pf.calcBonus(a)));
        
        System.out.println("\n\nRESUMO PESSOA JURÍDICA");
        System.out.println("Nome:              " + pj.getNome());
        System.out.println("CGC:               " + pj.getCgc());
        System.out.println("Ano de Inscrição:  " + pj.getAnoInscricao());
        System.out.println("Taxa de Incentivo: " + df.format(pj.getTaxaIncentivo()) + "%");
        System.out.println("Total compras:     " + df.format(pj.getTotalCompras()));
        System.out.println("Bônus:             " + df.format(pj.calcBonus(a))); 
        
    }  
}
