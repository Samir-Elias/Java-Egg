/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package IronMan;

/**
 *
 * @author SAMIR
 */
public class IronMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Armadura a = new Armadura(2, 2);
        a.correr(10);
        a.mostrarEstado();  
        System.out.println(a.getGenerador().getNivelBateria());
    }
    
}
