/*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package Guia3_Bucles_Break_Continue;

import java.util.Scanner;

/**
 *
 * @author Silvana
 */
public class Ejercicio12 {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      String FDE = "&&&&&";
      String cadena;
      int countC = 0;
      int countI = 0;
       do {
         System.out.println("ingrese una cadena de 5 caracteres");
         cadena = leer.nextLine();
         if (cadena.length() == 5 && cadena.substring(0, 1).equals("X") && cadena.substring(4, 5).equals("O")){
             countC = countC + 1;
         } else {
             countI = countI + 1;
         }   
       } while (!cadena.equals(FDE));
       System.out.println("mensajes correctos: " + countC + " \nmensajes incorrectos: " + (countI - 1));
    }
}
