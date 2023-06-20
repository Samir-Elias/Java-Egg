/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author SAMIR
 */
public class Guia5Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
        //donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que 
        //permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no. El programa 
        //deberá comprobar que los números introducidos son correctos, es decir, están entre el 1 y el 9.
        Scanner leer = new Scanner (System.in) ;
        
        System.out.print("Ingrese la dimensión de la matriz: ");
        int n = leer.nextInt() ;
        
        int matriz [] [] = new int [n][n] ;
        
        int suma0 = 0 ;
        int suma = 0 ;
        String resultado = "La matriz es mágica" ;
        
        // Lleno los valores
        for (int i = 0; i<n ; i++){
            for (int j=0 ; j<n ; j++){
                System.out.print("Ingrese el valor ["+ i +"] ["+ j +"] : ");
                matriz[i][j] = leer.nextInt();
            }
    }
        
        // Mostrar matriz
        for (int i = 0; i<n ; i++){
            for (int j=0 ; j<n ; j++){
                System.out.print(" "+matriz[i][j]+" ");
            }
            System.out.println("");
    }
        
        // Defino la variable suma
        for (int i = 0; i<n ; i++){
            suma0 = suma0 + matriz [0][i] ;
    }
        
        // Bucle for para verificar la suma por FILA
        for (int[] fila: matriz){
            for (int j=0 ; j<n ; j++){
                suma = suma + fila [j];
            }
            if (suma != suma0){
                resultado= "La matriz NO es mágica" ;
            }
            // Redeclaro la variable suma
            suma = 0 ;
    }

        // Bucle for para verificar la suma por COLUMNA
        for (int j=0 ; j<n ; j++){
            for (int i=0 ; i<n ; i++){
                
                suma = suma + matriz [i][j];
            }
            
            if (suma != suma0){
                resultado= "La matriz NO es mágica" ;
            }
            suma = 0 ;
    }
        
        // Bucle for para verificar la suma por DIAGONAL PRINCIPAL
        for (int i=0 ; i<n ; i++){
            
            suma = suma + matriz [i][i];
    }
        if (suma != suma0){
                resultado= "La matriz NO es mágica" ;
            }
        
        suma = 0 ;
        
        // Bucle for para verificar la suma por DIAGONAL INVERSA
        for (int i=0 ; i<n ; i++){
        for (int j=n-1 ; j>=0 ; j--){
            suma = suma + matriz[i][j];
                }
        if (suma != suma0){
            resultado= "La matriz NO es mágica" ;
        }
        suma = 0 ;
        }
        
        System.out.println(resultado);
    }
    
}
