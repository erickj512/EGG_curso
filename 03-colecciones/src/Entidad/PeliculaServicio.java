/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Erick Almeida
 */


public class PeliculaServicio {
    private List<Pelicula> peliculas;
    private Scanner scanner;

    public PeliculaServicio() {
        peliculas = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void menu() {
        char opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Cargar película");
            System.out.println("2. Mostrar todas las películas");
            System.out.println("3. Mostrar películas con duración mayor a 1 hora");
            System.out.println("4. Mostrar películas ordenadas por duración (mayor a menor)");
            System.out.println("5. Mostrar películas ordenadas por duración (menor a mayor)");
            System.out.println("6. Mostrar películas ordenadas por título");
            System.out.println("7. Mostrar películas ordenadas por director");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextLine().charAt(0);

            switch (opcion) {
                case '1':
                    cargarPelicula();
                    break;
                case '2':
                    mostrarPeliculas(peliculas);
                    break;
                case '3':
                    mostrarPeliculasConDuracionMayorAUnaHora();
                    break;
                case '4':
                    mostrarPeliculasOrdenadasPorDuracion(true);
                    break;
                case '5':
                    mostrarPeliculasOrdenadasPorDuracion(false);
                    break;
                case '6':
                    mostrarPeliculasOrdenadasPorTitulo();
                    break;
                case '7':
                    mostrarPeliculasOrdenadasPorDirector();
                    break;
                case '8':
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor seleccione una opción válida.");
            }
        } while (opcion != '8');
    }

    private void cargarPelicula() {
        System.out.println("Ingrese los datos de la película:");
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Director: ");
        String director = scanner.nextLine();
        System.out.print("Duración (horas): ");
        double duracion = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea

        Pelicula pelicula = new Pelicula(titulo, director, duracion);
        peliculas.add(pelicula);

        System.out.println("Película cargada exitosamente.");
    }

    private void mostrarPeliculas(List<Pelicula> listaPeliculas) {
    System.out.println("Lista de películas:");
    for (Pelicula pelicula : listaPeliculas) {
        System.out.println(pelicula);
    }
}



    private void mostrarPeliculasConDuracionMayorAUnaHora() {
        System.out.println("Películas con duración mayor a 1 hora:");
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula);
            }
        }
    }

    private void mostrarPeliculasOrdenadasPorDuracion(boolean ordenDescendente) {
        Comparator<Pelicula> comparadorDuracion = Comparator.comparing(Pelicula::getDuracion);
        if (ordenDescendente) {
            comparadorDuracion = comparadorDuracion.reversed();
        }
        
        Collections.sort(peliculas, comparadorDuracion);
        
        System.out.println("Películas ordenadas por duración:");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }

    private void mostrarPeliculasOrdenadasPorTitulo() {
        Collections.sort(peliculas, Comparator.comparing(Pelicula::getTitulo));
        
        System.out.println("Películas ordenadas por título:");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }

    private void mostrarPeliculasOrdenadasPorDirector() {
        Collections.sort(peliculas, Comparator.comparing(Pelicula::getDirector));
        
        System.out.println("Películas ordenadas por director:");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }


    public void closeScanner() {
        scanner.close();
    }
}

