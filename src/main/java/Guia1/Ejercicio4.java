/*Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).
 */
package Guia1;

import java.util.Scanner;


public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese los grados centigrados a convertir en Farenhait");
        float celcius = leer.nextFloat();
        System.out.println("en farenhait: " + (32 + (9 * celcius / 5)));
        
    }
    
}
