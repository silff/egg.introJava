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
        System.out.println("ingrese tamaño del cuadraso");
        int n = leer.nextInt();
        int[][] cuadrado = new int[n][n];
        llenarCuadrado(cuadrado, n);
        mostrarCuadrado(cuadrado, n);
        comprobar(cuadrado, n);
    }

    //primera version 3x3 
    /*public static void llenarCuadrado(int cuadrado[][]) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cuadrado[i][j] = 0;
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
                System.out.print("|" + cuadrado[i][j] + "|");
            }
            System.out.println("");
        }
    }

    public static void comprobar(int cuadrado[][]) {
        int num = 15, fila = 0, columna = 0, diag = 0;

        for (int i = 0; i < 3; i++) {
            columna += cuadrado[i][0];
        }
        System.out.println("columna 1 " + columna);

        for (int j = 0; j < 3; j++) {
            fila += cuadrado[0][j];
        }
        System.out.println("fila 1 " + fila);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    diag += cuadrado[i][j];
                }
            }
        }
        System.out.println("digonal ppal " + diag);
        if (diag == num && fila == num && columna == num) {
            System.out.println("el cubo es magico");
        } else {
            System.out.println("no es magico");
        }
    } */
    //segunda version nxn
    public static void llenarCuadrado(int cuadrado[][], int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num;
                do {
                    System.out.println("ingrese un numero del 1 al 9");
                    num = leer.nextInt();
                    if (num < 1 || num > 9) {
                        System.out.println("Fuera de rango.");
                    }
                } while (num < 1 || num > 9);
                cuadrado[i][j] = num;
            }
        }
    }

    public static void mostrarCuadrado(int cuadrado[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("|" + cuadrado[i][j] + "|");
            }
            System.out.println("");
        }
    }

    public static void comprobar(int cuadrado[][], int n) {
        int fila1 = 0;
        //sumar una fila
        for (int j = 0; j < n; j++) {
            fila1 += cuadrado[0][j];
        }
        //comprobar filas
        for (int i = 1; i < n; i++) {
            int filas = 0;
            for (int j = 0; j < n; j++) {
                filas += cuadrado[i][j];
            }
            if (filas != fila1) {
                System.out.println("no es magico");
                return;
            }
        }
        //comprobar columnas
        for (int i = 0; i < n; i++) {
            int columnas = 0;
            for (int j = 0; j < n; j++) {
                columnas += cuadrado[j][i];
            }
            if (columnas != fila1) {
                System.out.println("no es magico");
                return;
            }
        }
        //comprobar diagonales
        int diag1 = 0, diag2 = 0;
        for (int i = 0; i < n; i++) {
            diag1 += cuadrado[i][i];
            diag2 += cuadrado[i][n - i - 1];
        }
        if (diag1 != fila1 || diag2 != fila1) {
                System.out.println("no es magico");
                return;
            }

        System.out.println("es magico");
    }

}
