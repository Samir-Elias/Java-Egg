/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Barco;

/**
 *
 * @author SAMIR
 */
public class BarcoMotor extends Barco {
    private int potenciaCV;

    public BarcoMotor() {
    }

    public BarcoMotor(String matricula, double eslora, int anioFabricacion, int potenciaC) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }
    public BarcoMotor crearBarcoMotor(){
        super.crearBarco();
        
        System.out.println("Ingrese la potencia en CV");
        potenciaCV = leer.nextInt();
        
        return new BarcoMotor(matricula, eslora, anioFabricacion, potenciaCV);
    }

    @Override
    public String toString() {
        super.toString();
        return "BarcoMotor{" + "potenciaCV=" + potenciaCV + '}';
    }
    @Override
    public double calcularModulo(){
        return super.calcularModulo() + potenciaCV;
    }
}
