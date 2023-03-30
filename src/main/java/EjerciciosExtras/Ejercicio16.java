/*
 Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de 
las personas ingresadas por teclado e indique si son mayores o menores de edad. 
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir 
mostrando personas y frenar cuando el usuario ingrese la palabra “No”
 */
package EjerciciosExtras;

import java.util.Scanner;

public class Ejercicio16 {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("cuantas personas?");
        int n = leer.nextInt();
        int[] edad = new int[n];
        String[] nombre = new String[n];

        pedirNombre(nombre, edad, n);

        System.out.println("mostar datos?");
        String answ = leer.next();
        if (answ.equalsIgnoreCase("SI")) {
            mostrarDatos(nombre, edad, n);
        } else {
            System.out.println("adios");
        }

    }

    public static void pedirNombre(String[] nombre, int[] edad, int n) {

        for (int i = 0; i < n; i++) {
            System.out.println("nombre de persona n° " + (i + 1));
            nombre[i] = leer.next();
            System.out.println("edad");
            edad[i] = leer.nextInt();

        }
    }

    public static void mostrarDatos(String[] nombre, int[] edad, int n) {

        for (int i = 0; i < n; i++) {
            System.out.println(nombre[i] + ": " + edad[i]);
            if (edad[i] < 18) {
                System.out.println("Menor de edad");
            } else {
                System.out.println("Mayor de edad");
            }
            System.out.println("siguiente? - para terminar digite NO");
            String sig = leer.next();
            if (sig.equalsIgnoreCase("NO")) {
                break;
            } else {
            }
        }
    }
}
