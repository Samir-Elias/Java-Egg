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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Escribir un programa que pida tu nombre, lo guarde en una 
       // variable y lo muestre por pantalla.
       Scanner leer = new Scanner(System.in); 
       System.out.println("Ingrese su nombre");
       String Nombre;
       String Nombre2;
       Nombre2= "";
       Nombre = leer.next();
       Nombre2 = Nombre; 
       System.out.println("Tu nombre es: " + Nombre2);
    }
    
    
}
