/*Crea una aplicación que a través de una función nos convierta una cantidad de euros 
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La 
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será 
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio 
(void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
 */
package Guia4_Funciones;

import java.util.Scanner;


public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad de euros que desar convertir");
        double cantidadEuros = leer.nextDouble();
        System.out.println("a que moneda quiere convertir(dolares, libras, yenes)");
        String moneda = leer.next();
        convertirMoneda(cantidadEuros, moneda); 
    } 
    
    public static void convertirMoneda(double cantidadEuros, String moneda) {
    double tasaCambio = 0;
    switch(moneda) {
        case "dolares" -> tasaCambio = 1.28611;
        case "yenes" -> tasaCambio = 129.852;
        case "libras" -> tasaCambio = 0.86;
        default -> System.out.println("Moneda no válida");    
    }
    System.out.println(cantidadEuros + " € equivalen a " + (cantidadEuros * tasaCambio + " " + moneda));
}
}

