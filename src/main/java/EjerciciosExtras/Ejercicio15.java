/*
 Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, 
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación 
matemática y deben devolver sus resultados para imprimirlos en el main.
 */
package EjerciciosExtras;

import java.util.Scanner;

public class Ejercicio15 {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        int retorno1 = validarEntero();
        int retorno2 = validarEntero();
        int opcion;
        do {
        System.out.println("ingrese una opcion:\n MENU\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir");
        opcion = leer.nextInt();
       
            switch (opcion) {
                case 1:
                    int suma = sumar(retorno1, retorno2);
                    System.out.println("resultado suma " + suma);
                    break;
                case 2:
                    int resta = restar(retorno1, retorno2);
                    System.out.println("resultado resta " + resta);
                    break;
                case 3:
                    int multiplica = multiplicar(retorno1, retorno2);
                    System.out.println("resultado multiplicar " + multiplica);
                    break;
                case 4:
                    double divide = dividir(retorno1, retorno2);
                    System.out.println("resultado dividir " + divide);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("no es una opcion valida");

            }
       } while (opcion != 5);

    }

    public static int sumar(int n1, int n2) {
        int suma;
        suma = n1 + n2;
        return suma;
    }

    public static int restar(int n1, int n2) {
        int resta;
        resta = n1 - n2;
        return resta;
    }

    public static int multiplicar(int n1, int n2) {
        int multiplica;
        multiplica = n1 * n2;
        return multiplica;
    }

    public static double dividir(int n1, int n2) {
        double divide;
        divide = (double) n1 / (double) n2;
        return divide;
    }

    public static int validarEntero() {
        System.out.println("ingrese un entero");
        while (!leer.hasNextInt()) {
            System.out.println("no es un entero");
            leer.next();
        }
        int n = leer.nextInt();
        return n;
    }

}
