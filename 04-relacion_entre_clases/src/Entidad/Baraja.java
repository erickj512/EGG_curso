/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;
import java.util.Collections;



/**
 *
 * @author Erick Almeida
 */

public class Baraja {
    ArrayList<Carta> cartas;
    int cartaActual;

    public Baraja() {
        cartas = new ArrayList<>();
        String[] palos = {"espadas", "bastos", "oros", "copas"};
        for (String palo : palos) {
            for (int i = 1; i <= 12; i++) {
                if (i != 8 && i != 9) {
                    cartas.add(new Carta(i, palo));
                }
            }
        }
        cartaActual = 0;
    }

    public void barajar() {
        Collections.shuffle(cartas);
        cartaActual = 0;
    }

    public Carta siguienteCarta() {
        if (cartaActual == cartas.size()) {
            return null;
        } else {
            Carta carta = cartas.get(cartaActual);
            cartaActual++;
            return carta;
        }
    }

    public int cartasDisponibles() {
        return cartas.size() - cartaActual;
    }

    public ArrayList<Carta> darCartas(int n) {
        if (cartasDisponibles() < n) {
            return null;
        } else {
            ArrayList<Carta> cartasDar = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                cartasDar.add(siguienteCarta());
            }
            return cartasDar;
        }
    }

    public ArrayList<Carta> cartasMonton() {
        ArrayList<Carta> monton = new ArrayList<>();
        for (int i = 0; i < cartaActual; i++) {
            monton.add(cartas.get(i));
        }
        return monton;
    }

    public void mostrarBaraja() {
        for (int i = cartaActual; i < cartas.size(); i++) {
            System.out.println(cartas.get(i));
        }
    }
}