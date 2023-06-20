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
public class Guia3Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dado un tiempo en minutos, calcular su equivalente en días y horas. 
        // Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular 
        // su equivalente: 1 día, 2 horas.
        Scanner leer = new Scanner(System.in);
        int tiempo, horas = 0, dias = 0;
        System.out.println("Ingresar cantidad de minutos");
        tiempo = leer.nextInt();
        while (tiempo > 0){
            if (tiempo >= 1440){
                dias = dias + 1;
                tiempo = tiempo - 1440;
            }else if(tiempo >= 60){
                horas = horas + 1;
                tiempo = tiempo - 60; 
            }else
                tiempo = tiempo - 1;
        }
        System.out.println("Los minutos son igual a: " + dias + " días, " + horas + " horas y "+ tiempo + " minutos.");
    }
}
