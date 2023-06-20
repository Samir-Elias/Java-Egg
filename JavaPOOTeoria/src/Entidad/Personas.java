/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import javapooteoria.Persona;

/**
 *
 * @author SAMIR
 */
public class Personas {
       public static void main(String[] args) {
           Persona P1 = new Persona("Mariano", 20, 42300183);
           String nombre = P1.getNombre();
           int edad = P1.getEdad();
           int dni = P1.getDNI();
           System.out.println(nombre + " " + edad + " " + dni);
           P1.setNombre("Juan");
           System.out.println(P1.Nombre);
    }
    
}
//        Persona primeraPersona = new Persona();
//        primeraPersona.Nombre="Mariano";
//        primeraPersona.Edad=20;
//        primeraPersona.DNI=23877679;
//        
//        Persona segundaPersona = new Persona();
//        segundaPersona.Nombre = "Jorge";
//        segundaPersona.Edad = 33;
//        segundaPersona.DNI = 20876564;
//        
//        Persona terceraPersona = new Persona();
//        terceraPersona.Nombre = "Agustin";
//        terceraPersona.Edad = 18;
//        terceraPersona.DNI = 20392172;
//        System.out.println(primeraPersona.Nombre +" " + primeraPersona.Edad + " " + primeraPersona.DNI);
//        System.out.println(segundaPersona.Nombre +" " + segundaPersona.Edad + " " + segundaPersona.DNI);
//        System.out.println(terceraPersona.Nombre +" " + terceraPersona.Edad + " " + terceraPersona.DNI);