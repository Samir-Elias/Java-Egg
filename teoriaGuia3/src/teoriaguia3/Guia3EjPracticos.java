/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoriaguia3;

import java.util.Scanner;

/**
 *
 * @author SAMIR
 */
public class Guia3EjPracticos {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        //  Implementar un programa que le pida dos números enteros al usuario 
        //  y determine si ambos o alguno de ellos es mayor a 25.
        Scanner leer = new Scanner (System.in);
        int num1;
        int num2;
        System.out.println("Ingresar numeros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        if (num1 > 25 && num2 > 25){
            System.out.println("Ambos numeros son mayores a 25");
        }else if(num1 > 25){
            System.out.println("El primer numero es mayor a 25");
        }else if(num2 > 25){
            System.out.println("El segundo numero es mayor a 25");
        }else{
            System.out.println("los numeros son menores a 25");
        }
    }
}
