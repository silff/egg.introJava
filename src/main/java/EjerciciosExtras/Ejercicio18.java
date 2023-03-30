/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.
 */
package EjerciciosExtras;

import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        System.out.println("tamaño del vector");
        int v = leer.nextInt();
        int[] vector = new int[v];
        int sum = 0;
        System.out.println("ingrese los valores");
        for (int i = 0; i < v; i++) {
            vector[i] = leer.nextInt();
            sum += vector[i];
        }
        System.out.println("la suma " + sum);
    }
    
}
