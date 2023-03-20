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
        int[] vector = new int[n];
        
        for (int i = 0; i < n; i++) {
          vector[i] = (int) (Math.random()*10+1);  
            System.out.print(vector[i] + "/");
        }
        System.out.print("\n");
        System.out.println("que numero quiere buscar dentro del vector?");
        int num = leer.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (num == vector[i]) {
                System.out.println("el numero se encuentra en la posicion");
                System.out.println( i); 
                count = count + 1;
                if (count == 0) {
                    System.out.println("el numeo no esta");
                }
            }
            
        }
       
    }
}
    

