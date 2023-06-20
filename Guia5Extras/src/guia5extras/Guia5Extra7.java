/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5extras;

import java.util.Scanner;

/**
 *
 * @author SAMIR
 */
public class Guia5Extra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//      Serie Fibonacci
//	1, 1, 2, 3, 5, 8, 13, 21, 34, ...
    Scanner leer = new Scanner (System.in);
    
        System.out.println("Ingrese el numero");
        int num = leer.nextInt();
        num1(num);
    }
    public static int num1(int num){
        int n1,n2,n3;
        n1=1;
        n2=1;
        for (int i = 1; i < num; i++) {
            System.out.println(n1);
            n3=n1 + n2;
            n1=n2;
            n2=n3;
        }
        return num;
    }
}
