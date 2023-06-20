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
public class Guia5Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Escriba un programa que averigüe si dos vectores de N enteros son 
        //iguales (la comparación deberá detenerse en cuanto se detecte alguna diferencia
        //entre los elementos).
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el tamaño de los vectores: ");
        int n = leer.nextInt();System.out.println("Ingrese el tamaño de los vectores: ");
        int[] vector1 = new int[n];
        int[] vector2 = new int[n];
        int num, num1;
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el valor del espacio: " + (i+1));
            num = leer.nextInt();
            vector1[i] = num;
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el valor del espacio: " + (i+1));            
            num1 = leer.nextInt();
            vector2[i] = num1;            
        }
        for (int i = 0; i < n; i++) {
            System.out.print("[" + vector1[i] + "]");
            System.out.print("[" + vector2[i] + "]");
            if (vector1[i] != vector2[i] ) {
                System.out.println(" Los elementos son diferentes");
                break;
            }else{
                System.out.println(" Los Elementos son iguales.");
            }
        }System.out.println(" ");
        
    }
    
}
