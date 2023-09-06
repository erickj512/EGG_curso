/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_de_aprendizaje;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author Erick Almeida
 */
public class ejercicio08_cadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner scanner = new Scanner(System.in);
        Cadena cadena = new Cadena();

        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();
        cadena.setFrase(frase);

        cadena.mostrarVocales();
        cadena.invertirFrase();

        System.out.print("Ingrese un carácter para contar repeticiones: ");
        String letra = scanner.nextLine();
        cadena.vecesRepetido(letra);

        System.out.print("Ingrese otra frase para comparar longitud: ");
        String otraFrase = scanner.nextLine();
        cadena.compararLongitud(otraFrase);

        System.out.print("Ingrese otra frase para unir: ");
        otraFrase = scanner.nextLine();
        cadena.unirFrases(otraFrase);

        System.out.print("Ingrese un carácter para reemplazar: ");
        letra = scanner.nextLine();
        System.out.print("Ingrese el carácter de reemplazo: ");
        String reemplazo = scanner.nextLine();
        cadena.reemplazar(letra, reemplazo);

        System.out.print("Ingrese una letra para comprobar si la frase la contiene: ");
        letra = scanner.nextLine();
        boolean contiene = cadena.contiene(letra);
        System.out.println("La frase contiene la letra '" + letra + "': " + contiene);

        scanner.close();
    }
}

