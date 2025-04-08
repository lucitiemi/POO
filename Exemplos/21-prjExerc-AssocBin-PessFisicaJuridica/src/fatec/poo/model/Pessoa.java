package fatec.poo.model;

/**
 *
 * @author ltshi
 */
public abstract class Pessoa {
    private String nome;
    private int anoInscricao;
    private double totalCompras;
    private PedidoCompra[] pedidos;
    private int numPed;
    
    // construtor
    public Pessoa(String n, int a){
        nome = n;
        anoInscricao = a;
        pedidos = new PedidoCompra[10];
        numPed = 0;
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
        pedidos[numPed] = p;
        numPed++;
        totalCompras += p.getValor();
    }
    public void listarPedidos() {
        int cont=0;
        
        System.out.println("\nNUMERO     DATA                      VALOR");
        System.out.println("----------------------------------------------------------");

        for (cont = 0; cont < numPed; cont++) {
            System.out.printf("%-12s %-25s %-20s\n",
                pedidos[cont].getNumero(),
                pedidos[cont].getDataPedido(),
                pedidos[cont].getValor());
        }
        
    }
    
}
