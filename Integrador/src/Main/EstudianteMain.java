/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import estudiante.Estudiante;
import servicios.EstudianteService;

/**
 *
 * @author Carlos Martin
 */
public class EstudianteMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EstudianteService servicio = new EstudianteService();
        Estudiante[] listaEstudiantes = new Estudiante[8];
        listaEstudiantes = servicio.crearEstudiante(listaEstudiantes);

        String[] mayor = servicio.notaMayor(listaEstudiantes);

        servicio.mostrar(listaEstudiantes);
        System.out.println("el promedio de las notas de todo el curso es de: " + servicio.promedioNotas(listaEstudiantes));
        System.out.println("Los estudiantes con una nota mayor al promedio son: ");
        servicio.mostrarMayor(mayor);
        
    }

}

