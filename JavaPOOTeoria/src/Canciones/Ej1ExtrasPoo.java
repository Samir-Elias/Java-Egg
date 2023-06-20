/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Canciones;

import java.util.Scanner;

/**
 *
 * @author SAMIR
 */
public class Ej1ExtrasPoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Titulo y Autor de la cancion");
        
        Cancion C1 = new Cancion(leer.nextLine(), leer.nextLine());
        
        C1.getAutor();
        C1.getTitulo();
        
        System.out.println("El nombre de la canción es: " + C1.getTitulo());
        System.out.println("El nombre del autor es: " + C1.getAutor());
    }
    
}
