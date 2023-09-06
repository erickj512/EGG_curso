/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_de_aprendizaje;
import Entidad.Array;
import java.util.Arrays;
/**
 *
 * @author Erick Almeida
 */
public class ejercicio10_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 


        double[] a = new double[50];
        double[] b = new double[20];
        
        Array array1 = new Array(a, b);
        
        // Llenar el arreglo A con valores aleatorios
        array1.random();
        
        // Mostrar el arreglo A original
        array1.getA();
        
        // Ordenar el arreglo A
        array1.ordenarVectorA();
        
        // Mostrar el arreglo A ordenado
        array1.getA();
        
        array1.copiarOrdenadosRellenar();
        
        array1.getB();
        
        
    }
}
