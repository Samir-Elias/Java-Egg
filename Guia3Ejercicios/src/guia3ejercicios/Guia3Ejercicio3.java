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
public class Guia3Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realizar un programa que solo permita introducir solo frases o palabras 
        // de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo 
        // se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”
        // ,en caso contrario, se deberá imprimir “INCORRECTO”. Nota: 
        // investigar la función Lenght() en Java.
         Scanner leer = new Scanner(System.in);
         
         String frase;
         do{
         System.out.println("Ingrese una frase o palabra de 8 caracteres");
         frase = leer.nextLine();
         if(frase.length() != 8){
            System.out.println("Incorrecto");
         }else 
            System.out.println("Correcto");
         }while(frase.length() != 8);
    }   
    
}
