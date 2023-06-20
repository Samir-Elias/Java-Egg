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
public class Guia3EjPracticos4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Escriba un programa que lea 20 números. Si el número leído es igual a
// cero se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero".
// El programa deberá calcular y mostrar el resultado de la suma de los números leídos,
// pero si el número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
    Scanner leer = new Scanner(System.in);
    int num;
    int suma = 0;//contenedor de suma
    int intentos = 0;//contador
    do {
        System.out.println("Ingrese numeros");
        num= leer.nextInt();
        
        if(num >= 0){//si el num es positivo se realiza la suma
        suma= suma + num;
        }else{
            break;//si es negativo se cierra el bucle
        }
        
        intentos = intentos + 1;//contador para limitar a 20 numeros
    }while (intentos <= 20 && num != 0);//20 numeros o desigualdad de 0
    if (num == 0){// si el numero es 0
        System.out.println("Se capturó el numero 0");
    }
        System.out.println("La suma de los numeros es: " + suma);
   }
}
