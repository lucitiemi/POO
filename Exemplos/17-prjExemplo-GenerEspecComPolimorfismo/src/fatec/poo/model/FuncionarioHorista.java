package fatec.poo.model;

/**
 *
 * @author ltshi
 */
public class FuncionarioHorista extends Funcionario {
    private double valHorTrab;
    private int qtdeHorTrab;
    
    public FuncionarioHorista(int r, String n, String dtAdm, double vht){
        super(r, n, dtAdm);
        valHorTrab = vht;
    }
    
    public void setQtdeHorTrab(int qht){
        qtdeHorTrab = qht;
    }
    
    // aplicacao do polimorfismo
    @Override
    public double calcSalBruto(){
        return (qtdeHorTrab * valHorTrab);
    }
    
    public double calcGratificacao(){
        return (calcSalBruto() * 0.075);
    }
    
    // aplicacao do polimorfismo - sobrescrevendo parcialmente o código 
    @Override
    public double calcSalLiquido(){
        return (super.calcSalLiquido() + calcGratificacao());
    }
}
