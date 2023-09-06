/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_de_aprendizaje;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Erick Almeida
 */
public class ejercicio11_fecha {

    /**
     * @param args
     */

   public static void main(String[] args) {
            
  Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el día:");
        int dia = scanner.nextInt();

        System.out.println("Ingrese el mes:");
        int mes = scanner.nextInt();

        System.out.println("Ingrese el año:");
        int anio = scanner.nextInt();
     
      
      
        Date fecha = new Date(anio - 1900, mes - 1, dia);
       
        Date fechaActual = new Date();

        
        System.out.println("Fecha ingresada: " + fecha);
        System.out.println("Fecha actual: " + fechaActual);


        long diferencia = fechaActual.getTime() - fecha.getTime();
        long anios = diferencia / (1000L * 60 * 60 * 24 * 365);

      
        System.out.println("Años entre las dos fechas: " + anios);
    }
}