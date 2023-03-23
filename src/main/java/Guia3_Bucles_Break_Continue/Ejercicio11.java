/*Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 */
package Guia3_Bucles_Break_Continue;

import java.util.Scanner;


public class Ejercicio11 {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
     
        System.out.println("ingrese dos numeros enteros");
          int num1 = leer.nextInt();
          int num2 = leer.nextInt();
          int opcion;
          do {
          System.out.println("ingrese una opcion:\n MENU\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir");         
           opcion = leer.nextInt();
          switch (opcion){
              case 1 -> System.out.println(num1 + num2);
              case 2 -> System.out.println(num1 - num2);
              case 3 -> System.out.println(num1 * num2);
              case 4 -> System.out.println(num1 / num2);
              case 5 -> {
                  System.out.println("esta seguro que desea salir del programa? (S/N)");
                  String resp;
                  do {
                      resp = leer.next();
                      if (resp.equalsIgnoreCase("N")){
                      opcion = 0;
                  } else if (resp.equalsIgnoreCase("S")) { 
                      break;
                  }else{
                      System.out.println("debe responder S/N");  
                  }
                  } while (!resp.equalsIgnoreCase("N") || !resp.equalsIgnoreCase("S"));
                }
                default -> System.out.println("no es una opcion valida");
                }
            }while (opcion != 5);                   
   }
 }
