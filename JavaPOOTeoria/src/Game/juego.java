/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.util.Scanner;

/**
 *
 * @author SAMIR
 */
public class juego {
 private String j1;
    private String j2;
    public int nj1;
    public int nj2;
    public int g1 = 0;
    public int g2 = 0;

    public juego() {
    }

    public juego(String j1, String j2) {
        this.j1 = j1;
        this.j2 = j2;
    }

    public String getJ1() {
        return j1;
    }

    public void setJ1(String j1) {
        this.j1 = j1;
    }

    public String getJ2() {
        return j2;
    }

    public void setJ2(String j2) {
        this.j2 = j2;
    }

    public void IngresoJuego() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese nombre del jugador1:");
        j1 = leer.next();
        System.out.println("Ingrese nombre del jugador2:");
        j2 = leer.next();
    }

    public void iniciarJuego() {
        Scanner leer = new Scanner(System.in);
      
        String rta;
        do {
            System.out.println("Jugador " + j1 + " ingrese un numero del 1 al 10:");
            nj1 = leer.nextInt();
            //nj1 = (int)(Math.random()*10);
            //System.out.println("nj1 = " + nj1);
            int cont = 1;
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese un numero del 1 al 10: ");
                nj2 = leer.nextInt();
                if (nj2 == nj1) {
                    System.out.println("Felicidades adivinaste el numero en " + cont
                            + " intentos.");
                    g2++;
                    i += 3;
                    break;
                } else {
                    System.out.println("Intenta nuevamente.");
                }
                if (nj2 < nj1) {
                    System.out.println("Mas Alto.");

                } else {
                    System.out.println("Mas Bajo.");
                }
                cont++;
            }
            if (cont == 4) {
                g1++;
            }
                System.out.println("Desea seguir jugando??[S/N]");
                rta = leer.next();
                rta = rta.toUpperCase();
            } while (!"N".equals(rta));
       
        System.out.println("El jugador " + j1 + " gano " + g1 + " veces, mientras"
                + " que el jugador " + j2 + " gano " + g2 + " veces.");
    }
    }

