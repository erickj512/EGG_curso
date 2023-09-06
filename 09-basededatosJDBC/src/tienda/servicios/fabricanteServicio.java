/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicios;

import java.util.ArrayList;
import java.util.Scanner;
import tienda.persistencia.DAOFabricante;

/**
 *
 * @author Erick Almeida
 */
public class fabricanteServicio {
    DAOFabricante DAOF = new DAOFabricante();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void mostrarListaFabricantes() throws Exception{
        ArrayList<String> nombres = new ArrayList<>();
        DAOF.mostrarFabricantes(nombres);
        nombres.forEach((aux) -> {
            System.out.println(aux);
        });
    }
    
    public void ingresarFabricante() throws Exception{
        System.out.println("Lista de fabricantes: ");
        mostrarListaFabricantes();
        System.out.println("Ingrese el nuevo fabricante: ");
        String nombre = leer.next();
        int codigo = 0;
        codigo = DAOF.consultarCodigoF(codigo) + 1;
        String sql = "INSERT INTO fabricante VALUES(" + codigo + ", '" + nombre + "');";
        DAOF.ingresarFabricante(sql);
        System.out.println("Fabricante Ingresado!");
    }
}

