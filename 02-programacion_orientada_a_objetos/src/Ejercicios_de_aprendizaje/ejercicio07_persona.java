/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_de_aprendizaje;
import Entidad.Persona;
/**
 *
 * @author Erick Almeida
 */
public class ejercicio07_persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona1 = new Persona("Pedro", 30, 'H', 76, 1.80);
        Persona persona2 = new Persona("Juana", 34, 'M', 70, 1.76);
        Persona persona3 = new Persona("Quico", 23, 'H', 98, 1.65);
        Persona persona4 = new Persona("Maria", 33, 'M', 67, 1.45);

        Persona[] personas = {persona1, persona2, persona3, persona4};

        int porDebajo = 0;
        int enPesoIdeal = 0;
        int porEncima = 0;
        int mayoresDeEdad = 0;
        int menoresDeEdad = 0;

        for (Persona persona : personas) {
            int resultadoIMC = persona.calcularIMC();
            if (resultadoIMC == -1) {
                porDebajo++;
            } else if (resultadoIMC == 0) {
                enPesoIdeal++;
            } else {
                porEncima++;
            }

            if (persona.esMayorDeEdad()) {
                mayoresDeEdad++;
            } else {
                menoresDeEdad++;
            }
        }

        int totalPersonas = personas.length;

        double porcentajePorDebajo = (porDebajo * 100.0) / totalPersonas;
        double porcentajeEnPesoIdeal = (enPesoIdeal * 100.0) / totalPersonas;
        double porcentajePorEncima = (porEncima * 100.0) / totalPersonas;
        double porcentajeMayoresDeEdad = (mayoresDeEdad * 100.0) / totalPersonas;
        double porcentajeMenoresDeEdad = (menoresDeEdad * 100.0) / totalPersonas;

        System.out.println("Porcentaje de personas por debajo de su peso: " + porcentajePorDebajo + "%");
        System.out.println("Porcentaje de personas en su peso ideal: " + porcentajeEnPesoIdeal + "%");
        System.out.println("Porcentaje de personas por encima de su peso: " + porcentajePorEncima + "%");
        System.out.println("Porcentaje de personas mayores de edad: " + porcentajeMayoresDeEdad + "%");
        System.out.println("Porcentaje de personas menores de edad: " + porcentajeMenoresDeEdad + "%");
    }
}

