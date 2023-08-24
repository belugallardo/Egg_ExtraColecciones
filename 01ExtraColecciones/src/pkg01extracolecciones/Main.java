/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01extracolecciones;
/*
Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y
los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).
*/
import java.util.ArrayList;
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
     ArrayList <Integer> programa = new ArrayList();
     Scanner leer = new Scanner(System.in);
     Integer num;
     
     do{
     System.out.println("Ingrese un numero entero");
        num = leer.nextInt();
        if(num != -99){
             programa.add(num);
        }
     }while(num!=-99);
     
        System.out.println("Cantidad de valores que se han leido " + programa.size());
        
       int suma = 0;
        for (Integer numero : programa) {
            suma += numero;
        }

        double promedio = (double) suma / programa.size(); // Realiza la división con un double

        System.out.println("La suma total de esos números es de: " + suma);
        System.out.println("El promedio de esos números es de: " + promedio);
    }
    
}
