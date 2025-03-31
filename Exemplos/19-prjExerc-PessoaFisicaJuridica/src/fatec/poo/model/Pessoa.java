package fatec.poo.model;

/**
 *
 * @author ltshi
 */
public abstract class Pessoa {
    private String nome;
    private int anoInscricao;
    private double totalCompras;
    
    // construtor
    public Pessoa(String n, int a){
        nome = n;
        anoInscricao = a;
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
    
    public void addCompras(double c){
        totalCompras += c;
    }
}
