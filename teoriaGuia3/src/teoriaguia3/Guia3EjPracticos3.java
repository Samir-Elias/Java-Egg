/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoriaguia3;

import java.util.Scanner;

/**
 *
 * @author SAMIR
 */
public class Guia3EjPracticos3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Escriba un programa que valide si una nota está entre 0 y 10,
// sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
    Scanner leer = new Scanner (System.in);
    int nota;
    System.out.println("Ingrese una nota");
    nota = leer.nextInt();
         while(nota < 0 || nota > 10){
            System.out.println("Ingrese una nota correcta");
            nota = leer.nextInt();
            
    }
         if (nota >= 0 && nota<= 10){
             System.out.println("la nota es correcta");
         }
            
     
    }
    
}
