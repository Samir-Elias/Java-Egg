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
public class Guia3Extras13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear un programa que dibuje una escalera de números, donde cada 
        //línea de números comience en uno y termine en el número de la línea. 
        //Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:
        //1
        //12
        //123
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese la altura de la escalera");
        num = leer.nextInt();
        for (int i = 1; i < num + 1; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j);
            }System.out.println("");
        }
    }
    
}
