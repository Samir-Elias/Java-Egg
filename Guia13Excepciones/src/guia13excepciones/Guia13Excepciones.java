/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia13excepciones;

import com.sun.javafx.geom.Vec2d;

/**
 *
 * @author SAMIR
 */
public class Guia13Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Vec[] = {1,2,3,4};
        try{
            
        System.out.println(Vec[5]);
        
        }catch(Exception ex){
            
            ex.printStackTrace();
            System.out.println("No se encontro el numero");
        }
    }
    
}
