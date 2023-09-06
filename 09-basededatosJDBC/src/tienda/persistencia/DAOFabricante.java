/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;

import java.util.ArrayList;
import tienda.entidades.Fabricante;
/**
 *
 * @author Erick Almeida
 */


public class DAOFabricante extends DAO{
    
    public int consultarCodigoF(int codigo) throws Exception{
        try {
            String sql = "SELECT codigo FROM fabricante ORDER BY codigo DESC LIMIT 1";
            consultarBase(sql);
            while (resultado.next()) {
                codigo = resultado.getInt("codigo");
            }                        
            desconectarBase();
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
        return codigo;
    }
    
     public void crearFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("El fabricante no puede estar vacio");
            }
            String sql = "INSERT INTO fabricante (codigo,nombre)" + "values('"
                    + fabricante.getCodigo() + "' , '" + fabricante.getNombre() + "');";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
     
    public void mostrarFabricantes(ArrayList<String> nombres) throws Exception{
        try {
            String sql = "SELECT codigo, nombre FROM fabricante";
            consultarBase(sql);            
            while (resultado.next()) {
                nombres.add(resultado.getString("codigo") + " - " + resultado.getString("nombre"));
            }
            desconectarBase();
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
         
    //7
    public void ingresarFabricante(String sql) throws Exception{
        try {            
            insertarModificarEliminar(sql);                                   
            desconectarBase();            
        } catch (Exception e) {
            desconectarBase();
            
            throw e;
        }
    }
}