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
public class Tiempo {
    private int hora;
    private int minutos;
    private int segundos;

    public Tiempo() {
    }

    public Tiempo(int hora, int minutos, int segundos) {
        if (validarHora(hora, minutos, segundos)) {
            this.hora = hora;
            this.minutos = minutos;
            this.segundos = segundos;
        } else {
            System.out.println("Valores de hora, minutos y segundos incorrectos. Se establecerán en 0.");
            this.hora = 0;
            this.minutos = 0;
            this.segundos = 0;
        }
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        } else {
            System.out.println("Hora incorrecta. Debe estar entre 0 y 23.");
        }
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if (minutos >= 0 && minutos < 60) {
            this.minutos = minutos;
        } else {
            System.out.println("Minutos incorrectos. Deben estar entre 0 y 59.");
        }
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if (segundos >= 0 && segundos < 60) {
            this.segundos = segundos;
        } else {
            System.out.println("Segundos incorrectos. Deben estar entre 0 y 59.");
        }
    }

    private boolean validarHora(int hora, int minutos, int segundos) {
        return (hora >= 0 && hora < 24) && (minutos >= 0 && minutos < 60) && (segundos >= 0 && segundos < 60);
    }

    public void imprimirHoraCompleta() {
        System.out.printf("Hora completa: %02d:%02d:%02d%n", hora, minutos, segundos);
    }

   
}