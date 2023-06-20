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
public class Guia3Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escriba un programa que pida una frase o palabra y valide si la primera 
        // letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se debera 
        // de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario,
        // se deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y
        // equals() de Java.
        Scanner leer = new Scanner(System.in);
        String frase;
        do{
         System.out.println("Ingrese una frase o palabra");
         frase = leer.nextLine();
         frase = frase.toUpperCase();
         if (frase.substring(0,1).compareTo("A")!=0){
             System.out.println("Incorrecto");
         }
        }while (frase.substring(0,1).compareTo("A")!=0);
    System.out.println("Correcto");
}
}
 