/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4teoriaej1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author SAMIR
 */
public class Guia4Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Diseñe una función que pida el nombre y la edad de N personas e 
        //imprima los datos de las personas ingresadas por teclado e indique si 
        //son mayores o menores de edad. Después de cada persona, el programa 
        //debe preguntarle al usuario si quiere seguir mostrando personas y 
        //frenar cuando el usuario ingrese la palabra “No”.
         Scanner leer = new Scanner (System.in);
         System.out.println("Ingrese la cantidad de personas");
         int n = leer.nextInt();
        String[] nombres = new String[n];
        int[] edad = new int[n];
        CargaVectores(nombres, edad);
        System.out.println(Arrays.toString(nombres));
        System.out.println(Arrays.toString(edad));
        MayorMenor(nombres, edad);
        
    }
    public static void CargaVectores(String[] nombres, int[] edad){
        Scanner leer = new Scanner (System.in);
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Ingresar nombre de la persona: " + (i+1));
            nombres[i] = leer.next();
            System.out.println("Ingresar edad de la persona: " + (i+1));
            edad[i] = leer.nextInt();
        }
    }
     public static void MayorMenor(String[] nombres ,int[] edad){
          Scanner leer = new Scanner (System.in);
          String sn;
          boolean op = true;
            do {
              for (int i = 0; i < nombres.length; i++) {
              if(edad[i] >= 18){
                 System.out.println(nombres[i] + " es mayor de edad");
             }else{
                  System.out.println(nombres[i]+ " es menor de edad");
              }
              if(i < nombres.length){
                System.out.println("Desea continuar S/N");
                sn = leer.next();
                 if(sn.equalsIgnoreCase("N")){
                  op = false;
                  break;
              }
             }
             }
         } while (op);          
     }
}