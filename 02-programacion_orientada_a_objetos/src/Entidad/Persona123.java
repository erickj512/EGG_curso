/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


/**
 *
 * @author Erick Almeida
 */

public class Persona123 {
    private String nombre;
    private Date fechaNacimiento;

    public Persona123() {
        // Constructor vacío
    }

    public Persona123(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public static Persona123 crearPersona() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la fecha de nacimiento de la persona (en formato dd/MM/yyyy):");
        String fechaNacimientoStr = scanner.nextLine();
        Date fechaNacimiento = null;

        try {
            fechaNacimiento = new Date(new SimpleDateFormat("dd/MM/yyyy").parse(fechaNacimientoStr).getTime());
        } catch (ParseException e) {
        }

        return new Persona123(nombre, fechaNacimiento);
    }

    public int calcularEdad() {
        Date fechaActual = new Date();
        long diferencia = fechaActual.getTime() - fechaNacimiento.getTime();
        long anios = diferencia / (1000L * 60 * 60 * 24 * 365);
        return (int) anios;
    }

    public boolean menorQue(int edad) {
        return calcularEdad() < edad;
    }

    public void mostrarPersona() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento.toString());
        System.out.println("Edad: " + calcularEdad());
    }
}
