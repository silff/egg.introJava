/*Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 */
package EjerciciosExtras;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num1, num2;
        
        do {
            System.out.println("ingrese el dividendo. debe ser un numero entero mayor a 1");
            num1 = leer.nextInt();
        } while (num1 < 2);
        do {
            System.out.println("ingrese el divisor. debe ser un numero entero mayor a 1");
            num2 = leer.nextInt();
        } while (num2 < 2);
        int resto;
        int cociente = 0;
        do {
            resto = num1 - num2;
            num1 = resto;
            cociente++;
        } while (resto > num2);
        System.out.println("cociente " + cociente);
        System.out.println("resto " + resto);
    }

}
