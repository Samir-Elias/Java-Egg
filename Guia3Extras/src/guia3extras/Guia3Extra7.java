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
public class Guia3Extra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Realice un programa que calcule y visualice el valor máximo,
        //el valor mínimo y el promedio de n números (n>0). El valor de n se 
        //solicitará al principio del programa y los números serán introducidos
        //por el usuario. Realice dos versiones del programa, una usando el bucle
        //“while” y otra con el bucle “do - while”.
        Scanner leer = new Scanner(System.in);
        double n, min, max, prom, num, i = 1;
         System.out.println("Ingrese el valor de n");
            n = leer.nextDouble();
            System.out.println("Ingrese los valores dentro de n");
            num = leer.nextDouble();            
            min = num;
            max = num;
            prom = num;
        do { 
            System.out.println("Ingrese los valores dentro de n");
            num = leer.nextDouble();
            prom = prom + num;
            if (num < min){
                min = num;
            }else if(num > max){
                max = num;
            }
             i = i + 1;
        } while (i < n);
        System.out.println("El valor maximo ingresado es: " + max);
        System.out.println("El valor minimo ingresado es: " + min);
        System.out.println("El promedio de los numeros ingresados es de: " + (prom/n));
        
        
    
    }
    
}
