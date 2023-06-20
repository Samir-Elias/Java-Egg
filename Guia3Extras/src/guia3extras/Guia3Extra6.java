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
public class Guia3Extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Leer la altura de N personas y determinar el promedio de estaturas 
        //que se encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
        Scanner leer = new Scanner(System.in);
        int promedio = 0, aux = 0, num;
        double altura,promedio1 = 0, promedio2 = 0;
        System.out.println("Ingresar cantidad de personas");
        num=leer.nextInt();
        do{
            System.out.println("Ingresar la altura");
            altura = leer.nextDouble();
            aux = aux + 1;//total de alturas
            promedio2 = promedio2 + altura;//guarda alturas generales
            if (altura < 1.60){
                promedio = promedio + 1;//total de estaturas menores a 1.60
                promedio1= promedio1 + altura;//guarda alturas menores
            }
        }while(aux < num);//cierra al ciclo de cantidad de personas
        System.out.println("El promedio de estatura para los menores de 1.60mts es de: " + (promedio1/promedio)+ "mts.");//se dividen las alturas sumadas por la cantidad de enanos
        System.out.println("El promedio de estatura general es de: " + (promedio2/aux)+ "mts.");//se dividen las alturas por la cantidad de personas
    }
    
}
