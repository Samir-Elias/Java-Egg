/*

 */
package AreaYPer;


public class RectanguloInt implements CalculosFormasInterfaz{
    
    private double base;
    private double altura;

    public RectanguloInt(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }


    @Override
    public double calcularAreaInt() {
        return base * altura;
    }

    @Override
    public double calcularPerimetroInt() {
        return (base + altura) * 2;        
    }


    
}
