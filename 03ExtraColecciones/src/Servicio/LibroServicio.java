/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Libro;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author belugallardo
 */
public class LibroServicio {

    private final HashSet<Libro> biblioteca = new HashSet();
    private final Scanner leer = new Scanner(System.in);

    public void crearLibro() {
        boolean seguir = false;

        do {
            Libro libro = new Libro();

            System.out.println("Ingrese el titulo del libro");
            libro.setTitulo(leer.nextLine());

            System.out.println("Ingrese el autor del libro");
            libro.setAutor(leer.nextLine());

            System.out.println("Ingrese la cantidad de ejemplares");
            libro.setNumEjemplares(leer.nextInt());
            leer.nextLine();
            
            libro.setNumEjemplaresPrestados(0);

            biblioteca.add(libro);
            System.out.println("¿Desea guardar otro libro? S/N");
            String respuesta;

            do {
                respuesta = leer.nextLine();
                if (respuesta.equalsIgnoreCase("S") || respuesta.equalsIgnoreCase("N")) {
                    seguir = respuesta.equalsIgnoreCase("S");
                } else {
                    System.out.println("Respuesta inválida. Ingrese S o N.");
                }
            } while (!respuesta.equalsIgnoreCase("S") && !respuesta.equalsIgnoreCase("N"));
        } while (seguir);

    }
private Libro buscarLibro(String titulo){
    for (Libro libro : biblioteca) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
}
    
    
    public boolean prestamo() {
        System.out.println("Ingrese el titulo del libro");
        String titulo = leer.nextLine();
        Libro libro = buscarLibro(titulo);
        
         if (libro != null) {
            int numEjemplares = libro.getNumEjemplares();
            int numEjemplaresPrestados = libro.getNumEjemplaresPrestados();
            if (numEjemplares > numEjemplaresPrestados) {
                libro.setNumEjemplares(numEjemplares - 1);
                libro.setNumEjemplaresPrestados(numEjemplaresPrestados + 1);
                return true;
            } else {
                System.out.println("El libro " + titulo + " no se encuentra disponible para préstamo");
            }
        } else {
            System.out.println("El libro " + titulo + " no se encuentra en la biblioteca");
        }
        return false;
    }

    public boolean devolucion() {

        System.out.println("Ingrese el titulo del libro");
        String titulo = leer.nextLine();
        Libro libro = buscarLibro(titulo);

            if (libro != null) {
            int numEjemplares = libro.getNumEjemplares();
            int numEjemplaresPrestados = libro.getNumEjemplaresPrestados();
            if (numEjemplaresPrestados > 0) {
                libro.setNumEjemplares(numEjemplares + 1);
                libro.setNumEjemplaresPrestados(numEjemplaresPrestados - 1);
                return true;
            } else {
                System.out.println("El libro " + libro.getTitulo() + " no está disponible para devolucion");
            }
        } else {
            System.out.println("El libro " + titulo + " no se encuentra en la biblioteca");
        }
        return false;

    }

    public void mostrarLibros() {
        System.out.println("Listado de libros");

        for (Libro libro : biblioteca) {
            System.out.println(libro);

        }
    }
}
