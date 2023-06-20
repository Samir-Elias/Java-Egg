/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Barco;

/**
 *
 * @author SAMIR
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       AlquilerAmarres Aa = new AlquilerAmarres();
       Aa.crearAlquiler();
       System.out.println( Aa.toString());
    }
    
}
