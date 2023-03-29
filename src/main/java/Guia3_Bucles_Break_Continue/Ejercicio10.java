/*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package Guia3_Bucles_Break_Continue;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int limite = 100;
        System.out.println("el limite es " + limite);
        int suma = 0;
        do {
            System.out.println("ingrese un numero");
            suma += leer.nextInt();
        } while (suma <= limite);
        System.out.println(suma);

    }

}
