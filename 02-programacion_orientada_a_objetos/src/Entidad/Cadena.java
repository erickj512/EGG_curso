/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Erick Almeida
 */
import java.util.Scanner;

public class Cadena {
    private String frase;
    private int longitud;

    public Cadena() {}

    public void setFrase(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public int getLongitud() {
        return longitud;
    }

    public void mostrarVocales() {
        int contador = 0;
        String vocales = "AEIOUaeiou";

        for (char c : frase.toCharArray()) {
            if (vocales.contains(Character.toString(c))) {
                contador++;
            }
        }

        System.out.println("Cantidad de vocales en la frase: " + contador);
    }

    public void invertirFrase() {
        StringBuilder reversed = new StringBuilder(frase).reverse();
        System.out.println("Frase invertida: " + reversed);
    }

    public void vecesRepetido(String letra) {
        char charToFind = letra.charAt(0);
        int contador = 0;

        for (char c : frase.toCharArray()) {
            if (c == charToFind) {
                contador++;
            }
        }

        System.out.println("El carácter '" + letra + "' se repite " + contador + " veces.");
    }

    public void compararLongitud(String otraFrase) {
        int longitudOtraFrase = otraFrase.length();

        if (longitud == longitudOtraFrase) {
            System.out.println("La longitud de las frases es igual.");
        } else {
            System.out.println("La longitud de las frases es diferente.");
        }
    }

    public void unirFrases(String otraFrase) {
        String fraseUnida = frase + " " + otraFrase;
        System.out.println("Frase resultante de la unión: " + fraseUnida);
    }

    public void reemplazar(String letra, String reemplazo) {
        frase = frase.replace(letra, reemplazo);
        System.out.println("Frase después del reemplazo: " + frase);
    }

    public boolean contiene(String letra) {
        return frase.contains(letra);
    }
 }
