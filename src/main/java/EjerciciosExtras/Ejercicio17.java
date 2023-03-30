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
        System.out.println("ingrese un numero");
        int num = leer.nextInt();
        boolean esPrimo = primo(num);
        System.out.println("es primo? " + esPrimo);
    }

    public static boolean primo(int n) {
        boolean esPrimo;
        int count = 0;
        if (n == 0 || n == 1) {
            esPrimo = false;
        } 
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }   
        esPrimo = count == 1;
        return esPrimo;
    }
}
