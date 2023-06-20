/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Barco;

/**
 *
 * @author SAMIR
 */
public class Velero extends Barco {
    private int numeroMastiles;

    public Velero() {
    }

    public Velero(String matricula, double eslora, int anioFabricacion, int numeroMastiles) {
        super(matricula, eslora, anioFabricacion);
        this.numeroMastiles = numeroMastiles;
    }
    public Velero crearVelero(){
        
        super.crearBarco();
        
        System.out.println("Ingrese numero de mastiles");
        numeroMastiles = leer.nextInt();
        
        return new Velero(matricula, eslora, anioFabricacion, numeroMastiles);
    }
    
//        public double calcularModulo(){

    @Override
    public String toString() {
        super.toString();
        return "Velero{" + "numeroMastiles=" + numeroMastiles + '}';
    }
    @Override
    public double calcularModulo(){
        int aux;
        aux = (int) (super.calcularModulo() + numeroMastiles);
        return aux;
        
}
}
