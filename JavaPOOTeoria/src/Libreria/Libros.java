/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria;

import java.util.Scanner;

/**
 *
 * @author SAMIR
 */
public class Libros {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in); 
      
        System.out.println("Bienvenido a la libreria Programar");
       
        System.out.println("Ingrese los siguientes datos del libro en orden ISBN, Título, Autor y Número de páginas");
        Libro L1 = new Libro(leer.nextInt(), leer.next(), leer.next(), leer.nextInt());
        
        System.out.println("Ingrese los siguientes datos del libro en orden ISBN, Título, Autor y Número de páginas");
        Libro L2 = new Libro(leer.nextInt(), leer.next(), leer.next(), leer.nextInt());
        
        int isbn = L1.getISBN();
        String titulo= L1.getTitulo();
        String autor = L1.getAutor();
        int paginas = L1.getCantPag();
        
        int isbn1 = L2.getISBN();
        String titulo1= L2.getTitulo();
        String autor1 = L2.getAutor();
        int paginas1 = L2.getCantPag();
        
        System.out.println(isbn + " " + titulo + " " + autor + " " + paginas);
        System.out.println(isbn1 + " " + titulo1 + " " + autor1 + " " + paginas1);
     }
}
