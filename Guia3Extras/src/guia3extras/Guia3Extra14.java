/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3extras;

import java.util.Scanner;

/**
 *
 * @author SAMIR
 */
public class Guia3Extra14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se dispone de un conjunto de N familias, cada una de las cuales 
        //tiene una M cantidad de hijos. Escriba un programa que pida la cantidad 
        //de familias y para cada familia la cantidad de hijos para averiguar la 
        //media de edad de los hijos de todas las familias.
        Scanner leer = new Scanner (System.in);
        int n, m, h, suma = 0, suma2 = 0;
        System.out.println("Ingrese la cantidad de familias");
        n = leer.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la cantidad de hijos para la familia " + (i+1));
            m = leer.nextInt();
            suma = suma + m;
            for (int j = 0; j < m; j++) {
                System.out.println("Ingrese la edad del hijo" + (j+1));
                h = leer.nextInt();
                suma2 = suma2 + h;
            }
        }
        System.out.println("La media de edad de los hijos es de: " + suma2/suma);
    }
    
}
