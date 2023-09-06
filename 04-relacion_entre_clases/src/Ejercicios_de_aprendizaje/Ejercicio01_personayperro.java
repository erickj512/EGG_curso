/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_de_aprendizaje;

import Entidad.Perro;
import Entidad.Persona;

/**
 *
 * @author Erick Almeida
 */
public class Ejercicio01_personayperro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona1 = new Persona("Diego", "Carrion", 33, "45613789");
        Persona persona2 = new Persona("Charlie", "Rosero", 25, "159267483");
        Perro perro1 = new Perro("Negro", "Pastor", 6, "Grande");
        Perro perro2 = new Perro("Nicolasa", "Meztiso", 4, "Mediano");

        persona1.adoptarPerro(perro1);
        persona2.adoptarPerro(perro2);

        persona1.mostrarInformacion();
        System.out.println();
        persona2.mostrarInformacion();
    }
}
