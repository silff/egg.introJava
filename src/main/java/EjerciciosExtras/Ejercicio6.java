/*Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general
 */
package EjerciciosExtras;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int count = 0;
        double suma = 0;
        double suma2 = 0;
        System.out.println("ingrese la cantidad de personas a promediar");
        int n = leer.nextInt();
        for (int i = 0; i < n; i++) {
            double altura;
            do {
                System.out.println("altura (entre 0.5 y 2.5 mts) de la persona n° " + (i + 1));
                altura = leer.nextDouble();
            } while (altura < 0.5 || altura > 2.5);

            suma = suma + altura;
            if (altura < 1.6) {
                count++;
                suma2 = suma2 + altura;
            }
        }
        System.out.println("promedio gral = " + suma / n);
        System.out.println("promedio por debajo 1.6 = " + suma2 / count);
    }

}
