/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Erick Almeida
 */
public class Circunferencia {
    private Double radio;
       // Método constructor
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    // Métodos get y set para el atributo radio
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Método para crear Circunferencia
  public void crearCircunferencia(double radio) {
        this.radio = radio;
    }
  
    // Método para calcular el área de la circunferencia
   public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    // Método para calcular el perímetro de la circunferencia
    public double perimetro() {
        return 2 * Math.PI * radio;
    }
}


