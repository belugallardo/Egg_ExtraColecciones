/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02extracolecciones;

import Servicio.CantanteServicio;
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
       CantanteServicio cs = new CantanteServicio();
       Scanner leer = new Scanner(System.in);
        int opcion;
        
        cs.listaBase();
        
        do{
            menu();
            opcion = leer.nextInt();
            leer.nextLine();
            
            switch(opcion){
                case 1:
                    cs.crearCantante();
                    break;
                case 2:
                    cs.mostrarCantantes();
                    break;
                case 3:
                    cs.eliminarCantate();
                    break;
                case 4:
                    System.out.println("Salida exitosa");
                    cs.mostrarCantantes();
            }
        }while(opcion !=4);
       
    }
    
    public static void menu(){
       System.out.println("Eliga una opcion: \n"
                + "1 - Agregar un nuevo cantante \n"
                + "2 - Mostrar todos los cantantes \n"
                + "3 - Eliminar un cantante de la lista \n"
                + "4 - Salir \n ");
    }
    
}
