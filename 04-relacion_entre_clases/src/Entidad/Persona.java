/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Erick Almeida
 */
public class Persona {
  String nombre;
    String apellido;
    int edad;
    String documento;
    Perro perro;

    public Persona(String nombre, String apellido, int edad, String documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
    }

    public void adoptarPerro(Perro perro) {
        this.perro = perro;
    }

    public void mostrarInformacion() {
        System.out.println("Información de la persona:");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Edad: " + this.edad);
        System.out.println("Documento: " + this.documento);
        System.out.println("Información del perro adoptado:");
        System.out.println("Nombre: " + this.perro.nombre);
        System.out.println("Raza: " + this.perro.raza);
        System.out.println("Edad: " + this.perro.edad);
        System.out.println("Tamaño: " + this.perro.tamaño);
    }
}
