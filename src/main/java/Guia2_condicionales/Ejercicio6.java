/*Crear un programa que dado un numero determine si es par o impar.
 */
package Guia2_condicionales;

import java.util.Scanner;

public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero entero");
        int num = leer.nextInt();
        if (num % 2 == 0){
            System.out.println("el numero es par");
        }else  {
            System.out.println("el numero es impar");
    }
}
}
