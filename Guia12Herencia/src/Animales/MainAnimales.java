/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Animales;

import java.util.ArrayList;

/**
 *
 * @author SAMIR
 */
public class MainAnimales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Declaracion del objeto Perro
    Animal perrol = new Perro("Stich", "Carnivoro", 15, "Doberman");
    perrol.Alimentarse();

    //Declaracién de otro objeto Perro
    Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
    perro2.Alimentarse();

    //Declaracion del objeto Gato
    Animal gatol = new Gato("Pelusa", "Galletas", 15, "Siamés");
    gatol.Alimentarse();

    //Declaracion del objeto Caballo
    Animal caballol = new Caballo("Spark", "Pasto", 25, "Fino");
    caballol.Alimentarse();

    }
    
}
