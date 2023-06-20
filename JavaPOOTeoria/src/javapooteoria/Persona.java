/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooteoria;

/**
 *
 * @author SAMIR
 */
public class Persona {
    public String Nombre;
    public int Edad;
    public int DNI;
    public Persona(String Nombre, int Edad, int DNI) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.DNI = DNI;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public int getDNI() {
        return DNI;
    }
    
  }
