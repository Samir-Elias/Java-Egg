package guia5;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAMIR
 */
public class Guia5Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Realice un programa que compruebe si una matriz dada es antisimétrica
        //Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta,
        //pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz traspuesta 
        //de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de filas y columnas");
        int n = leer.nextInt();
        int [][] matriz = new int [n][n];
        System.out.println("La matriz ingresada es: ");
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random()*10);
                System.out.print(" [" + matriz[i][j] + "] ");
            }System.out.println(" ");
        }System.out.println("Su matriz traspuesta es: ");
        
        for (int j = 0; j < matriz.length; j++) {
            for (int[] matriz1 : matriz) {
                System.out.print(" [" + matriz1[j] + "] ");
            }
System.out.println(" ");
    }
    }
    
}
