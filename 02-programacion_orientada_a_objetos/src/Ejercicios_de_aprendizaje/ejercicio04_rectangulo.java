/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_de_aprendizaje;

import Entidad.Rectangulo;

/*Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes. 

/**
 *
 * @author Erick Almeida
 */
public class ejercicio04_rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.crearRectangulo();

        double superficie = rectangulo.calcularSuperficie();
        double perimetro = rectangulo.calcularPerimetro();

        System.out.println("Superficie del rectángulo: " + superficie);
        System.out.println("Perímetro del rectángulo: " + perimetro);

        System.out.println("Dibujo del rectángulo:");
        rectangulo.dibujarRectangulo();
    }
}

