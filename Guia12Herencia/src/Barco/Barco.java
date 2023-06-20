/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Barco;

import java.util.Scanner;

/**
 *
 * @author SAMIR
 */
public class Barco {
    
    protected String matricula;
    protected double eslora;
    protected int anioFabricacion;
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Barco() {
    }

    public Barco(String matricula, double eslora, int anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
    
    public Barco crearBarco(){
        System.out.println("Ingrese matricula");
        matricula = leer.next();
        
        System.out.println("Ingrese eslora (double)");
        eslora = leer.nextDouble();

        System.out.println("Ingrese año de fabricacion");
        anioFabricacion = leer.nextInt();
        
        return new Barco(matricula, eslora, anioFabricacion);
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", anioFabricacion=" + anioFabricacion + '}';
    }
    
    public double calcularModulo(){
        return eslora * 10;
    }
}
