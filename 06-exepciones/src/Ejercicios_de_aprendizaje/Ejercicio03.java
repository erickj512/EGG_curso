/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_de_aprendizaje;

import Entidad.DivisionNumero;
import java.util.Scanner;

/**
 *
 * @author Erick Almeida
 */
public class Ejercicio03{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        String num1 = scanner.nextLine();
        System.out.println("Ingrese el segundo número: ");
        String num2 = scanner.nextLine();

        int numero1 = Integer.parseInt(num1);
        int numero2 = Integer.parseInt(num2);

        int resultado = numero1 / numero2;
        System.out.println("El resultado de la división es: " + resultado);
    }
}
