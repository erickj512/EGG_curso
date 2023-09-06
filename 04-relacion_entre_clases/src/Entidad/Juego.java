/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author Erick Almeida
 */
public class Juego {
    ArrayList<Jugador> jugadores;
    Revolver revolver;

    public Juego(ArrayList<Jugador> jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public void ronda() {
        System.out.println("Iniciando ronda...");
        for (Jugador jugador : jugadores) {
            System.out.println("Turno del " + jugador.nombre);
            boolean mojado = jugador.disparo(revolver);
            if (mojado) {
                System.out.println(jugador.nombre + " se ha mojado!");
                break;
            } else {
                System.out.println(jugador.nombre + " se ha salvado!");
            }
        }
    }
}