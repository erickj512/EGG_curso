/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_de_aprendizaje;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Erick Almeida
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int nAleatorio = (int) (Math.random() * 5); //Numero a adivinar
        int cont = 0; //Contador de intentos
        int n = 0; //Numero que el usuario ingresa

        System.out.println("Bienvenido al adivinador!");
        do {            
            System.out.println("Ingrese un numero: ");
            try {                
                n = leer.nextInt();

                if (n < nAleatorio) {
                    System.out.println("El numero debe ser mayor!");
                    cont++;
                } else if (n > nAleatorio) {
                    System.out.println("El numero debe ser menor!");
                    cont++;
                }
            } catch (InputMismatchException ex) {
                System.out.println("Error! ingrese solo numeros!");
                cont++;
                leer.nextLine();
            }
        } while (nAleatorio != n);        
        System.out.println("Has acertado! :)");
        System.out.println("Has hecho " + cont + " intentos.");
    }
}