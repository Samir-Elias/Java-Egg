/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Circulo;

import java.util.Scanner;

/**
 *
 * @author SAMIR
 */
public class MainCircunf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            Scanner leer = new Scanner(System.in);
           
            System.out.println("Ingrese el radio a buscar");
          
            Circunferencia Radio1 = new Circunferencia(leer.nextDouble());
            
            System.out.printf("el area de la circunferencia es: %.2f \n", Radio1.Area());
            System.out.printf("el perimetro de la circunferencia es: %.2f \n",Radio1.Perimetro());
            System.out.println("el radio era: "+Radio1.getRadio());
    }
    
}
