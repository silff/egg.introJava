/*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package EjerciciosExtras;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese cantidad de minutos");
        float mm = leer.nextFloat();
        float hh = mm / 60;
        float dd = hh / 24;
        System.out.println("equivale a horas: " + hh + " dias: " + dd);
    }
    
}
