/*Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de 
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad 
de hijos para averiguar la media de edad de los hijos de todas las familias
 */
package EjerciciosExtras;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad de familias");
        int familias = leer.nextInt();
        int suma = 0, count = 0;
        for (int i = 0; i < familias; i++) {
            System.out.println(1 + "ingrese la cantidad de hijos de la familia n° " + (i + 1));
            int hijos = leer.nextInt();
            for (int j = 0; j < hijos; j++) {
                System.out.println("edad hijo n° " + (j + 1));
                int edad = leer.nextInt();
                suma += edad;
                count++;
            }
        }
        System.out.println("familias: " + familias);
        System.out.println("total hijos: " + count);
        System.out.println("promedio de edades: " + (suma / count));
    }

}
