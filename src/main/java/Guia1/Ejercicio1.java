/*
 *Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma
 */
package Guia1;

import java.util.Scanner;

/**
 *
 * @author sfappiano
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
         System.out.println("ingrese dos numeros enteros");
         int num1 = leer.nextInt();
         int num2 = leer.nextInt();
         System.out.println("la suma es " + (num1+num2));
        // TODO code application logic here
    }
    
}
