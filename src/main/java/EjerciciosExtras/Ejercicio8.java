/*Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package EjerciciosExtras;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num, count = 0, pares = 0,  impares = 0, negativos = 0;
       
        do {
            
            System.out.println("ingrese un numero");
            num = leer.nextInt();
            
                count++;
                if (num > 0 && num % 2 == 0) {
                    pares++;
                } else if (num > 0 && num % 2 != 0) {
                    impares++;
                } else if (num < 0) {
                    negativos++; 
            }
                
        } while (num % 5 != 0);

        System.out.println("numeros leidos: " + (count));
        System.out.println("pares: " + pares);
        System.out.println("impares: " + impares);
        System.out.println("negativos: " + negativos);
    }

}
