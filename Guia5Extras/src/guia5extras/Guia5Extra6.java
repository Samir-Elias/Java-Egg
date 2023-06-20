/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5extras;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author SAMIR
 */
public class Guia5Extra6 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
 // Definir las palabras que se utilizarán en la sopa de letras
        Scanner leer = new Scanner(System.in);
        String[] palabras = new String[5];
        for (int i = 0; i < palabras.length; i++) {
            String palabra = "";
            while (palabra.length() < 3 || palabra.length() > 5) {
                System.out.print("Ingrese una palabra de 3 a 5 caracteres: ");
                palabra = leer.nextLine();
            }
            palabras[i] = palabra;
        }
        
        // Definir el tamaño de la sopa de letras
        int tamanio = 20;
        
        // Seleccionar la fila aleatoria en la que se ubicarán las palabras
        Random random = new Random();
        int fila = random.nextInt(tamanio);
        
        // Crear la matriz que representará la sopa de letras
        char[][] sopa = new char[tamanio][tamanio];
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                sopa[i][j] = (char)(random.nextInt(10) + '0'); // generar número aleatorio del 0 al 9 como char
            }
        }
        
        // Ubicar las palabras en la fila seleccionada
        int x = random.nextInt(tamanio - palabras[0].length() + 1);
        for (int i = 0; i < palabras[0].length(); i++) {
            sopa[fila][x + i] = palabras[0].charAt(i);
        }
        
        // Rellenar los espacios vacíos con números aleatorios
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                if (sopa[i][j] == '\u0000') { // verificar si el elemento es nulo
                    sopa[i][j] = (char)(random.nextInt(10) + '0');
                }
            }
        }
        
        // Imprimir la sopa de letras
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println();
        }
        
        leer.close();
    }
}