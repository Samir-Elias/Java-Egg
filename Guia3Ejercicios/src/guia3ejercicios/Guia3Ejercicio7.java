/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3ejercicios;

import java.util.Scanner;

/**
 *
 * @author SAMIR
 */
public class Guia3Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
        //este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas 
        //deben llegar con un formato fijo: tienen que ser de un máximo de 5 
        //caracteres de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
        //Las secuencias leídas que respeten el formato se consideran correctas, la secuencia 
        //especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia 
        //distinta de FDE, que no respete el formato se considera incorrecta.
        //Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
        //correctas e incorrectas recibidas. Para resolver el ejercicio deberá
        //investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
         Scanner leer = new Scanner (System.in);
         String cadena;
         
         String FDE = "&&&&&";
         int cont1 = 0, cont2= 0;
         System.out.println("Dispositivo RS232");
         do{
             System.out.println("Ingrese una frase de 5 caracteres");
             cadena= leer.next();
             cadena = cadena.toUpperCase();
         if ((cadena.length()== 5) && (cadena.substring(0,1).equals("X")) && (cadena.substring(4).equals("O"))){
             cont1= cont1 + 1;
         }else if (!(cadena.equals(FDE))){
             cont2= cont2 + 1;
         }         
        }while(!(cadena.equals(FDE)));
         System.out.println("Cantidad de cadenas correctas" + cont1);
         System.out.println("Cantidad de cadenas incorrectas" + cont2);
    }
    
}
