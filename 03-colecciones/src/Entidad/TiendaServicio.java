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
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TiendaServicio {
    private Map<String, Double> productos;

    public TiendaServicio() {
        productos = new HashMap<>();
    }

    public void agregarProducto(String nombre, double precio) {
        productos.put(nombre, precio);
        System.out.println("Producto agregado exitosamente.");
    }

    public void modificarPrecio(String nombre, double nuevoPrecio) {
        if (productos.containsKey(nombre)) {
            productos.put(nombre, nuevoPrecio);
            System.out.println("Precio modificado exitosamente.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public void eliminarProducto(String nombre) {
        if (productos.containsKey(nombre)) {
            productos.remove(nombre);
            System.out.println("Producto eliminado exitosamente.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public void mostrarProductos() {
        System.out.println("Productos en la tienda:");
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            System.out.println("Producto: " + entry.getKey() + ", Precio: " + entry.getValue());
        }
    }
}

