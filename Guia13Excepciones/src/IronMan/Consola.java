/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IronMan;

import java.util.ArrayList;

/**
 *
 * @author SAMIR
 */
public class Consola {
    private double consumoDeEnergia;
    private String Mensaje;
            
    public Consola() {
    }

    public Consola(double consumoDeEnergia) {
        this.consumoDeEnergia = consumoDeEnergia;
    }

    public double getConsumoDeEnergia() {
        return consumoDeEnergia;
    }

    public void setConsumoDeEnergia(double consumoDeEnergia) {
        this.consumoDeEnergia = consumoDeEnergia;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }
    
    public void escribir(){
        
    }
}
