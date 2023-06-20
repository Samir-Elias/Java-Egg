/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IronMan;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author SAMIR
 */
public class Armadura {

    Scanner leer = new Scanner(System.in);
    private String colorPrim;
    private String colorSec;
    private Propulsor Propulsores[];
    private Repulsor Repulsores[];
    private Generador generador;
    private Consola consola = new Consola();
    private Sintetizador sintetizador = new Sintetizador();
    private int resistencia;
    private int salud;

    private int cantPropulsores;
    private int cantRepulsores;

    public Armadura() {

    }
public Armadura( int cantPropulsores, int cantRepulsores) {
      
        this.Propulsores = new Propulsor[cantRepulsores];
        this.Repulsores = new Repulsor[cantRepulsores];
        this.generador = new Generador(100, 100);
        this.salud = 100;
    }

//    public Armadura(String colorPrim, String colorSec, Propulsor[] propulsores, Repulsor[] Repulsores, Generador generador, Sintetizador sintetizador, int resistencia, int salud, int cantPropulsores, int cantRepulsores) {
//        this.colorPrim = colorPrim;
//        this.colorSec = colorSec;
//        this.Propulsores = new Propulsor[cantRepulsores];
//        this.Repulsores = new Repulsor[cantRepulsores];
//        this.generador = new Generador();
//        this.sintetizador = new Sintetizador();
//        this.resistencia = 100;
//        this.salud = 100;
//    }

    public String getColorPrim() {
        return colorPrim;
    }

    public void setColorPrim(String colorPrim) {
        this.colorPrim = colorPrim;
    }

    public String getColorSec() {
        return colorSec;
    }

    public void setColorSec(String colorSec) {
        this.colorSec = colorSec;
    }

    public Propulsor[] getPropulsores() {
        return Propulsores;
    }

    public void setPropulsores(Propulsor[] Propulsores) {
        this.Propulsores = Propulsores;
    }

    public Repulsor[] getRepulsores() {
        return Repulsores;
    }

    public void setRepulsores(Repulsor[] Repulsores) {
        this.Repulsores = Repulsores;
    }

    public Generador getGenerador() {
        return generador;
    }

    public void setGenerador(Generador generador) {
        this.generador = generador;
    }

    public Sintetizador getSintetizador() {
        return sintetizador;
    }

    public void setSintetizador(Sintetizador sintetizador) {
        this.sintetizador = sintetizador;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public void caminar(int tiempo) {
        System.out.println("Cuanto tiempo va a caminar");

        int x = tiempo * 1;

        generador.consumirEnergia(x);

        System.out.println("Caminando");

        sufriendoDanios();

    }

    public void correr(int tiempo) {

        int x = tiempo * 2;

        generador.consumirEnergia(x);

        System.out.println("Corriendo");

        sufriendoDanios();

    }

    public void propulsar(int tiempo) {

        int x = tiempo * 3 * Propulsores.length;

        generador.consumirEnergia(x);

        System.out.println("Propulsando");

        sufriendoDanios();

    }

    public void volar(int tiempo) {
        int x = tiempo * 5 * Propulsores.length * Repulsores.length;

        generador.consumirEnergia(x);

        System.out.println("Volando");

        sufriendoDanios();

    }

    public void usarGuantesComoArmas(int tiempo) {

        int x = tiempo * 3;

        generador.consumirEnergia(x);

        System.out.println("Disparando");

        sufriendoDanios();
    }

    public void escribir() {
        System.out.println("Ingrese nota para la consola");
        String frase = leer.next();
        consola.setMensaje(frase);
    }

    public void leer() {
        System.out.println("El mensaje de la consola es: "+ consola.getMensaje());
    }

    public void mostrarEstado() {
        System.out.println("El estado de la armadura es del: " + salud + "%");
    }

    public void estadoBateria() {
        System.out.println("El nivel de bateria es de: " + generador.getNivelBateria() + "%");
    }

    public void informacionReactor() {

    }

    public void sufriendoDanios() {
        Random rd = new Random();
        int danios = rd.nextInt(101);
        int restaSalud = rd.nextInt(40);

        if (danios <= 30) {
            salud -= restaSalud;
            System.out.println("El daño recibido es de: " + restaSalud);

            if (salud <= 0) {
                System.out.println("La armadura está dañada debe repararla.");
            }
            for (Propulsor Propulsore : Propulsores) {
                int numRand = rd.nextInt(101);
                if (numRand <= 30) {
                    Propulsore.setDanios(true);
                }
                for (Repulsor repulsore : Repulsores) {
                    int numRand1 = rd.nextInt(101);
                    if (numRand <= 30) {
                        repulsore.setDanios(true);
                    }
                }
            }

        }
    }

    public void reparandoDanios() {
        System.out.println("Se reparo la armadura");
        salud = 100;
    }

    public void revisarDispositivos() {
        mostrarEstado();
        estadoBateria();
    }

    public void radarVersion1_0() {

    }

    public void destruyendoEnemigos() {

    }

    public void accionesEvasivas() {

    }
//            ▪ estadoBateria(): informa el estado de la batería en porcentaje.
//            ▪ informacionReactor(): informa el estado del reactor en otras unidades de medida.
//            ▪ sufriendoDanios(): simula los daños que pueden sufrir los dispositivos de la armadura.
//            ▪ reparandoDanios(): intenta reparar los daños en los dispositivos de la armadura.
//            ▪ revisarDispositivos(): revisa y repara los dispositivos dañados de manera insistente.
//            ▪ radarVersion1_0(): realiza mediciones y detecciones de objetos en el radar
//            ▪ destruyendoEnemigos(): dispara y destruye los enemigos detectados en el radar.
//            ▪ accionesEvasivas(): realiza acciones evasivas si el nivel de batería es bajo.
}
