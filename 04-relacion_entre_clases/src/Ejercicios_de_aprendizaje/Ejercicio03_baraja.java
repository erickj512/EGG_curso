/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_de_aprendizaje;

import Entidad.Baraja;

/**
 *
 * @author Erick Almeida
 */
public class Ejercicio03_baraja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
        Baraja baraja = new Baraja();
        baraja.barajar();
        System.out.println("Cartas disponibles: " + baraja.cartasDisponibles());
        System.out.println("Siguiente carta: " + baraja.siguienteCarta());
        System.out.println("Siguiente carta: " + baraja.siguienteCarta());
        System.out.println("Siguiente carta: " + baraja.siguienteCarta());
        System.out.println("Cartas disponibles: " + baraja.cartasDisponibles());
        System.out.println("Cartas en el montón: " + baraja.cartasMonton());
        System.out.println("Dar 5 cartas: " + baraja.darCartas(6));
        System.out.println("Mostrar baraja:");
        baraja.mostrarBaraja();
    }
}

