/*

 */
package AreaYPer;


public class CirculoInt implements CalculosFormasInterfaz{
    
    private double radio;

    public CirculoInt(double radio) {
        this.radio = radio;
    }
    
    

    @Override
    public double calcularAreaInt() {
        return CalculosFormasInterfaz.PI *  (radio * radio);
     }

    @Override
    public double calcularPerimetroInt() {
        return CalculosFormasInterfaz.PI *  (radio + radio);
     }
    
//    method does not override or implement a method from a supertype
//    El método no anula ni implementa un método de un supertipo

    
}