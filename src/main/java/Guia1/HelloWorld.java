/*Hola Mundo
*/
package Guia1;

import java.util.Scanner;


public class HelloWorld {

    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
    System.out.println("ingrese su nombre");
    String nombre = leer.nextLine();
    System.out.println("Hola mundo, mi nombre es " + nombre);
    
    
    }
    
}
