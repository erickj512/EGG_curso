/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_de_aprendizaje;

import Entidad.TiendaServicio;
import java.util.Scanner;

/**
 *
 * @author Erick Almeida
 */
public class ejercicio06_tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        TiendaServicio servicio = new TiendaServicio();
        Scanner scanner = new Scanner(System.in);

        char opcion;
        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Agregar producto");
            System.out.println("2. Modificar precio");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar productos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextLine().charAt(0);

            switch (opcion) {
                case '1':
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el precio del producto: ");
                    double precio = Double.parseDouble(scanner.nextLine());
                    servicio.agregarProducto(nombre, precio);
                    break;
                case '2':
                    System.out.print("Ingrese el nombre del producto a modificar: ");
                    String nombreModificar = scanner.nextLine();
                    System.out.print("Ingrese el nuevo precio: ");
                    double nuevoPrecio = Double.parseDouble(scanner.nextLine());
                    servicio.modificarPrecio(nombreModificar, nuevoPrecio);
                    break;
                case '3':
                    System.out.print("Ingrese el nombre del producto a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    servicio.eliminarProducto(nombreEliminar);
                    break;
                case '4':
                    servicio.mostrarProductos();
                    break;
                case '5':
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor seleccione una opción válida.");
            }
        } while (opcion != '5');

        scanner.close();
    }
}

