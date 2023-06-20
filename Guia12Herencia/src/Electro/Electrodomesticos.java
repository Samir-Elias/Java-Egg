/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Electro;

import java.util.Scanner;

/**
 *
 * @author SAMIR
 */
public class Electrodomesticos {
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected String nombreProd;
    protected int precio;
    protected String color;
    protected String consumoEnergetico;
    protected int peso;

    public  Electrodomesticos() {
    }

    public Electrodomesticos(String nombreProd, int precio, String color, String consumoEnergetico, int peso) {
        this.nombreProd = nombreProd;
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public String getNombreProd() {
        return nombreProd;
    }

    public void setNombreProd(String nombreProd) {
        this.nombreProd = nombreProd;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public void comprobarConsumoEnergetico(String consumo){
        String aux = consumo;
        
        if (!(aux.equalsIgnoreCase("A") || aux.equalsIgnoreCase("B") || aux.equalsIgnoreCase("C") || aux.equalsIgnoreCase("D") || aux.equalsIgnoreCase("E"))) {
            System.out.println("La letra es incorrecta, fue modificada por una: F");  
            setConsumoEnergetico("F"); 
        }
        
    }
    public void comprobarColor(String color){
        if (!(color.equalsIgnoreCase("negro")|| color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris") || color.equalsIgnoreCase("negro"))) {
            System.out.println("Color ingresado incorrecto, fue modificado por: Blanco ");
            setColor("blanco");
        }
        if (color.equalsIgnoreCase("negro")|| color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris") || color.equalsIgnoreCase("negro")) {
            setColor(color);
        }
    }
//    Metodo crearElectrodomestico(): le pide la información al usuario y llena el
//electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
//precio se le da un valor base de $1000.
    
    public Electrodomesticos crearElectrodomestico(){
        System.out.println("Ingrese el nombre del producto");
        String nombreProd = leer.next();
        System.out.println("Ingrese el Peso del producto");
        int peso = leer.nextInt();
        System.out.println("Ingrese el color del producto");
        String color = leer.next();
        comprobarColor(color);
        System.out.println("Ingrese el Consumo del producto");
        String consumoEnergetico1 = leer.next();
        comprobarConsumoEnergetico(consumoEnergetico1);
        return new Electrodomesticos(nombreProd, 1000, color, consumoEnergetico1 ,peso);
    }
    
    public void precioFinal(){
        System.out.println("");
        System.out.println("Producto: "+ getNombreProd());
        System.out.println("El precio inicia en: $1000");
                setPrecio(1000);
        switch (getConsumoEnergetico()) {
            case "A":
                setPrecio(getPrecio()+1000);
                break;
            case "B":
                setPrecio(getPrecio()+800);
                break;
            case "C":
               setPrecio(getPrecio()+600);
                break;
            case "D":
                setPrecio(getPrecio()+500);
                break;
            case "E":
                setPrecio(getPrecio()+300);
                break;
            case "F":
               setPrecio(getPrecio()+100);
                break;
        }
        System.out.println("El precio del producto: "+ getNombreProd() + ", sumado al precio de su categoria energetica: " + getConsumoEnergetico() + " es de: " + getPrecio() + "$");
           
            if (getPeso() > 1 && getPeso() <= 19) {
            setPrecio(getPrecio()+ 100);
            }
            if (getPeso() > 20 && getPeso() <= 49) {
            setPrecio(getPrecio()+ 500);
            }
            if (getPeso() > 50 && getPeso() <= 79) {
            setPrecio(getPrecio()+ 800);
            }
            if  (getPeso() > 80) {
            setPrecio(getPrecio()+ 1000);
        }
         System.out.println("El precio del producto: "+ getNombreProd() + ", sumado el precio por peso: "+ getPeso() +" es de: " + getPrecio() + "$");
    }
}

class Lavadora extends Electrodomesticos{
    int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, String nombreProd, int precio, String color, String consumoEnergetico, int peso) {
        super(nombreProd, precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    public void llenarLavadora(){
        crearElectrodomestico();
        System.out.println("Ingrese capacidad de carga");
        setCarga(leer.nextInt());
    }
 
    @Override    
    public void precioFinal() {
        super.precioFinal();   
        if (getCarga() > 30) {
            System.out.println("Se aumenta $1000 al precio del producto: "+ getNombreProd());
            setPrecio(getPrecio()+ 1000);
        }else{
            System.out.println("La carga es menor, no se incrementa el precio");
        }
            System.out.println("El precio Final de la Lavadora es de: " + getPrecio() + "$");

    }
    }

class Televisor extends Electrodomesticos{
double resolucion;
boolean TDT;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean TDT, String nombreProd, int precio, String color, String consumoEnergetico, int peso) {
        super(nombreProd, precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    public void crearTelevisor(){
        crearElectrodomestico();
        System.out.println("Ingrese la resolucion (double)");
        setResolucion(leer.nextInt());
        System.out.println("¿Tiene sintonizador TDT? - Ingrese V O F");
        String vof = leer.next();
        if (vof.equalsIgnoreCase("V")) {
            TDT = true;
        }
        
    }

@Override
    public void precioFinal(){
        super.precioFinal();        
        double aux;
        if (getResolucion() > 40) {
        aux = getPrecio() * 0.30;
        setPrecio(getPrecio() + (int) aux);
        System.out.println("La resolución del Televisor: "+ getNombreProd() + "es mayor de 40 pulgadas, se le aumentará 30% el precio");
    }
    if (TDT == true) {
        System.out.println("El televisor: "+ getNombreProd() + " Contiene Sintonizador, se aumentan 500$ al precio.");
        setPrecio(getPrecio() + 500);
    }
    System.out.println("El precio Final del Televisor marca: "+ getNombreProd() + " es de: " + getPrecio() + "$");
}
}

