/* Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package Guia5_Vectores_Matrices;

import java.util.Scanner;

public class Ejercicio20 {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int [] [] cuadrado = new int [3] [3];
        llenarCuadrado(cuadrado);
        mostrarCuadrado(cuadrado);
        
    }
    
    public static void llenarCuadrado(int cuadrado[][]) {
        int num;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cuadrado[i] [j] = 0;
            } 
        }
        
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                do {
                    System.out.println("ingrese un numero del 1 al 9 sin repetir");
                    num = leer.nextInt(); 
                       if (num < 1 || num > 10) {
                           System.out.println("fuera de rango");
                        }
                        
                    
                } while (num < 1 || num > 10);
                cuadrado[i] [j] = num;
            }
        }
    }
    
    public static void mostrarCuadrado(int cuadrado[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("|" + cuadrado[i] [j] + "|");
            }
            System.out.println("");
        }
    }
    
    public static void comprobar() {
        
    }
}

