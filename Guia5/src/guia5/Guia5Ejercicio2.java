package guia5;


import java.util.Scanner;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAMIR
 */
public class Guia5Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Realizar un algoritmo que llene un vector de tamaño N con valores 
        //aleatorios y le pida al usuario un número a buscar en el vector.
        //El programa mostrará dónde se encuentra el numero y si se encuentra repetido//
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()* 9 + 1);// Para que no salga el numero 0 como aleatorio, se ingresa "9+1;
            System.out.println(vector[i]);
        }
        System.out.println("Ingrese un numero para buscar");
        
        int buscar;
        int aux = 0;
        buscar = leer.nextInt();
        for (int i = 0; i < vector.length; i++) {
            if(vector[i] == buscar){ // (condicion) si la posicion es igual al numero ingresado
                aux++;
                System.out.println("El numero se encontró en la posicion: " + (i+1));
            }
        }
        System.out.println("Encontro el numero = "+ buscar + " se encontró " + aux + " Veces");
    }
}



























//        System.out.println("Ingrese el tamaño del vector");
//        int n = leer.nextInt();
//        int[] vector = new int[n];
//        for (int i = 0; i < vector.length; i++) {
//            vector[i] = (int) (Math.random() * 10);
//        }
//        for (int i = 0; i < vector.length; i++) {
//            System.out.println(vector[i]);
//        }
//    }
//    
//}
