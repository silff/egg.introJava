/*
 * Implementar un programa que dado dos numeros enteros determine cual es el mayor
y los muestre por pantalla
 */
package Guia2_condicionales;

import java.util.Scanner;

public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner  (System.in);
       System.out.println("ingrese dos numros enteros");
       int num1 = leer.nextInt();
       int num2 = leer.nextInt();
       System.out.println("los numeros son " + num1 + " y " + num2);
       //System.out.println(Math.max(num1, num2) );
       if (num1 > num2){   
       System.out.println("el mayor es " + num1);
       } else if (num2 > num1) {
            System.out.println("el mayor es " + num2);
       }
    }
    
}

