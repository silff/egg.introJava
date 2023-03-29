/*Realice un programa para que el usuario adivine el resultado de una multiplicación entre 
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario 
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir 
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como 
utilizar la función Math.random() de Java.
 */
package EjerciciosExtras;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num1 = (int) (Math.random() * 10 + 1);
        int num2 = (int) (Math.random() * 10 + 1);
        int resp, resultado;

        do {
            resultado = num1 * num2;
            System.out.println(resultado);
            System.out.println("adivine el resultado de la multiplicacion de dos numeros enteros del 1 al 9");
            resp = leer.nextInt();
            if (resp == resultado) {
                System.out.println("has adivinado!");
            }
        } while (resp != resultado);

    }

}
