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
public class GuiaEjercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crea una aplicación que nos pida un número por teclado y con una función 
        //se lo pasamos por parámetro para que nos indique si es o no un número primo, 
        //debe devolver true si es primo, sino false.
        //Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
        //Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
       
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero");
        int numero = leer.nextInt();
        boolean esprimo = primo(numero);
        if(esprimo){
            System.out.println("es primo");
        }else{
            System.out.println("no es primo");
        }
    }
    public static boolean primo(int numero){
        
        if(1 >= numero){
            return false;
        } 
        for(int i=2;i<= Math.sqrt(numero);i++){
            if(numero%i==0){
                return false;
            }
        }
        return true;
    }
}
