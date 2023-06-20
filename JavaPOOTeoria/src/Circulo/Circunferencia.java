/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Circulo;

/**
 *
 * @author SAMIR
 */
public class Circunferencia {
    
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double Area(){
        return Math.pow(Math.PI * radio,2);          
    }
    public double Perimetro(){      
        return 2 * Math.PI * radio;  
    }
}



//    public Circunferencia(double radio) {
//        this.radio = radio;
//        
//    }
//    public void setRadio(int radio) {
//        this.radio = radio;
//    }
//    
//    public double getRadio() {
//        return radio;
//    }
//    
//    public double Area(){
//     
//        return Math.pow(Math.PI * radio,2);
//    }
//    
//    public double Perimetro(){
//        return 2 * Math.PI * radio;
//    }
//}