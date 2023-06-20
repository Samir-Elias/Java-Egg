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
public class Guia5Extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Crear una función rellene un vector con números aleatorios, pasándole
//        un arreglo por parámetro. Después haremos otra función o 
//        procedimiento que imprima el vector.

Scanner leer = new Scanner (System.in) ;
int n = leer.nextInt() ;

int vector [] = new int [n] ;

rellenar_vector(vector) ;

mostrar_vector(vector) ;
        
    }
    
    public static void rellenar_vector (int[] vector){
        int largo = vector.length ;
        for (int i=0 ; i < largo ; i++){
            vector[i] = (int) (Math.random()*9+1) ;
        }
    }
    
    public static void mostrar_vector (int[] vector){
        int largo = vector.length ;
        System.out.println("El largo del vector es: " + largo);
        for (int i=0 ; i < largo ; i++){
            System.out.print(" " + vector[i] + " "); 
        }
    }
    
}
