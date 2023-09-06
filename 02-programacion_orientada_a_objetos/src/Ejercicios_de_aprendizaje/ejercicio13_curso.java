/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_de_aprendizaje;

import Entidad.Curso;
import java.util.Arrays;
/**
 *
 * @author Erick Almeida
 */
public class ejercicio13_curso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Curso curso = new Curso();
    
        
        curso.crearCurso();

        System.out.println("Nombllllso: " + curso.getNombreCurso());
        System.out.println("Horas por día: " + curso.getCantidadHorasPorDia());
        System.out.println("Días por semana: " + curso.getCantidadDiasPorSemana());
        System.out.println("numero de alumnos: " + curso.getnumeroalumanos());
        System.out.println("Turno: " + curso.getTurno());
        System.out.println("Precio por hora: " + curso.getPrecioPorHora());
        System.out.println("Alumnos: " + Arrays.toString(curso.getAlumnos()));
        System.out.println("Ganancia semanal: " + curso.calcularGananciaSemanal());
    }
}

    
