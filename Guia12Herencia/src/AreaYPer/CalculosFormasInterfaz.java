/*

 */
package AreaYPer;


public interface CalculosFormasInterfaz {
    
    static final double PI = 3.14d;
    
    /*  La palabra clave static indica que el atributo pertenece a la interfaz 
    en sí misma y no a las instancias de las clases que implementan la interfaz. 
    La palabra clave final indica que el valor del atributo no puede ser modificado
    una vez que se le ha asignado un valor.*/
    
    public double calcularAreaInt();
    
    public double calcularPerimetroInt();
    
}
