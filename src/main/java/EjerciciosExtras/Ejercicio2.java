/*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package EjerciciosExtras;


public class Ejercicio2 {

   
    public static void main(String[] args) {
       
        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;
        int aux;
        System.out.println("A = " + A + "\nB = " + B + "\nC = " + C + "\nD = " + D);
        System.out.println("------");
        aux = B;
        B = C;           //b = c
        C = A;           //c = a
        A = D;           //a = d
        D = aux;         //d = b
        System.out.println("A = " + A + "\nB = " + B + "\nC = " + C + "\nD = " + D);
    }
    
}
