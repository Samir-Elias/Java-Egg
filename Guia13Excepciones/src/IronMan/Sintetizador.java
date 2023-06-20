/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IronMan;

/**
 *
 * @author SAMIR
 */
public class Sintetizador {
    private double consumoDeEnergia;
    private String mensaje1;
    private Consola consola = new Consola();
    
    public Sintetizador() {
    }

    public Sintetizador(double consumoDeEnergia) {
        this.consumoDeEnergia = consumoDeEnergia;
        this.mensaje1 = consola.getMensaje();
    }

    public double getConsumoDeEnergia() {
        return consumoDeEnergia;
    }

    public void setConsumoDeEnergia(double consumoDeEnergia) {
        this.consumoDeEnergia = consumoDeEnergia;
    }

    public String getMensaje1() {
        return mensaje1;
    }

    public void setMensaje1(String mensaje1) {
        this.mensaje1 = mensaje1;
    }
    
    public void susurrar(){
        
    }
}
