/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5extras;

import java.util.Scanner;

/**
 *
 * @author SAMIR
 */
public class Guia5Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Realizar un algoritmo que calcule la suma de todos los elementos de 
        //un vector de tamaño N, con los valores ingresados por el usuario.
        Scanner leer = new Scanner ( System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        int [] vector = new int[n];
        int num;
        int suma = 0;
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el valor de la posicion: " + i);
            num = leer.nextInt();
            vector[i] = num;
            suma = suma + num;
        }
        System.out.println("Los valores ingresados son: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "]");
        }System.out.println("");
        System.out.println("La suma de los numeros es de: " + suma);
    }
    
}
