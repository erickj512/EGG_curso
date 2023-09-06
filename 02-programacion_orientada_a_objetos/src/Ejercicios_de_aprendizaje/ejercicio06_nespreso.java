/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_de_aprendizaje;

import Entidad.Cafetera;
import java.util.Scanner;

/*Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual
 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada. 

/**
 *
 * @author Erick Almeida
 */
public class ejercicio06_nespreso {

    /**
     * @param args the command line arguments
     */
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cafetera cafetera = new Cafetera(1200, 800);
        int opcion = 0;

        while (opcion != 7) {
            System.out.println("Menú de opciones:");
            System.out.println("1. Llenar cafetera");
            System.out.println("2. Servir taza");
            System.out.println("3. Vaciar cafetera");
            System.out.println("4. Agregar café");
            System.out.println("5. Ver capacidad máxima");
            System.out.println("6. Ver cantidad actual");
            System.out.println("7. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    cafetera.llenarCafetera();
                    break;
                case 2:
                    System.out.print("Ingresa el tamaño de la taza: ");
                    int tamanoTaza = scanner.nextInt();
                    cafetera.servirTaza(tamanoTaza);
                    break;
                case 3:
                    cafetera.vaciarCafetera();
                    break;
                case 4:
                    System.out.print("Ingresa la cantidad de café a agregar: ");
                    int cantidadCafe = scanner.nextInt();
                    cafetera.agregarCafe(cantidadCafe);
                    break;
                case 5:
                    System.out.println("Capacidad máxima: " + cafetera.getCapacidadMaxima());
                    break;
                case 6:
                    System.out.println("Cantidad actual: " + cafetera.getCantidadActual());
                    break;
                case 7:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor selecciona una opción válida.");
            }
        }

        scanner.close();
    }
}


 

