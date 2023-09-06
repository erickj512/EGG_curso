/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_de_aprendizaje;

import Entidad.Circunferencia;
import java.util.Scanner;

/*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia 
e) Método perimetro(): para calcular el perímetro 

/**
 *
 * @author Erick Almeida
 */
public class ejercicio02_circunferencia {
    private Double radio;   
    
    /**
     * @param args the command line arguments
     */
   
   public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el radio de la circunferencia: ");
        double radio = sc.nextDouble();

        Circunferencia circunferencia = new Circunferencia(radio);
       
        System.out.println("Área de la circunferencia: " + circunferencia.area());
        System.out.println("Perímetro de la circunferencia: " + circunferencia.perimetro());
    }
}

