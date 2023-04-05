/*Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los 
muestre por pantalla en orden descendente
 */
package Guia5_Vectores_Matrices;

public class Ejercicio15 {

    public static void main(String[] args) {
        int[] vector = new int[100];
       
        for (int i = 0; i < 100; i++) {
            vector[i] = 100 - i;
        }
        for (int elemento: vector) {
            System.out.print(elemento + " | ");
        }
    }

}
