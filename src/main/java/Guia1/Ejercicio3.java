/*Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package Guia1;

import java.util.Scanner;

/**
 *
 * @author sfappiano
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una frase");
        String frase = leer.nextLine();
        System.out.println("frase en mayusculas es " + frase.toUpperCase());
        System.out.println("frase en mayusculas es " + frase.toLowerCase());
      
    }
    
}
