package fatec.poo.model;

/**
 *
 * @author ltshi
 */
public class PedidoCompra {
    private int numero;
    private String dataPedido;
    private double valor;
    private Pessoa pessoa;

    // construtor
    public PedidoCompra(int numero) {
        this.numero = numero;
    }

    // getters e setters
    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public int getNumero() {
        return numero;
    }
    public String getDataPedido() {
        return dataPedido;
    }
    public double getValor() {
        return valor;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    
    
    
}
