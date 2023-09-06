/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Random;

/**
 *
 * @author Erick Almeida
 */
public class Revolver {
    int posicionActual;
    int posicionAgua;

    public Revolver() {
        llenarRevolver();
    }

    public void llenarRevolver() {
        Random rand = new Random();
        posicionActual = rand.nextInt(6) + 1;
        posicionAgua = rand.nextInt(6) + 1;
    }

    public boolean mojar() {
        return posicionActual == posicionAgua;
    }

    public void siguienteChorro() {
        posicionActual = (posicionActual % 6) + 1;
    }

    public String toString() {
        return "Posición actual: " + posicionActual + ", Posición del agua: " + posicionAgua;
    }
}

