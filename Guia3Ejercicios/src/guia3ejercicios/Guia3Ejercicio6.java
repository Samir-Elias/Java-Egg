/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3ejercicios;

import java.util.Scanner;

/**
 *
 * @author SAMIR
 */
public class Guia3Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Realizar un programa que pida dos números enteros positivos 
        //por teclado y muestre por pantalla el siguiente menú:El usuario deberá 
        //elegir una opción y el programa deberá mostrar el resultado por 
        //pantalla y luego volver al menú. El programa deberá ejecutarse 
        //hasta que se elija la opción 5. Tener en cuenta que, si el 
        //usuario selecciona la opción 5, en vez de salir del programa 
        //directamente, se debe mostrar el siguiente mensaje de confirmación:
        //¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona
        //el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
int n1, n2, opt   ;
        String sn= "N";
        
        Scanner leer = new Scanner (System.in);
        
        do {
        System.out.println("Ingrese el número 1");
        n1 = leer.nextInt();
        System.out.println("Ingrese el número 2");
        n2 = leer.nextInt();
        System.out.println("");
        System.out.println("Elija una opción"+"\n Menú"+"\n 1. Suma"+"\n 2. Resta"+"\n 3. Multiplicar"+"\n 4. Dividir \n 5. Salir");
        opt = leer.nextInt();
        
        switch (opt) {
                case 1:
                    System.out.print("La Suma es ");
                    System.out.println(n1 + n2);
                    break;
                case 2:
                    System.out.print("La Resta es ");
                    System.out.println(n1 - n2);
                    break;
                case 3:
                    System.out.print("La Multiplicacion es ");
                    System.out.println(n1 * n2);
                    break;
                case 4:
                    System.out.print("La Dividición es ");
                    System.out.println(n1 / n2);
                    break;
                case 5:
                    System.out.println("Quiere Salir del Programa S/N");
                    sn = leer.next();
                    sn = sn.toUpperCase();
                    if ("S".equalsIgnoreCase(sn)) {
                        //option = false;
                        System.out.println("Ha salido");
                    } else {
                        System.out.println("Continue navegando");
                    }
                    break;
                default:
                    System.out.println("Opcion Incorrecta , Vuelva a Ingresar");
            }
        }while (sn.equalsIgnoreCase("N") || opt!=5 );
    }
}