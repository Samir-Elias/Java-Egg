/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

/**
 *
 * @author SAMIR
 */
public class Guia5Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Realizar un algoritmo que llene un vector con los 100 primeros números
        //enteros y los muestre por pantalla en orden descendente.
        
        int[] vector = new int[100];
        System.out.println("De 0 a 100");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = i + 1;
            System.out.println(vector[i]);
        }
        System.out.println("De 100 a 0");
        for (int i = vector.length - 1; i >= 0; i--) {
            System.out.println(vector[i]);
        }
    }
}


















//        int Vector[]= new int[100];
//        for (int i = 0; i < Vector.length; i++) {
//            Vector[i] = i + 1;
//        }
//        for (int i = Vector.length - 1; i >= 0 ; i--) {
//                 System.out.println(Vector[i]);
//
//        }
//    }
//}
