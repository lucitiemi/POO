package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author ltshi
 */
public abstract class Pessoa {
    private String nome;
    private int anoInscricao;
    private double totalCompras;
    private ArrayList<PedidoCompra> pedidos;
    
    // construtor
    public Pessoa(String n, int a){
        nome = n;
        anoInscricao = a;
        pedidos = new ArrayList<PedidoCompra>();
    }
    
    // getters e setters
    public String getNome(){
        return nome;
    }
    public int getAnoInscricao(){
        return anoInscricao;
    }
    public double getTotalCompras(){
        return totalCompras;
    }
    
    // outros metodos
    public abstract double calcBonus(int a);
    
    
    public void addPedido(PedidoCompra p){
        pedidos.add(p);
        totalCompras += p.getValor();
    }
    public void listarPedidos() {
        int cont=0;
        
        System.out.println("\nNUMERO     DATA                      VALOR");
        System.out.println("----------------------------------------------------------");

        for (cont = 0; cont < pedidos.size(); cont++) {
            System.out.printf("%-12s %-25s %-20s\n",
                pedidos.get(cont).getNumero(),
                pedidos.get(cont).getDataPedido(),
                pedidos.get(cont).getValor());
        }
        
    }
    
}
