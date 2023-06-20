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
public class Guia3Extra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Escriba un programa que lea números enteros. Si el número es múltiplo 
        //de cinco debe detener la lectura y mostrar la cantidad de números leídos,
        //la cantidad de números pares y la cantidad de números impares. Al igual que en
        //el ejercicio anterior los números negativos no deben sumarse. Nota: recordar el uso de la sentencia break. 
        Scanner leer = new Scanner(System.in);
        int num, par = 0, impar = 0;
        do {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            if (num >= 0) {
                if (num % 2 == 0) {
                    par = par + 1;
                } else {
                    impar = impar + 1;
                }
            } else {
                System.out.println("El numero ingresado es negativo, ingrese uno positivo");
            }
        } while (num % 5 != 0);
        System.out.println("La cantidad de numeros pares es de: " + par);
        System.out.println("La cantidad de numeros impares es de: " + impar);
    }

}
