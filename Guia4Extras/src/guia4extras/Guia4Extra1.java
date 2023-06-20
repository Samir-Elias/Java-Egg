/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4extras;

import java.util.Scanner;

/**
 *
 * @author SAMIR
 */
public class Guia4Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Implementar una función que permita obtener un número entero aleatorio 
        //comprendido entre dos límites que introduciremos por teclado. El número obtenido se debe mostrar por pantalla.
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los dos limites");
        int num1 = leer.nextInt(); 
        int num2 = leer.nextInt();
        aleatorio(num1, num2);
    }
    public static int aleatorio(int num1, int num2){
        int num = Math.random(num1,num2);
    }
            
}
