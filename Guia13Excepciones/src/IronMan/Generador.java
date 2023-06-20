/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IronMan;

/**
 *
 * @author SAMIR
 */
public class Generador {
    private double capacidadMaxima;
    private double nivelBateria;

    public Generador() {
    }

    public Generador(double capacidadMaxima, double nivelBateria) {
        this.capacidadMaxima = 100;
        this.nivelBateria = 100;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(double nivelBateria) {
        this.nivelBateria = nivelBateria;
    }
    
    public void consumirEnergia(int t){
        
        nivelBateria -= t;
        
        if (nivelBateria - t <= 0) {
            System.out.println("No queda bateria");
        }
    }
    public void recargarBateria(){
        
        System.out.println("Perfecto, recargando bateria.");
        setNivelBateria(100);
    }
}
