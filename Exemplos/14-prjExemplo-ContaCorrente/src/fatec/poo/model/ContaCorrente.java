package fatec.poo.model;

/**
 *
 * @author ltshi
 */
public class ContaCorrente {
    private int numero;
    private double saldo;
    
    public ContaCorrente(int num, double sal){
        numero = num;
        saldo = sal;
    }
    
    public int getNumero(){
        return numero;
    }
    public double getSaldo(){
        return saldo;
    }
    
    public void sacar(double valor){
        saldo -= valor; //saldo = saldo - valor;
    }
    public void depositar(double valor){
        saldo += valor;  //saldo = saldo + valor;
    }
    
    
}
