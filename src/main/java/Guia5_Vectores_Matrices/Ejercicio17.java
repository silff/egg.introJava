/*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package Guia5_Vectores_Matrices;

import java.util.Scanner;


public class Ejercicio17 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese tamaño del vector");
        int n = leer.nextInt();
        int[] vector = new int[n];
        int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;
       
        for (int i = 0; i < n; i++) {
          vector[i] = (int) (Math.random()*99999);  
          System.out.print(vector[i] + "/");
        }
        for (int i = 0; i < n; i++) {
            switch  ( (int) Math.log10(vector[i]) + 1) {
                case 1 -> ++count1;
                case 2 -> ++count2;
                case 3 -> ++count3;
                case 4 -> ++count4;
                case 5 -> ++count5;
                default -> {
                }
            }
        }
        System.out.println("\nnumeros de 1 digito:  " + count1 
               + "\nnumeros de 2 digitos: " + count2 
               + "\nnumeros de 3 digitos: " + count3
               + "\nnumeros de 4 digitos: " + count4
               + "\nnumeros de 5 digitos: " + count5);
    }
    
}
