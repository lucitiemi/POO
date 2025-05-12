package fatec.poo.model;

/**
 *
 * @author ltshi
 */
public class ContaCorrente {
    private String numConta;
    private double saldo;
    private double valInicial;
    
    public ContaCorrente(String numCo, double valInic){
        numConta = numCo;
        valInicial = valInic;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumConta() {
        return numConta;
    }

    public double getValInicial() {
        return valInicial;
    }
    
    public void depositarValor(double val){
        saldo += val;
    }
    
    public void sacarValor(double val){
        saldo -= val;
    }
}
