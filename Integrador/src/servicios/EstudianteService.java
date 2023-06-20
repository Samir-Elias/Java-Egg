/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import estudiante.Estudiante;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Carlos Martin
 */
public class EstudianteService {

    Scanner leer = new Scanner(System.in);
    //private String[] mayor;

    public Estudiante[] crearEstudiante(Estudiante[] listaEstudiantes) {
        String nombre;
        int nota;

        for (int i = 0; i < listaEstudiantes.length; i++) {
            System.out.println("ingrese nombre:");
            nombre = leer.nextLine();

            System.out.println("ingrese nota");
            nota = leer.nextInt();
            leer.nextLine();
            listaEstudiantes[i] = new Estudiante(nombre, nota);
        }

        return listaEstudiantes;
    }

    public void mostrar(Estudiante[] listaEstudiantes) {

        System.out.println(Arrays.toString(listaEstudiantes));

    }

    public double promedioNotas(Estudiante[] listaEstudiantes) {
        int suma = 0;
        double promedio;
        for (int i = 0; i < listaEstudiantes.length; i++) {
            suma += listaEstudiantes[i].getNota();
        }
        promedio = suma / listaEstudiantes.length;

        return promedio;
    }

    public String[] notaMayor(Estudiante[] listaEstudiantes) {

        int contador = 0;
        double promedio = promedioNotas(listaEstudiantes);
        System.out.println(promedio);

        String[] mayor = new String[listaEstudiantes.length];
        for (int j = 0; j < listaEstudiantes.length; j++) {
            if (listaEstudiantes[j].getNota() > this.promedioNotas(listaEstudiantes)) {
                String nombre = listaEstudiantes[j].getNombre();
                mayor[j] = nombre;

            } else {
                mayor[j] = "";
            }
        }

        return mayor;
    }

    public void mostrarMayor(String[] mayor) {
        for (int i = 0; i < mayor.length; i++) {
            if (!mayor[i].equals("")) {
                System.out.println(mayor[i]);
            }

        }

    }

}
