/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_de_aprendizaje;

import Entidad.Matematica;

/**
 *
 * @author Erick Almeida
 */
public class ejercicio09_matematicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
 
        double numeroAleatorio1 = Math.random() * 100;
        double numeroAleatorio2 = Math.random() * 100;

        Matematica matematica = new Matematica(numeroAleatorio1, numeroAleatorio2);

        System.out.println("Número 1: " + matematica.getNumero1());
        System.out.println("Número 2: " + matematica.getNumero2());

        double mayor = matematica.devolverMayor();
        System.out.println("El mayor número es: " + mayor);

        double potencia = matematica.calcularPotencia();
        System.out.println("La potencia del mayor número elevado al menor número es: " + potencia);

        double raiz = matematica.calcularRaiz();
        System.out.println("La raíz cuadrada del menor número es: " + raiz);
    }
}

