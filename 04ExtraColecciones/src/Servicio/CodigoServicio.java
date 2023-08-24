/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Codigo;
import java.util.HashSet;
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
public class CodigoServicio {
    private final HashSet <Codigo> listadoCodigo = new HashSet();
    private final Scanner leer = new Scanner(System.in);
    
    public void listadoBase(){
        Codigo c1 = new Codigo("madrid", 28013);
        Codigo c2 = new Codigo("paris", 75005);
        Codigo c3 = new Codigo("budapest", 1052);
        Codigo c4 = new Codigo("roma", 198);
        Codigo c5 = new Codigo("la habana", 10722);
        Codigo c6 = new Codigo("ciudad de mexico", 07050);
        Codigo c7 = new Codigo("cordoba", 5000);
        Codigo c8 = new Codigo("santiago", 8340665);
        Codigo c9 = new Codigo("montevideo", 11000);
        Codigo c10 = new Codigo("asuncion", 001101);
        Codigo c11 = new Codigo("bla bla", 5000);
    
        listadoCodigo.add(c1);
        listadoCodigo.add(c2);
        listadoCodigo.add(c3);
        listadoCodigo.add(c4);
        listadoCodigo.add(c5);
        listadoCodigo.add(c6);
        listadoCodigo.add(c7);
        listadoCodigo.add(c8);
        listadoCodigo.add(c9);
        listadoCodigo.add(c10);
    }
    
    public void crearCodigoPostal(){
        Codigo cp = new Codigo();
        System.out.println("Ingrese la ciudad");
        cp.setCiudad(leer.nextLine());
        
        System.out.println("Ingrese el codigo postal");
        cp.setCodigoPostal(leer.nextInt());
        leer.nextLine();
        listadoCodigo.add(cp);
    }
    
    public void mostrar(){
        listadoCodigo.forEach((codigo) -> {
            System.out.println(codigo);
        });
    }
    
    public void buscarPorCodigo(){
        
        System.out.println("Ingrese el codigo postal a buscar");
        int codigo = leer.nextInt();
        leer.nextLine();
        boolean flag = false;
        for (Codigo codigo1 : listadoCodigo) {
            if(codigo1.getCodigoPostal().equals(codigo)){
                System.out.println("Para ese codigo postal corresponde la ciudad: " + codigo1.getCiudad());
                flag = true;
                break;
            }
            
        }
         if(!flag){
                System.out.println("Esa ciudad no se encuentra disponible en el listado");
            }
    }
    
    public void eliminarCiudad(){
        
        System.out.println("Que ciudad desea eliminar");
        String ciudad = leer.nextLine();
        boolean flag = false;
        for (Codigo codigo : listadoCodigo) {
            if(codigo.getCiudad().equalsIgnoreCase(ciudad)){
                listadoCodigo.remove(codigo);
                System.out.println("Ciudad eliminada correctamente");
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("Esa ciudad no se encuentra disponible para eliminar");
        }
    }
    
}
