/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3extras;

import java.util.Scanner;

/**
 *
 * @author SAMIR
 */
public class Guia3Extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Elaborar un algoritmo en el cuál se ingrese una letra y 
        //se detecte si se trata de una vocal. Caso contrario mostrar un mensaje. 
        //Nota: investigar la función equals() de la clase String.
         Scanner leer = new Scanner(System.in);
         String letra;
         do{
             System.out.println("Ingrese una letra");
             letra = leer.next();
             letra = letra.toLowerCase();
             if((letra.equals("a"))||(letra.equals("e"))||(letra.equals("i"))||(letra.equals("o"))||(letra.equals("u"))){
                System.out.println("La letra: " + letra + "es una vocal");
         }else
             System.out.println("no es una vocal");
         }while (!(letra.contains("b")));// sale del bucle con la b
    }
    
}
