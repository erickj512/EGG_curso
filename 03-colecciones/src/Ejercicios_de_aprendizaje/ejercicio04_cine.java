/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_de_aprendizaje;

import Entidad.PeliculaServicio;

/**
 *
 * @author Erick Almeida
 */
public class ejercicio04_cine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PeliculaServicio service = new PeliculaServicio();
        service.menu();
        service.closeScanner();
    }
}
