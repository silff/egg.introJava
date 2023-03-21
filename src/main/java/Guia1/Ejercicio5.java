/*Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt()
 */
package Guia1;

import java.util.Scanner;

/**
 *
 * @author sfappiano
 */
public class Ejercicio5 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       System.out.println("ingrese un numero");
       int num = leer.nextInt();
       System.out.println("el doble es " + num * 2);
       System.out.println("el triple es " + num * 3);
       System.out.println("la raiz cuadrada es " + Math.sqrt(num));
    }
    
}
