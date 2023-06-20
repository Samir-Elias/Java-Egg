/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Points;

import java.util.Scanner;

/**
 *
 * @author SAMIR
 */
public class Ej2ExtraPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar los valores de x e y del primer punto y luego del segundo");
        
        Puntos p1 = new Puntos(leer.nextDouble(),leer.nextDouble(), leer.nextDouble(),leer.nextDouble());
        
        System.out.println("La distancia entre el primer punto x: " +p1.getX1() + " y el primer punto y: " + p1.getY1());
        System.out.println("La distancia entre el segundo punto x: " +p1.getX2() + " y el segundo punto y: " + p1.getY2());
        System.out.println("Es de: " + p1.calcularDistancia());
    }
    
}
