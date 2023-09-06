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
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        try {
            System.out.println("----------");
            System.out.println("Ingrese un numero: ");
            String num1 = leer.next();
            System.out.println("Ingrese otro numero: ");
            String num2 = leer.next();
            int num01 = Integer.parseInt(num1);
            int num02 = Integer.parseInt(num2);
            System.out.println("La division da como resultado: " + (num01 / num02));

        } catch (InputMismatchException | NumberFormatException ex) {
            System.out.println("Error! Ingrese solo numeros!");
        } catch (ArithmeticException ex) {
            System.out.println("Error! Noo puede dividir a un numero por cero!");
        }
        
    }
}