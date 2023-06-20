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
public class Guia3Extra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Realice un programa para que el usuario adivine el resultado de una
        //multiplicación entre dos números generados aleatoriamente entre 0 y 10. 
        //El programa debe indicar al usuario si su respuesta es o no correcta.En caso 
        //que la respuesta sea incorrecta se debe permitir al usuario ingresar su 
        //respuesta nuevamente.
        //Para realizar este ejercicio investigue como utilizar la función Math.random() de Java
        Scanner leer = new Scanner(System.in);
        int num, numeroaleatorio = (int)
        (Math.random() * 11) * (int)(Math.random() * 11);
        System.out.println(numeroaleatorio);
        do{
            System.out.println("Ingrese numeros hasta encotrar el correcto");
            num = leer.nextInt();
            if (num != numeroaleatorio){
                System.out.println("Numero incorrecto");
            }else
                break;
        }while (num != numeroaleatorio);
        System.out.println("Encontraste el numero correcto.");
    }

}
