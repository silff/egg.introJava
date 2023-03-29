/*
 Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */
package EjerciciosExtras;

public class Ejercicio12 {

    public static void main(String[] args) {
        String contador = "";
        for (int i = 0; i < 1000; i++) {
            if (i < 10) {
                contador = "0-0-".concat(String.valueOf(i));
            } else if (i < 100) {
                contador = "0-".concat(String.valueOf(i).substring(0, 1)) + "-".concat(String.valueOf(i).substring(1, 2));
            } else if (i < 1000) {
                contador = String.valueOf(i).substring(0, 1) + "-".concat(String.valueOf(i).substring(1, 2)) + "-".concat(String.valueOf(i).substring(2, 3));
            }

            System.out.println(contador.replace("3", "E"));
        }
    }
}
/* ver java StringBuilder.append()*/
