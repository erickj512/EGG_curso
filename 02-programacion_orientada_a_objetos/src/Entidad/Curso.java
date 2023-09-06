/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Erick Almeida
 */
public class Curso {
    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private int numeroalumanos;
    private String turno;
    private double precioPorHora;
    private String[] alumnos;

    // Constructor por defecto
    public Curso() {
        alumnos = new String[5];
    }

    // Constructor con todos los atributos como parámetro
    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana,int numeroalumanos, String turno, double precioPorHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
        this.numeroalumanos = numeroalumanos;
    }

    // Métodos getters y setters
    // Métodos getters
    public String getNombreCurso() {
        return nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }
    
    public int getnumeroalumanos () {
        return numeroalumanos ;
    }

    public String getTurno() {
        return turno;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    // Métodos setters
    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }
    
    public void setnumeroalumanos (int numeroalumanos ) {
        this.cantidadDiasPorSemana = numeroalumanos ;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    
    
    // Método cargarAlumnos()
    public void cargarAlumnos() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numeroalumanos; i++) {
            System.out.println("Ingrese el nombre del alumno " + (i + 1) + ": ");
            alumnos[i] = scanner.nextLine();
        }
    }

    // Método crearCurso()
    public void crearCurso() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del curso: ");
        nombreCurso = scanner.nextLine();
        
        System.out.println("Ingrese la cantidad de horas por día: ");
        cantidadHorasPorDia = scanner.nextInt();
        
        System.out.println("Ingrese la cantidad de días por semana: ");
        cantidadDiasPorSemana = scanner.nextInt();
        
        System.out.println("Ingre el numero de alumnos ");
        numeroalumanos = scanner.nextInt();
        
        scanner.nextLine(); // Limpia el buffer del scanner
        
        System.out.println("Ingrese el turno (mañana o tarde): ");
        turno = scanner.nextLine();
        
        System.out.println("Ingrese el precio por hora: ");
        precioPorHora = scanner.nextDouble();

        cargarAlumnos();
    }

    // Método calcularGananciaSemanal()
    public double calcularGananciaSemanal() {
        return cantidadHorasPorDia * precioPorHora * alumnos.length * cantidadDiasPorSemana;
    }
}


