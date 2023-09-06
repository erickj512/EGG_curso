/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_de_aprendizaje;

/**
 *
 * @author Erick Almeida
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int [] array = new int [6];
        
        try{            
            array[8] = 100;
        }catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Indice fuera de rango");
        }
        finally{
            System.out.println(". . . .");
        }
        
    }    
}

