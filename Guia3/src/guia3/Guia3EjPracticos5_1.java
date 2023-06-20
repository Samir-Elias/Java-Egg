/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author SAMIR
 */
public class Guia3EjPracticos5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Realizar un programa que lea 4 números (comprendidos entre 1 y 20) 
// e imprima el número ingresado seguido de tantos asteriscos como indique su valor.
    Scanner leer = new Scanner(System.in);
    int num;
    int aux = 0;
    int ancho = 0;
    num = leer.nextInt();
    do  {
        System.out.println(" ");
        System.out.println("Ingrese un numero");
        
        ancho = num;
        for (int i = 0; i < ancho; i++) {          
                System.out.print("*");
                System.out.print(" ");
          }
         aux= aux + 1;
    }
    while(aux < 4);
    System.out.println(" ");   
    System.out.println("Se agotaron los intentos");
    
}
}
