/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import libreria.entidades.Autor;

/**
 *
 * @author Erick Almeida
 */

public class AutorServicio {

    AutorJpaController autorJPA = new AutorJpaController();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearAutor() {
        Autor autor = new Autor();
        try {
            boolean repetido = false;
            System.out.println("-----------------------");
            if (autor == null) {
                System.out.println("No se pueden ingresar datos vacios");
            }
            System.out.println("Ingrese el nombre del autor: ");
            autor.setNombre(leer.next());
            do {
                repetido = false;
                List<Autor> listaAutores = autorJPA.findAutorEntities();
                while (autor.getNombre().trim().isEmpty()) {
                    System.out.println("Error! Ingrese el nombre de su autor: ");
                    autor.setNombre(leer.nextLine());
                }
                for (Autor aux : listaAutores) {
                    if (aux.getNombre().equalsIgnoreCase(autor.getNombre())) {
                        repetido = true;
                        System.out.println("Autor existente! Ingrese un nuevo nombre: ");
                        autor.setNombre(leer.nextLine());
                    }
                }
            } while (repetido);
            autor.setAlta(true);
            autorJPA.create(autor);
            System.out.println("Alta exitosa!");
            System.out.println("-----------------------");
        } catch (Exception e) {
            throw e;
        }
    }

    public void mostrarAutor() throws NonexistentEntityException {
        try {
            List<Autor> listaAutor = autorJPA.findAutorEntities();
            for (Autor aux : listaAutor) {
                System.out.println(aux.toString());
            }
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void eliminarAutor() throws NonexistentEntityException {
        try {
            System.out.println("-----------------------");
            mostrarAutor();
            System.out.println("Ingrese el ID a eliminar: ");
            int idA = leer.nextInt();
            if (!(autorJPA.getEntityManager().find(Autor.class, idA) == null)) {
                autorJPA.destroy(idA);
                System.out.println("Baja exitosa!!");
            } else {
                System.out.println("Error! Autor no encontrado!");
            }
            System.out.println("-----------------------");
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void editarAutor() throws Exception {
        try {
            System.out.println("-----------------------");
            boolean repetido = false;
            mostrarAutor();
            System.out.println("Ingrese el ID a editar: ");
            int idA = leer.nextInt();            
            if (!(autorJPA.getEntityManager().find(Autor.class, idA) == null)) {
                Autor autor = autorJPA.getEntityManager().find(Autor.class, idA);
                do {
                    System.out.println("Ingrese el nuevo nombre del autor: ");
                    autor.setNombre(leer.next());
                    repetido = false;
                    List<Autor> listaAutores = autorJPA.findAutorEntities();
                    while (autor.getNombre().trim().isEmpty()) {
                        System.out.println("Error! Ingrese el nombre de su autor: ");
                        autor.setNombre(leer.nextLine());
                    }
                    for (Autor aux : listaAutores) {
                        if (aux.getNombre().equalsIgnoreCase(autor.getNombre())) {
                            repetido = true;
                            System.out.println("Autor existente! Ingrese un nuevo nombre: ");
                            autor.setNombre(leer.nextLine());
                        }
                    }
                } while (repetido);
                autorJPA.edit(autor);
                System.out.println("Edicion exitosa!");
            } else {
                System.out.println("Error! Autor no encontrado!");
            }
            System.out.println("-----------------------");
        } catch (Exception e) {
            throw e;
        }
    }

    public void buscarAutorNombre() {
        try {
            System.out.println("-----------------------");
            boolean encontrado = false;
            System.out.println("Ingrese el nombre del autor: ");
            String nombreA = leer.next();
            List<Autor> listaAutor = autorJPA.findAutorEntities();
            for (Autor aux : listaAutor) {
                if (aux.getNombre().equalsIgnoreCase(nombreA)) {
                    System.out.println(aux.toString());
                    encontrado = true;
                }
            }
            if (encontrado == false) {
                System.out.println("El autor no existe!");
            }
            System.out.println("-----------------------");
        } catch (Exception e) {
            throw e;
        }

    }
}