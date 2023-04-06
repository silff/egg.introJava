/*
Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y muestre la suma de sus elementos.
 */
package EjerciciosExtras;

public class Ejercicio22 {

    public static void main(String[] args) {

        int n = 5, m = 10, suma = 0;
        int[][] matriz = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                suma += matriz[i][j];
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println("");
        }
        System.out.println("la suma es " + suma);
    }

}
