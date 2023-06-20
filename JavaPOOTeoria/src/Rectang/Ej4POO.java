/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectang;

import java.util.Scanner;

/**
 *
 * @author SAMIR
 */
public class Ej4POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese las medidas de base y altura del rectangulo");
        Rectangulo N1 = new Rectangulo(leer.nextInt(),leer.nextInt());
        N1.getBase();
        N1.getAltura();
        for (int i = 0; i < N1.getBase(); i++) {
            for (int j = 0; j < N1.getAltura(); j++) {
                System.out.print("*");
            }System.out.println(" ");
        }
    }
    
}
