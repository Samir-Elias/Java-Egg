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
public class Guia3Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
        // Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
        //* * * *
        //*     *
        //*     *
        //* * * *
         Scanner leer = new Scanner (System.in);
         int num;
         System.out.println("Ingrese un numero");
         num = leer.nextInt();
         for (int i = 0; i < num; i++) {
             for (int j = 0; j < num; j++) {
                 if ((i == 0) || (i == num-1)||(j == 0) || (j == num-1)){
                 System.out.print(" *");// " " espacio separa asteriscos
             }else
                 System.out.print("  ");// espacio interior
             }System.out.println("");// salto de linea para asteriscos
        }System.out.println("");
    }
    
}
