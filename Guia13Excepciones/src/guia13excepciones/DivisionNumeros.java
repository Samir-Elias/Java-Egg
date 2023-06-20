/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia13excepciones;

/**
 *
 * @author SAMIR
 */
public class DivisionNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DivisionNumero dn = new DivisionNumero("10" , "0" );
        
        try {
            
        dn.dividir();
        
        }catch (ExceptionDividir e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
    
}
