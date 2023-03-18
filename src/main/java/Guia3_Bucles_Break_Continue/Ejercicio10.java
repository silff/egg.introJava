/*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package Guia3_Bucles_Break_Continue;

import java.util.Scanner;

/**
 *
 * @author Silvana
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int limite = 100;
       System.out.println("el limite es " + limite);
        int suma = 0;
       do {
           System.out.println("ingrese un numero");
           int num = leer.nextInt();
          
           suma = suma + num;
       }
         while (suma <= limite);  
       
    }
    
}
