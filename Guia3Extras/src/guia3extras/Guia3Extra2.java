/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3extras;

/**
 *
 * @author SAMIR
 */
public class Guia3Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declarar cuatro variables de tipo entero A, B, C y D y asignarle un
        //valor diferente a cada una. A continuación, realizar las instrucciones 
        //necesarias para que: B tome el valor de C, C tome el valor de A,
        //A tome el valor de D y D tome el valor de B. Mostrar los valores
        //iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
             int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int aux;
        System.out.println("valor de a " + a);
        System.out.println("valor de b " + b);
        System.out.println("valor de c " + c);
        System.out.println("valor de d " + d);

        aux = b; 
        b = c; 
        c = aux;
        aux = d; 
        d = c; 
        c = a; 
        a = aux;
        System.out.println(" ---------------------------- ");
        System.out.println("valor de a " + a);
        System.out.println("valor de b " + b);
        System.out.println("valor de c " + c);
        System.out.println("valor de d " + d);

    }
    }
    

