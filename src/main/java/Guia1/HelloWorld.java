/*Hola Mundo
*/
package Guia1;

import java.util.Scanner;

/**
 *
 * @author sfappiano
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
    System.out.println("ingrese su nombre");
    String nombre = leer.nextLine();
    System.out.println("Hola mundo, mi nombre es " + nombre);
    
    
    }
    
}
