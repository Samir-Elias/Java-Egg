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
public class Libro {

    //Crear una clase llamada Libro que contenga los siguientes atributos:
    //ISBN, Título, Autor, Número de páginas, y un constructor con todos los atributos
    //pasados por parámetro y un constructor vacío u. Crearn método para cargar un libro
    //pidiendo los datos al usuario y luego informar mediante otro método el número de ISBN, el
    //título, el autor del libro y el número de páginas.
   Scanner leer = new Scanner (System.in);
    public int ISBN;
    public String Titulo;
    public String Autor;
    public int cantPag; 
    
//    public Libro() {
//        System.out.println("Ingrese ISBN");
//        ISBN =leer.nextInt();
//        System.out.println("Ingrese Titulo");
//        Titulo = leer.nextLine();
//        System.out.println("Ingrese Autor");
//        Autor = leer.nextLine();
//    }
     public Libro(int ISBN, String Titulo, String Autor, int cantPag) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.cantPag = cantPag;
        
     }

    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public int getCantPag() {
        return cantPag;
    }
    
}
