/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_de_aprendizaje;

import Entidad.Persona;

/**
 *
 * @author Erick Almeida
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
            Persona per1 = null;
            per1.mayorDeEdad(per1);
        }catch (NullPointerException e) {
            System.out.println("La persona no ha sido creada");
        }        
    }    
}