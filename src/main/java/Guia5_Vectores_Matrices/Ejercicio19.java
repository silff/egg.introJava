/*19. Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
En este caso la matriz es anti simétrica
 */
package Guia5_Vectores_Matrices;

public class Ejercicio19 {

    public static void main(String[] args) {
        int n = 3;
        int[][] matrizA = new int[n][n];
        int[][] matrizB = new int[n][n];
        llenarMatrizA(matrizA, n);
        mostrarMatrizA(matrizA, n);
        System.out.println();
        transponerMatriz(matrizA, matrizB, n);
        System.out.println();
        comprobarAntiSimetrica(matrizA, matrizB, n);
    }

    public static void llenarMatrizA(int mA[][], int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mA[i][j] = (int) (Math.random() * 20 - 10);
            }
        }
    }

    public static void mostrarMatrizA(int matrizA[][], int n) {
        System.out.println("Matriz");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("|" + matrizA[i][j] + "|");
            }
            System.out.println();
        }
    }

    public static void transponerMatriz(int matrizA[][], int matrizB[][], int n) {
        System.out.println("Matriz Transpuesta");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //matrizB[i][j] = (int) (Math.random() * 20 -10); //NO es 
                matrizB[i][j] = matrizA[i][j] * (-1);               // ES
                System.out.print("|" + matrizB[i][j] + "|");
            }
            System.out.println();
        }
    }

    public static void comprobarAntiSimetrica(int matrizA[][], int matrizB[][], int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrizA[i][j] != matrizB[i][j] * (-1)) {
                    break;
                } else {
                    ++count;
                }
            }
        }
        if (count == n * n) {
            System.out.println("ES antisimetrica");
        } else {
            System.out.println("No es antisimetrica");
        }
    }
}
