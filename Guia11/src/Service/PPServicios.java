/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Perro;
import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author SAMIR
 */
public class PPServicios {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        Persona a = new Persona();
        System.out.println("Ingrese el nombre de la persona");
        a.setNombre(leer.next());
        System.out.println("Ingrese apellido");
        a.setApellido(leer.next());
        System.out.println("Ingrese su edad");
        a.setEdad(leer.nextInt());
        System.out.println("Ingrese numero de Documento");
        a.setDni(leer.nextInt());
        // de la misma forma se ingresan los demas datos
        return a;

    }

    public Perro crearPerro() {
        Perro b = new Perro();
        System.out.println("Ingrese el nombre del perro");
        b.setNombre(leer.next());
        System.out.println("Ingrese la edad");
        b.setEdad(leer.nextInt());
        System.out.println("Ingrese raza");
        b.setRaza(leer.next());
        System.out.println("Ingrese el tamaño del perro");
        b.setTamaño(leer.next());
        // de la misma forma se ingresan los demas datos
        return b;

    }
 
}
