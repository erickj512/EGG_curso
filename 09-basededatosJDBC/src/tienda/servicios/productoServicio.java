/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicios;

import java.util.ArrayList;
import java.util.Scanner;
import tienda.persistencia.DAOProducto;

/**
 *
 * @author Erick Almeida
 */

public class productoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    DAOProducto DAOP = new DAOProducto();
    fabricanteServicio serviceF = new fabricanteServicio();

    public void listarNombreProductos() throws Exception {
        ArrayList<String> nombres = new ArrayList<>();
        DAOP.listarNombresProductos(nombres);
        nombres.forEach((aux) -> {
            System.out.println(aux);
        });
    }

    public void listarNombrePrecioProductos() throws Exception {
        ArrayList<String> nombres = new ArrayList<>();
        DAOP.listarNombresPreciosProductos(nombres);
        nombres.forEach((aux) -> {
            System.out.println(aux);
        });
    }

    public void productosEntrePrecios() throws Exception {
        ArrayList<String> nombres = new ArrayList<>();
        DAOP.listarProductosEntrePrecios(nombres);
        nombres.forEach((aux) -> {
            System.out.println(aux);
        });
    }

    public void productosPortatiles() throws Exception {
        ArrayList<String> nombres = new ArrayList<>();
        DAOP.listarProductosPortatiles(nombres);
        nombres.forEach((aux) -> {
            System.out.println(aux);
        });
    }

    public void listarProductoMasBarato() throws Exception {
        DAOP.productoMasBarato();
    }

    public void ingresarProducto() throws Exception {
        String codigo = "", nombre = "", precio = "", codFab = "";

        codigo = String.valueOf(Integer.parseInt(DAOP.consultarCodigo(codigo)) + 1);
        System.out.println("Producto N°" + codigo);
        System.out.println("Ingrese el nombre del producto: ");
        nombre = leer.next();
        System.out.println("Ingrese el precio del producto: ");
        precio = leer.next();
        System.out.println("Ingrese el codigo del fabricante: ");
        serviceF.mostrarListaFabricantes();
        codFab = leer.next();

        String sql = "INSERT INTO producto VALUES(" + codigo + ",'" + nombre + "'," + precio + "," + codFab + ");";
        DAOP.ingresarProducto(sql);
    }

    public void eliminarProducto() throws Exception {
        System.out.println("Elija el producto que desea eliminar: ");
        listarNombreProductos();
        String nombreEliminar = leer.next();
        DAOP.eliminarProducto(nombreEliminar);
        System.out.println("Producto eliminado!");

    }

    public void modificarProducto() throws Exception {
        
        String nombre = "", precio = "", codFab = "";
        
        listarNombrePrecioProductos();
        String condicion = "";
        
        System.out.println("Que producto desea modificar: ");
        condicion = leer.next();
        
        System.out.println("--------------");
        System.out.println("Ingrese nuevo nombre de producto: ");
        nombre = leer.next();
        System.out.println("Ingrese el nuevo precio del producto: ");
        precio = leer.next();
        System.out.println("Ingrese el nuevo codigo del fabricante: ");
        serviceF.mostrarListaFabricantes();
        codFab = leer.next();

        String sql = "UPDATE producto SET nombre = '" + nombre + "', precio = " + precio + ", codigo_fabricante = " + codFab + " WHERE nombre LIKE '" + condicion + "';";
        DAOP.editarProducto(sql);
    }

}