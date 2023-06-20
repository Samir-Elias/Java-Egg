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
public class Guia5Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Recorrer un vector de N enteros contabilizando cuántos 
        // números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el largo del vector");
        int n = leer.nextInt();
        int[] vector = new int[n];
        int num1 = 0,num2 = 0,num3 = 0,num4 = 0,num5 = 0;
        int cantidad;
        
        for (int i = 0; i <= n-1; i++) {
            vector[i] = (int) (Math.random()*10000);
            System.out.println(vector[i]);
        }
        
        for (int i = 0; i < n; i++) {
        String cadena = String.valueOf(vector[i]);// Se convierte cada valor de vector[i] a cadena
        cantidad = cadena.length();// se verifica la cantidad de digitos 
        switch (cantidad){
            case 1:
                num1++;
                break;
            case 2:
                num2++;
                break;
            case 3:
                num3++;
                break;
            case 4:
                num4++;
                break;
            case 5:
                num5++;
                break;
        }
       
        }
        System.out.println("La cantidad de 1 digito son: " + num1);
        System.out.println("La cantidad de 2 digitos son: " + num2);
        System.out.println("La cantidad de 3 digitos son: " + num3);
        System.out.println("La cantidad de 4 digitos son: " + num4);
        System.out.println("La cantidad de 5 digitos son: " + num5);
    }
    
}
