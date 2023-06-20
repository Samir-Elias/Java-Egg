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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   // Escribir un programa que lea un número entero por teclado y 
   // muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
    Scanner Leer = new Scanner(System.in);
    double numero, doble, triple, raiz;
    numero = Leer.nextInt();
    doble = numero * 2;
    triple = numero * 3;
    raiz = Math.sqrt(numero);
        System.out.println("El numero ingresado es: " + numero );
        System.out.println("El doble del numero es: " + doble);
        System.out.println("El Triple del numero es: " + triple);
        System.out.println("La raiz cuadrada del numero es: " + raiz);
    
    }
    
}
