/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Arrays;
import java.util.Random;

public class Array {
    private double[] A = new double[50];
    private double[] B = new double[20];

    public Array(double[] A, double[] B) {
        this.A = A;
        this.B = B;
    }

    public void getA() {
        System.out.println("Arreglo A original:");
        for (double num : this.A) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void getB() {
        System.out.println("Arreglo B original:");
        for (double num : this.B) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void ordenarVectorA() {
        Arrays.sort(this.A);
    }

    public void ordenarVectorB() {
        Arrays.sort(this.B);
    }


    public void random() {
        Random random = new Random();
        for (int i = 0; i < A.length; i++) {
            A[i] = random.nextDouble() * 100; // Genera números aleatorios entre 0 y 100
        }
    }

    public void copiarOrdenadosRellenar() {
        // Copiar los primeros 10 números ordenados al arreglo B
        System.arraycopy(A, 0, B, 0, 10);

        // Rellenar los 10 últimos elementos del arreglo B con el valor 0.5
        Arrays.fill(B, 10, B.length, 0.5);
    }
}





