package fatec.poo.model;

/**
 *
 * @author ltshi
 */
public class PessoaFisica extends Pessoa {
    private String cpf;
    private double base;
    
    // construtor
    public PessoaFisica(String c, String n, int a){
        super(n, a);
        cpf = c;
    }
    
    // getters e setters
    public String getCpf(){
        return cpf;
    }
    public void setBase(double b){
        base = b;
    }
    public double getBase(){
        return base;
    }
    
    // outros metodos
    @Override
    public double calcBonus(int a) {
        if(getTotalCompras() > 12000){
            return (a - getAnoInscricao()) * base;
        } else {
            return 0;
        }
    }
    
}
