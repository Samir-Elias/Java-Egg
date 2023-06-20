/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Barco;

/**
 *
 * @author SAMIR
 */
public class Yate extends Barco {
    private int potenciaCV;
    private int numeroCamarotes;

    public Yate() {
    }
    

    public Yate(String matricula, double eslora, int anioFabricacion, int potenciaCV, int numeroCamarotes) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
        this.numeroCamarotes = numeroCamarotes;

    }
    public Yate crearYate(){
        super.crearBarco();
        System.out.println("Ingrese potencia en CV");
        potenciaCV = leer.nextInt();
        
        System.out.println("Ingrese numero de camarotes");
        numeroCamarotes = leer.nextInt();
        
        return new Yate(matricula, eslora, anioFabricacion, potenciaCV, numeroCamarotes);
    }

    @Override
    public String toString() {
        super.toString();
        return "Yate{" + "potenciaCV=" + potenciaCV + ", numeroCamarotes=" + numeroCamarotes + '}';
    }
    @Override
    public double calcularModulo(){
        return super.calcularModulo() + potenciaCV + numeroCamarotes;
    }
}
