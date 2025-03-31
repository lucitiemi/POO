package fatec.poo.model;

/**
 *
 * @author ltshi
 */
public class PessoaJuridica extends Pessoa {
    private String cgc;
    private double taxaIncentivo; // porcentagem
    
    
    // construtor
    public PessoaJuridica(String c, String n, int a){
        super(n, a);
        cgc = c;
    }
    
    // getters e setters
    public void setTaxaIncentivo(double t){ 
        taxaIncentivo = t;
    }
    public String getCgc(){
        return cgc;
    }
    public double getTaxaIncentivo(){
        return taxaIncentivo;
    }
    
    // outros metodos
    @Override
    public double calcBonus(int a) {
        return (a - getAnoInscricao()) * getTotalCompras() * taxaIncentivo/100;
    }
}
