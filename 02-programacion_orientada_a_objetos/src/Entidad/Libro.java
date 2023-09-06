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
import java.util.Scanner;

public class Libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private int numPaginas;

    // Constructor con todos los atributos
    public Libro(String ISBN, String titulo, String autor, int numPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    // Constructor vacío
    public Libro() {
    }

    // Método para cargar un libro pidiendo los datos al usuario
    public void cargarLibro() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el ISBN del libro:");
        ISBN = sc.nextLine();

        System.out.println("Introduzca el título del libro:");
        titulo = sc.nextLine();

        System.out.println("Introduzca el autor del libro:");
        autor = sc.nextLine();

        System.out.println("Introduzca el número de páginas del libro:");
        numPaginas = sc.nextInt();
    }

    // Método para informar los atributos del libro
    public void informarLibro() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numPaginas);
    }
   

}


