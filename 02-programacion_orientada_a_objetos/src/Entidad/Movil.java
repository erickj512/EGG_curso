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

public class Movil {
    private String marca;
    private double precio;
    private String modelo;
    private int memoriaRam;
    private int almacenamiento;
    private int[] codigo;

    public Movil() {}

    public Movil(String marca, double precio, String modelo, int memoriaRam, int almacenamiento, int[] codigo) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

    public void cargarCelular() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la marca: ");
        marca = scanner.nextLine();
        
        System.out.print("Ingrese el precio: ");
        precio = scanner.nextDouble();
        
        scanner.nextLine(); // Consumir el salto de línea
        
        System.out.print("Ingrese el modelo: ");
        modelo = scanner.nextLine();
        
        System.out.print("Ingrese la memoria RAM: ");
        memoriaRam = scanner.nextInt();
        
        System.out.print("Ingrese el almacenamiento: ");
        almacenamiento = scanner.nextInt();
        
        scanner.nextLine(); // Consumir el salto de línea
        
        System.out.println("Ingrese el código de 7 números:");
        codigo = new int[7];
        for (int i = 0; i < 7; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            codigo[i] = scanner.nextInt();
        }
        
        scanner.close();
    }

    
}
