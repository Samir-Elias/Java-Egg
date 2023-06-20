/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emplead0;

import java.util.Scanner;

/**
 *
 * @author SAMIR
 */

    public class Empleado {
    Scanner leer = new Scanner(System.in);
    private String nombre;
    private int edad;
    private double salario;

    public Empleado() {
    }
    
    
    public void ingresarDatos(){
        System.out.println("Ingrese nombre");
        nombre=leer.nextLine();
        System.out.println("Ingrese edad");
        edad=leer.nextInt();
        System.out.println("Ingrese salario");
        salario=leer.nextInt();
        
        
    }
    public void calcularAumento(){
        if(edad>=30){
            System.out.println("Como la edad es mayor que treinta hay un aumento del 10%");  
            System.out.println("El salario con su aumento es de "+(salario*1.10));
            
            
            
        }else{
            System.out.println("Como la edad es menor que treinta hay un aumento del 5%");  
            System.out.println("El salario con aumento es de "+(salario*1.05));
        }
        
        
        
        
    }
            
    
    
    
}

