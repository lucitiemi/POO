package fatec.poo.model;

/**
 *
 * @author ltshi
 */
public class FuncionarioMensalista extends Funcionario {
    private double valSalMin;
    private double numSalMin;
    
    public FuncionarioMensalista(int r, String n, String dtAdm, double vsm){
        super(r, n, dtAdm);
        valSalMin = vsm;
    }
    
    public void setNumSalMin(double nsm){
        numSalMin = nsm;
    }
    
    // aplicacao do polimorfismo
    @Override
    public double calcSalBruto(){
        return (valSalMin * numSalMin);
    }
    
    @Override
    public double calcSalLiquido(){
        return (calcSalBruto() - calcDesconto());
    }
}
