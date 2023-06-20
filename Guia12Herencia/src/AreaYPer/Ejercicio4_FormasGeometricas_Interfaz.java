/*

 */
package AreaYPer;

import AreaYPer.CirculoInt;
import AreaYPer.RectanguloInt;

public class Ejercicio4_FormasGeometricas_Interfaz {

    public static void main(String[] args) {
        
        CirculoInt circulo1 = new CirculoInt(5);
        RectanguloInt rectangulo1 = new RectanguloInt(10,5);
        
        System.out.printf(" La superficie de círculo es: %.2f", circulo1.calcularAreaInt() );
        System.out.printf("\n El perímetro de círculo es: %.2f", circulo1.calcularPerimetroInt() );
        
        
        System.out.printf("\n\n La superficie del rectángulo es: %.2f", rectangulo1.calcularAreaInt());
        System.out.printf("\n El perímetro de rectángulo es: %.2f", rectangulo1.calcularPerimetroInt() );
        System.out.println("");

    }
    
}
