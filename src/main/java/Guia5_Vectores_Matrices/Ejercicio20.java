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
        comprobar(cuadrado);
    }
    
    public static void llenarCuadrado(int cuadrado[][]) {
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               cuadrado[i] [j] = 0; 
            }
        }
        
        int num;
       
        for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++) {
            int k, l;
            boolean repetido;
            do {
               do {
                  System.out.println("Ingrese un número del 1 al 9 sin repetir:");
                  num = leer.nextInt();
                  if (num < 1 || num > 9) {
                        System.out.println("Fuera de rango.");
                    }
                } while (num < 1 || num > 9);
                repetido = false;
                for (k = 0; k < 3; k++) {
                    for (l = 0; l < 3; l++) {
                        if (cuadrado[k][l] == num) {
                            System.out.println("Número repetido.");
                            repetido = true;
                            break;
                        }
                    }
                    if (repetido) {
                        break;
                    }
                }
            } while (repetido);
            cuadrado[i][j] = num;
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
    
    public static void comprobar(int cuadrado[] []) {
     int num = 15;
     int fila = 0;
     int columna = 0;
     int diag = 0;
        for (int i = 0; i < 3; i++) {
            columna = columna + cuadrado[i] [0];
             }  
        System.out.println("columna 1 " + columna);
        
        for (int j = 0; j < 3; j++) {
            fila = fila + cuadrado[0] [j];
        }
        System.out.println("fila 1 " + fila);
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                   diag = diag + cuadrado[i] [j]; 
                }
            }
        }
        System.out.println("digonal ppal " + diag);
        if (diag == num && fila == num && columna == num) {
            System.out.println("el cubo es magico");
        }else {    
            System.out.println("no es magico");
        } 
    }
}
        
    


