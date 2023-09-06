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



public class Cuenta {
    private int numeroCuenta;
    private long dniCliente;
    private double saldoActual;

    public Cuenta() {
        this.numeroCuenta = 0;
        this.dniCliente = 0;
        this.saldoActual = 0.0;
    }

    public Cuenta(int numeroCuenta, long dniCliente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void crearCuenta() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el número de cuenta: ");
        numeroCuenta = leer.nextInt();
        System.out.print("Ingrese el DNI del cliente: ");
        dniCliente = leer.nextLong();
        System.out.print("Ingrese el saldo actual: ");
        saldoActual = leer.nextDouble();
        System.out.println("Cuenta creada exitosamente.");
    }

    public void ingresar(double ingreso) {
        saldoActual += ingreso;
        System.out.println("saldo ingresado" + ingreso );
    }

    public void retirar(double retiro) {
        if (retiro <= saldoActual) {
            saldoActual -= retiro;
            System.out.println("saldo retirado" + retiro );
        } else {
            saldoActual = 0;
        }
    }

    public void extraccionRapida() {
        double limite = saldoActual * 0.2;
        System.out.print("Ingrese la cantidad a retirar (máximo " + limite + "): ");
        Scanner leer = new Scanner(System.in);
        double retiro = leer.nextDouble();
        if (retiro <= limite) {
            saldoActual -= retiro;
        } else {
            System.out.println("El retiro excede el límite permitido.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo actual: " + saldoActual);
    }

    public void consultarDatos() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("DNI del cliente: " + dniCliente);
        System.out.println("Saldo actual: " + saldoActual);
    }
}

    