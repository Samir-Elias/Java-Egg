/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matematicas;

import java.util.Scanner;

/**
 *
 * @author SAMIR
 */
public class Ej3POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los dos numeros");
        Operacion N1 = new Operacion(leer.nextInt(),leer.nextInt());
        System.out.println("La suma de los numeros es igual a: " + N1.sumar());
        System.out.println("La resta de los numeros es igual a: " + N1.restar());
        System.out.println("La division de los numeros es igual a: " + N1.dividir());
        System.out.println("La multiplicacion de los numeros es igual a: " + N1.multiplicar());
        
    }
    
}
