/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_de_aprendizaje;

import Entidad.PaisServicio;
import java.util.Scanner;

/**
 *
 * @author Erick Almeida
 */
public class ejercicio05_pais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PaisServicio servicio = new PaisServicio();
        Scanner scanner = new Scanner(System.in);

        char opcion;
        do {
            System.out.print("Ingrese un país: ");
            String pais = scanner.nextLine();
            servicio.agregarPais(pais);

            System.out.print("¿Desea ingresar otro país? (S/N): ");
            opcion = scanner.nextLine().charAt(0);
        } while (opcion == 'S' || opcion == 's');

        servicio.mostrarPaises();
        servicio.mostrarPaisesOrdenados();

        System.out.print("Ingrese un país para eliminar: ");
        String paisEliminar = scanner.nextLine();
        servicio.eliminarPais(paisEliminar);


        scanner.close();
    }
}


    
