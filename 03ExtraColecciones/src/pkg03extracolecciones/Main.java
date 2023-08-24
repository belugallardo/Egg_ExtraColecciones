/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg03extracolecciones;

import Servicio.LibroServicio;
import java.util.Scanner;

/**
 *
 * @author belugallardo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       LibroServicio ls = new LibroServicio();
       Scanner leer = new Scanner(System.in);
       int opciones;
       
       do{
           menu();
           opciones = leer.nextInt();
           
           switch(opciones){
               case 1 :
                   ls.crearLibro();
                   break;
               case 2: 
                   ls.prestamo();
                   break;
               case 3: 
                   ls.devolucion();
                   break;
               case 4: 
                   ls.mostrarLibros();
                   break;
               case 5:
                   System.out.println("Salida exitosa");
           }
       }while(opciones!=5);
       
       
    }
    public static void menu(){
        System.out.println("Ingrese su opcion \n"
                + "1 - Cargar un libro\n"
                + "2 - Prestar un libro\n"
                + "3 - Devolver un libro\n"
                + "4 - Mostrar todos los libros\n"
                + "5 - Salir");
        
    }
    
}
