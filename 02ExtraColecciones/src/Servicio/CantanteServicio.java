/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.CantanteFamoso;
import java.util.ArrayList;
import java.util.Scanner;

/*
Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5 objetos
de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada cantante
y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el usuario
elija o de salir del programa. Al final se deberá mostrar la lista con todos los cambios
*/
/**
 *
 * @author belugallardo
 */
public class CantanteServicio {
    
    private final ArrayList <CantanteFamoso> listaCantante = new ArrayList();
    Scanner leer = new Scanner(System.in);
    
    public void listaBase() {
        CantanteFamoso cf1 = new CantanteFamoso("Fito Paez", "El amor despues del amor");
        CantanteFamoso cf2 = new CantanteFamoso("Charly García", "Clics Modernos");
        CantanteFamoso cf3 = new CantanteFamoso("Soda Stereo", "Canción Animal");
        CantanteFamoso cf4 = new CantanteFamoso("Andrés Calamaro", "Alta Suciedad");
        CantanteFamoso cf5 = new CantanteFamoso("Divididos", "La Era de la Boludez");
        listaCantante.add(cf5);
        listaCantante.add(cf4);
        listaCantante.add(cf3);
        listaCantante.add(cf2);
        listaCantante.add(cf1);
        
        mostrarCantantes();
        
    }
    public void crearCantante(){
        CantanteFamoso cf = new CantanteFamoso();
        
        System.out.println("Ingese el nombre del cantante");
        cf.setNombre(leer.nextLine());
        
        System.out.println("Ingrese su disco con mas ventas");
        cf.setDiscoConMasVentas(leer.nextLine());

        listaCantante.add(cf);
        
    }
    public void mostrarCantantes(){
        
        System.out.println("Cantantes:");
         listaCantante.forEach((cantanteFamoso) -> {
            System.out.println(cantanteFamoso);
        });
    }
    public void eliminarCantate(){
        System.out.println("Ingrese el nombre del cantante que desea eliminar");
        String artista = leer.nextLine();
        
        for (CantanteFamoso cantanteFamoso : listaCantante) {
            if(cantanteFamoso.getNombre().equalsIgnoreCase(artista)){
                listaCantante.remove(cantanteFamoso);
                break;
            }
            
        }
    }
}
