/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04extracolecciones;

import Servicio.CodigoServicio;
import java.util.Scanner;

/*Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta
página: https://mapanet.eu/index.htm. Nota: Poner el código postal sin la letra, solo el
número.
• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
• Muestra por pantalla los datos introducidos
• Pide un código postal y muestra la ciudad asociada si existe sino avisa al usuario.
• Muestra por pantalla los datos
• Agregar una ciudad con su código postal correspondiente más al HashMap.
• Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.
• Muestra por pantalla los datos*/
/**
 *
 * @author belugallardo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CodigoServicio cs = new CodigoServicio();
       Scanner leer = new Scanner(System.in);
       
       int opcion;
       
       do{
           menu();
           opcion = leer.nextInt();
           leer.nextLine();
           
           switch(opcion){
               case 1:
                   cs.listadoBase();
                   break;
               case 2: 
                   cs.crearCodigoPostal();
                   break;
               case 3:
                   cs.mostrar();
                   break;
               case 4:
                   cs.buscarPorCodigo();
                   break;
               case 5:
                   cs.eliminarCiudad();
                   break;
               case 6: 
                   System.out.println("Salida exitosa");
                   break;
               default:
                   System.out.println("Opcion invalida");
                   break;
           }
       }while(opcion != 6);
       
    }
    private static void menu(){
        System.out.println("Ingrese la opcion deseada\n"
                + "1 - Cargar listado base\n"
                + "2 - Cargar un nuevo codigo postal\n"
                + "3 - Mostrar listado\n"
                + "4 - Buscar ciudad\n"
                + "5 - Eliminar ciudades existentes\n"
                + "6 - Salir\n");
    }
    
}
