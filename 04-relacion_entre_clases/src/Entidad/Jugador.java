/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Erick Almeida
 */
public class Jugador {
    int id;
    String nombre;
    boolean mojado;

    public Jugador(int id) {
        this.id = id;
        this.nombre = "Jugador " + id;
        this.mojado = false;
    }

    public boolean disparo(Revolver r) {
        boolean mojado = r.mojar();
        if (mojado) {
            this.mojado = true;
        }
        r.siguienteChorro();
        return mojado;
    }
}
