/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_de_aprendizaje;

import Entidad.Juego;
import Entidad.Jugador;
import Entidad.Revolver;
import java.util.ArrayList;

/**
 *
 * @author Erick Almeida
 */
public class Ejercicio02_ruleta_rusa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
        for (int i = 1; i <= 6; i++) {
            jugadores.add(new Jugador(i));
        }
        Revolver revolver = new Revolver();
        Juego juego = new Juego(jugadores, revolver);

        juego.ronda();
    }
}

        

