/*Escribir un programa que lea un número entero y devuelva el número de dígitos que 
componen ese número. Por ejemplo, si introducimos el número 12345, el programa 
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador 
de división. Nota: recordar que las variables de tipo entero truncan los números o 
resultados
 */
package EjerciciosExtras;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int num, count = 0, aux;
        do {
            System.out.println("ingrese un numero entero");

            while (!leer.hasNextInt()) {
                System.out.println("no es un entero");
                leer.next();
            }
            num = leer.nextInt();

        } while (num < 0);

        do {
            aux = num / 10;
            num = aux;
            count++;
        } while (num > 0);
        System.out.println("el numero ingresado tiene " + count + " digitos");
    }
}
