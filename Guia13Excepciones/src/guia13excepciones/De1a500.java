/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia13excepciones;

import java.util.Scanner;

/**
 *
 * @author SAMIR
 */
public class De1a500 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        int numeroFinal = 150;
        int numeroTemporal = 0;
        
        int cantIntentos = 0;

        do {
            System.out.println("Adivine el numero");

            try {

                numeroTemporal = Integer.parseInt(leer.nextLine()); 
                cantIntentos += 1;
                
                if (numeroTemporal < numeroFinal) {
                    System.out.println("Ingrese un numero mayor");
                } else if (numeroTemporal > numeroFinal) {
                    System.out.println("Ingrese un numero menor");
                }

            } catch (Exception ex) {
                System.out.println("El valor ingresado no es un numero");
            } 
        } while (numeroTemporal != numeroFinal);

        System.out.println("Encontró el numero: " + numeroFinal);
    }
}
