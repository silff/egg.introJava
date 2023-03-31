/*
 Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
package EjerciciosExtras;

public class Ejercicio20 {

    public static void main(String[] args) {
        
        int[] vector = new int[10];
        llenarVector(vector, 10);
        mostrarVector(vector, 10);
    }

    public static void llenarVector(int[] v, int n) {
        
        for (int i = 0; i < n; i++) {
            v[i] = (int) (Math.random() * 10 - 1);
        }
    }
    
    public static void mostrarVector(int[] v, int n) {
        
        for (int i = 0; i < n; i++) {
            System.out.print(v[i]);
        }
    }
}
