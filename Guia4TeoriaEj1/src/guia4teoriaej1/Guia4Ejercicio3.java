/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4teoriaej1;

import java.util.Scanner;

/**
 *
 * @author SAMIR
 */
public class Guia4Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crea una aplicación que a través de una función nos convierta una cantidad
        //de euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. 
        //función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será una cadena,
        //este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
        //El cambio de divisas es:  
        // * 0.86 libras es un 1 €
        // * 1.28611 $ es un 1 €
        // * 129.852 yenes es un 1 €
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce la cantidad de euros a convertir: ");
        double cantidad = sc.nextDouble();
        
        System.out.print("Introduce la moneda a la que quieres convertir (dolares, yenes o libras): ");
        String moneda = sc.next();
        
        conversor(cantidad, moneda);
    }
    public static void conversor(double cantidad, String moneda) {
        double cambio;
        switch(moneda) {
            case "dolares":
                cambio = cantidad * 1.28611;
                System.out.println(cantidad + " euros equivale a " + cambio + " dolares.");
                break;
            case "yenes":
                cambio = cantidad * 129.852;
                System.out.println(cantidad + " euros equivale a " + cambio + " yenes.");
                break;
            case "libras":
                cambio = cantidad * 0.86;
                System.out.println(cantidad + " euros equivale a " + cambio + " libras.");
                break;
            default:
                System.out.println("Moneda no reconocida. Por favor, introduce dolares, yenes o libras.");
                break;
        }
}
}

