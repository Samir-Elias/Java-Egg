/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia13excepciones;

import java.util.Scanner;

/**
 *
 * @author SAMIR
 */
public class DivisionNumero {
    Scanner leer = new Scanner(System.in);
    
    private String num1;
    private String num2;

    public DivisionNumero(String num1, String num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public void dividir() throws ExceptionDividir{
        
        int numero1 = Integer.parseInt(num1);
        int numero2 = Integer.parseInt(num2);
        if (numero2 == 0) {
            throw new ExceptionDividir("No se puede dividir por 0");
        }
        int total = numero1 / numero2;
        
        System.out.println("El total es de: "+ total);
    }
    
}
