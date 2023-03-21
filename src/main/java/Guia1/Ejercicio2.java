/*Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla
 */
package Guia1;

import java.util.Scanner;

/**
 *
 * @author sfappiano
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese su nombre");
        String nombre = leer.nextLine();
        System.out.println(" su nombre es " + nombre);
      
    }
    
}
