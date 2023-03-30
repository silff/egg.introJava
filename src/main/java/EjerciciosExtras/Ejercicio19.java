/*
 Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
 */
package EjerciciosExtras;

public class Ejercicio19 {

    public static void main(String[] args) {
        int n = 10;
        int[] v1 = new int[n];
        int[] v2 = new int[n];
        boolean compara = true;
        for (int i = 0; i < n; i++) {
            v1[i] = v2[i] = (int) (Math.random() * 10 + 1);
            //v2[i] = (int) (Math.random() * 10 + 1);
        }
        for (int i = 0; i < n; i++) {
            if (v1[i] != v2[i]) {
                 compara = false;
                break;
            } else if (v1[i] == v2[i]) {
                 compara = true;
            }

        }
        System.out.println(compara);
    }

}
