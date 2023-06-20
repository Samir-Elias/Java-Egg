/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author SAMIR
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dada una cantidad de grados centígrados se debe mostrar 
        // su equivalente en grados Fahrenheit. La fórmula correspondiente es: 
        // F = 32 + (9 * C / 5).
        Scanner Leer = new Scanner(System.in);
        int C;
        int F;
        System.out.println("Ingresar cantidad de grados centígrados");
        C = Leer.nextInt();
        F =  32 + (9 * C / 5);
        System.out.println("Sus Celsius son equivalentes a: " + F + " Farenheit");
    }
    
}
