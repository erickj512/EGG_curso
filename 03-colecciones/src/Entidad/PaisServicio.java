/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


/**
 *
 * @author Erick Almeida
 */


public class PaisServicio {
    private Set<String> paises;

    public PaisServicio() {
        paises = new HashSet<>();
    }

    public void agregarPais(String pais) {
        paises.add(pais);
    }

    public void mostrarPaises() {
        System.out.println("Paises en el conjunto:");
        for (String pais : paises) {
            System.out.println(pais);
        }
    }

    public void mostrarPaisesOrdenados() {
        Set<String> paisesOrdenados = new TreeSet<>(paises);
        System.out.println("Paises en el conjunto ordenados alfabéticamente:");
        for (String pais : paisesOrdenados) {
            System.out.println(pais);
        }
    }

    public void eliminarPais(String pais) {
        if (paises.contains(pais)) {
            paises.remove(pais);
            System.out.println("Pais eliminado exitosamente.");
        } else {
            System.out.println("El país no se encuentra en el conjunto.");
        }
    }

    public void eliminarPaisConIterator(String pais) {
        Iterator<String> iterador = paises.iterator();
        while (iterador.hasNext()) {
            if (iterador.next().equalsIgnoreCase(pais)) {
                iterador.remove();
                System.out.println("Pais eliminado exitosamente.");
                return;
            }
        }
        System.out.println("El país no se encuentra en el conjunto.");
    }
}

