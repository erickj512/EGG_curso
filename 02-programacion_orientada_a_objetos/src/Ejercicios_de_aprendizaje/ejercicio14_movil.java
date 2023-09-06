/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_de_aprendizaje;

import Entidad.Movil;

/**
 *
 * @author Erick Almeida
 */
public class ejercicio14_movil {

    /**
     * @param args the command line arguments
     */
    
     public static void main(String[] args) {
        Movil movil = new Movil();
        movil.cargarCelular();

        System.out.println("Marca: " + movil.getMarca());
        System.out.println("Precio: " + movil.getPrecio());
        System.out.println("Modelo: " + movil.getModelo());
        System.out.println("Memoria RAM: " + movil.getMemoriaRam());
        System.out.println("Almacenamiento: " + movil.getAlmacenamiento());
        System.out.print("Código: ");
        for (int num : movil.getCodigo()) {
            System.out.print(num + " ");
        }
    }
 }
