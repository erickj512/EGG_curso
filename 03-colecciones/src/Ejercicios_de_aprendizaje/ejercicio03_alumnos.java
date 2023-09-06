/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_de_aprendizaje;

import java.util.ArrayList;
import java.util.Scanner;
import Entidad.alumno;
import Entidad.alumnoServicio;

/**
 *
 * @author Erick Almeida
 */
public class ejercicio03_alumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        alumnoServicio service = new alumnoServicio();

        ArrayList<alumno> alumnos = service.crearAlumno();

        System.out.println("Ingrese el nombre del estudiante que desea buscar: ");
        String nombre = leer.next();
        boolean aux = false;
        for (alumno alum : alumnos) {
            if (alum.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("La nota final del alumno es: " + service.notaFinal(alum.getListaNotas()));
                aux = true;
            }
        }
        if (!aux) {
            System.out.println("No se encontro el alumno");

        }
    }
}
