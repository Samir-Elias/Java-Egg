
package mains;

import Entidad.Perro;
import Entidad.Persona;
import Service.PPServicios;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author SAMIR
 */
public class MainEj1 {

    /**
     * @param args the command line arguments
     */    

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    PPServicios pps = new PPServicios();    
    
        List<Persona> personas = new ArrayList();
        List<Perro> perrosadoptables = new ArrayList();

        System.out.println("Se procedera a cargar dos personas en el sistema");
        for (int i = 0; i < 2; i++) {
            personas.add(pps.crearPersona());
        }

        System.out.println("");
        System.out.println("Se procede a cargar dos perros en el sistema");
        for (int i = 0; i < 2; i++) {
            perrosadoptables.add(pps.crearPerro());
        }

        System.out.println("");
        for (Persona aux : personas) {
            System.out.println("Para la persona " + aux.getNombre() + " " + aux.getApellido() + " \nseleccione el nombre de uno de los siguientes perros en adopción: ");
            for (Perro aux2 : perrosadoptables) {
                System.out.println("Nombre: " + aux2.getNombre() + " - Raza: " + aux2.getRaza());
            }
            String adoptable = leer.next();

            int ctrol = 0;
            for (int i = 0; i < perrosadoptables.size(); i++) {
                if (adoptable.equalsIgnoreCase(perrosadoptables.get(i).getNombre())) {
                    aux.setPerro(perrosadoptables.get(i));
                    ctrol++;
                    perrosadoptables.remove(i);
                }
            } 



 

 

            if (ctrol == 0) {
                System.out.println("No se ha adoptado un perro válido");
            }
        }

        System.out.println("");
        System.out.println("Las siguientes personas han adoptado: ");
        for (Persona aux : personas) {
            if (aux.getPerro() == null) {
                System.out.println(aux.getNombre() + " " + aux.getEdad() +" no ha adoptado a ningun perro");
            } else {
                System.out.println(aux.getNombre() + " " + aux.getApellido() + " a adoptado a " + aux.getPerro().toString()+ " de raza " + aux.getPerro().getRaza());
            }

        }
    }
    }

