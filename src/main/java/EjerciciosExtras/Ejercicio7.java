/*
 Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
 */
package EjerciciosExtras;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("elija una opcion \nA - While \nB -Do -While");
        String opcion = leer.next().toLowerCase();
        switch (opcion) {
            case "a":
                System.out.println("determine la cantidad de numeros a ingresar");
                int n = leer.nextInt();
                int max = 0;
                int min = 999999999;
                double suma = 0;
                int aux = n;

                while (n > 0) {
                    System.out.println("ingrese un numero");
                    int num = leer.nextInt();

                    suma = suma + num;
                    if (num > max) {
                        max = num;
                    }

                    if (num < min) {
                        min = num;
                    }
                    --n;
                }
                System.out.println("el maximo es " + max);
                System.out.println("el minimo es " + min);
                System.out.println("el promedio es " + suma / aux);

                break;
            case "b":

                System.out.println("determine la cantidad de numeros a ingresar");
                n = leer.nextInt();
                max = 0;
                min = 999999999;
                suma = 0;
                aux = n;
                do {
                    System.out.println("ingrese un numero");
                    int num = leer.nextInt();

                    suma = suma + num;
                    if (num > max) {
                        max = num;
                    }

                    if (num < min) {
                        min = num;
                    }
                    --n;
                } while (n > 0);
                System.out.println("el maximo es " + max);
                System.out.println("el minimo es " + min);
                System.out.println("el promedio es " + suma / aux);

                break;

            default:
                System.out.println("ingrese una opcion valida");
        }
    }
}
