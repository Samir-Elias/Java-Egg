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
public class Guia3Extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Una obra social tiene tres clases de socios:
        //Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
        //Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
        //Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
        //Solicite una letra (carácter) que representa la clase de un socio, y 
        //luego un valor real que represente el costo del tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho socio.
         Scanner leer = new Scanner(System.in);
         int num;
         double num1;
         String letra;
         do{
             System.out.println("Ingrese una clase");
             letra = leer.next();
             letra = letra.toUpperCase();
             System.out.println("Ingrese valor del tratamiento");
             num = leer.nextInt();
             num1 = (num*0.35);//se realiza la operacion
             switch (letra){
                 case "A":
                     System.out.println("Su cuota de: " + num + " tiene 50% de descuento. Su pago final es de: " + (num/2)+ " $.");
                     break;
                 case "B":
                                                                                                                //se resta el descuento.
                     System.out.println("Su cuota de: " + num + " tiene 35% de descuento. Su pago final es de: " + (num- num1)+ " $.");
                     break;
                 case "C":
                     System.out.println("Su cuota de: " + num + " NO recibe descuento. Su pago final es de: " + num + " $.");
                     break;
                 default:
                     System.out.println("Ingrese una clase correcta o la letra D para salir.");
    }
         }while(!(letra.contains("D")));
    }
    
}
