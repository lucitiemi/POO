package fatec.poo.model;

/**
 *
 * @author ltshi
 */
public class FuncionarioComissionado extends Funcionario{
    private double salBase;
    private double taxaComissao;
    private double totalVendas;
    
    // construtor
    public FuncionarioComissionado(int r, String n, String dtAdm, double tx){
        super(r, n, dtAdm);
        taxaComissao = tx;
    }
    
    // getters e setters
    public void setSalBase(double sb){
        salBase = sb;
    }
    
    public double getSalBase(){
        return salBase;
    }
    
    public double getTotalVendas(){
        return totalVendas;
    }
    
    public double getTaxaComissao(){
        return taxaComissao;
    }
    
    // outros metodos
    public void addVendas(double v){
        totalVendas += v;
    }    

    @Override
    public double calcSalBruto() {
        return (salBase + (taxaComissao/100)*totalVendas);
    }
    
    public double calcGratificacao(){
        if(totalVendas <= 5000){
            return 0;
        }else if(totalVendas > 10000){
            return calcSalBruto()*.05;
        }else{
            return calcSalBruto()*.03;
        }

    }
    
    @Override
    public double calcSalLiquido(){
        return (super.calcSalLiquido() + calcGratificacao());
    }
}
