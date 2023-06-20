package guia5;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAMIR
 */
public class Guia5Teoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crea un vector llamado ‘Equipo’ cuya dimensión sea la 
        //cantidad de compañeros de equipo y define su tipo de dato de tal manera
        //que te permita alojar sus nombres más adelante.
        Scanner leer = new Scanner(System.in);
        String[] Equipo = new String[8];
        for (int i = 0; i < Equipo.length; i++) {
            System.out.println("Ingrese el nombre de la persona numero: " + (i+1));
            Equipo[i] = leer.nextLine();
        }
        for (String Equipo1 : Equipo) {
            System.out.println(Equipo1);
        }
    }
}
