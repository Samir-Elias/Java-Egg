/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author SAMIR
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un programa que lea un número entero por teclado y 
        //muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese el numero");
        num=leer.nextInt();
        System.out.println("El numero ingresado es: " + num);
        System.out.println("El doble del numero ingresado es: " + (num*2));
        System.out.println("El triple del numero ingresado es: " + (num*3));
        System.out.println("La raiz cuadrada del numero ingresado es: "+ (Math.sqrt(num)));
    }
    
}
