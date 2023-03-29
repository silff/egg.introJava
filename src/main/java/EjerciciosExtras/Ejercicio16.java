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
        int personas = leer.nextInt();
        do {            
            
        } while (true);
    }

    public static void pedirNombre(int personas ) {
        
        for (int i = 0; i < personas; i++) {
            System.out.println("nombre de persona n° " + (i + 1));
            String nombre = leer.nextLine();
        }
    }

}
