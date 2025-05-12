package fatec.poo.model;

/**
 *
 * @author ltshi
 */

public class Retangulo {
    private double altura;
    private double base;
    private String unidadeMedida;
    
    public Retangulo (String uniMed){
        unidadeMedida = uniMed;
    }
    
    public void setAltura(double a) {
        altura = a;
    }
    
    public void setBase(double b) {
        base = b;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public double getBase() {
        return base;
    }
    
    public String getUniMed() {
        return unidadeMedida;
    }
    
    public double calcArea() {
        return(altura*base);
    }
    
    public double calcPerimetro() {
        return((altura+base)*2);
    }
    
    public double calcDiagonal() {
        return (Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2)));
    }
}
