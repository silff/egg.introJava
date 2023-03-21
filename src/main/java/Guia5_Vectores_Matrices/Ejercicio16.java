/*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al 
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el 
numero y si se encuentra repetido
 */
package Guia5_Vectores_Matrices;

import java.util.Scanner;

/**
 *
 * @author sfappiano
 */
public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese tamaño del vector");
        int n = leer.nextInt();
        int[] array = new int[n];
        
        for (int i = 0; i < n; i++) {
          array[i] = (int) (Math.random()*10+1);  
            System.out.print(array[i] + "/");
        }
        System.out.println("\nque numero quiere buscar dentro del arreglo?");
        int num = leer.nextInt();
        int count = 0;
        System.out.println("el numero " + num);
        for (int i = 0; i < n; i++) {
            if (num == array[i]) {
                ++count;
                System.out.println("se encuentra en la posicion " + i);
                }
        }
        System.out.println("se repite " + count + " veces");
        if (count == 0) {
             System.out.println("no pertenece al arreglo");
            }
    }
}
    

