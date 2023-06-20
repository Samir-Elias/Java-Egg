/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3ejercicios;

import java.util.Scanner;

/**
 *
 * @author SAMIR
 */
public class Guia3Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escriba un programa en el cual se ingrese un valor limite positivo, 
        // y a continuación solicite números al usuario hasta que la suma de los 
        // numeros introducidos supere el limite inicial.
         Scanner leer = new Scanner(System.in);
         int num, suma = 0, num1;
         System.out.println("Ingrese un valor limite");
         num1=leer.nextInt();
         do {
             System.out.println("Ingrese un numero");
             num = leer.nextInt();
             suma = suma + num;
        } while (suma < num1 );
        System.out.println("Se superó el límite inicial");
    }
    
}
