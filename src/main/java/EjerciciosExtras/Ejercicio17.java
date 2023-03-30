/*
 Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos 
por parámetro para que nos indique si es o no un número primo, debe devolver true si es 
primo, sino false.
Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es 
primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo
 */
package EjerciciosExtras;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();
        boolean nPrimo = primo(num);
    }
    
    public static boolean primo(int n) {
        boolean esPrimo = true;
        
        if (true ) {
            
        }
        
        return esPrimo;
    }
}
