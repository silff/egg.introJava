/*Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los 
muestre por pantalla en orden descendente
 */
package Guia5_Vectores_Matrices;

/**
 *
 * @author sfappiano
 */
public class Ejercicio15 {

    public static void main(String[] args) {
        int[] vector = new int[100];
        
        for (int i = 0; i < 100; i++) {
          vector[i] = i;
        }
        for (int i = 99; i > -1; i--) {
             System.out.print(vector[i] + "/");
        }
    } 
}
