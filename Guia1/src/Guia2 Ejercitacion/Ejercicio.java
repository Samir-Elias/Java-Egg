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
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner leer= new Scanner(System.in);
    int num1;
    int num2;
    System.out.println("Ingresar 2 numeros");
    num1 = leer.nextInt();
    num2 = leer.nextInt();
    int suma= num1 + num2;
        System.out.println("La suma de los numeros es de: "+ suma);
    
}
}
