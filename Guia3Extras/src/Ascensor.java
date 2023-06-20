
import java.util.Scanner;

    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAMIR
 */
public class Ascensor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           boolean ascensor_f=false;
           System.out.println("Bienvenido al ascensor");
           System.out.println("desea entrar?(si/no)");
           String entrar = scanner.nextLine();
           do{
           if(entrar.equalsIgnoreCase("si")){
               ascensor_f=true;
               break;
           }else if(entrar.equalsIgnoreCase("no")){
               break;
               
               }else if(!entrar.equalsIgnoreCase("si")||!entrar.equalsIgnoreCase("no")){
                   System.out.println("Ingrese si o no");
                   entrar = scanner.next();
               }
           }while(!entrar.equalsIgnoreCase("si")||!entrar.equalsIgnoreCase("no"));
        int pisoActual = 0;
        while (ascensor_f) {
            System.out.println("El ascensor se encuentra en el piso " + pisoActual);
            System.out.println("¿A qué piso deseas ir? (1-10, s para salir)");
            String opcion = scanner.next();
            if (opcion.equals("s")) {
                break;
            }
                 int destino = Integer.parseInt(opcion);
                int diferencia = Math.abs(destino - pisoActual);
                System.out.println("El ascensor se mueve " + diferencia + " pisos.");
                for (int i = 0; i < diferencia; i++) {
                    if (destino > pisoActual) {
                        pisoActual++;
                        System.out.println("El ascensor llegó al piso " + pisoActual);
                    } else {
                        pisoActual--;
                        System.out.println("El ascensor llegó al piso " + pisoActual);
                    }
                }
                System.out.println("El ascensor llegó al piso " + destino);
                pisoActual = destino;
            }
           System.out.println("Hasta luego que tenga buen dia!!");
        }
    }