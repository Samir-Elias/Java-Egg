/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IronMan;

/**
 *
 * @author SAMIR
 */
class Repulsor {
    private double consumoDeEnergia;
    private boolean danios;
    public Repulsor(double consumoDeEnergia) {
        this.consumoDeEnergia = consumoDeEnergia;
        this.danios = false;
    }

    public Repulsor() {
    }

    public double getConsumoDeEnergia() {
        return consumoDeEnergia;
    }

    public void setConsumoDeEnergia(double consumoDeEnergia) {
        this.consumoDeEnergia = consumoDeEnergia;
    }

    public boolean isDanios() {
        return danios;
    }

    public void setDanios(boolean danios) {
        this.danios = danios;
    }

    public void usar(){
        
    }
}
