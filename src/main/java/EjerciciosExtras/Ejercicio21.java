/*
Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso
 */
package EjerciciosExtras;

import java.util.Scanner;

public class Ejercicio21 {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        int n = 2; //cantidad de alumnos
        String[] examen = {"tp1", "tp2", "parcial1", "parcial2"};
        int[] alumnos = new int[n];
        double[][] notas = new double[n] [examen.length];
        double[] promPyT = new double[examen.length + 1];

        cargarDatos(examen, alumnos, notas, promPyT, n);
        mostrarDatos(examen, alumnos, notas, promPyT, n);
    }

    public static void cargarDatos(String[] examen, int [] alumnos, double[][] notas, double[] promPyT, int n) {
      
        for (int i = 0; i < n; i++) {
            alumnos[i] = i + 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < examen.length; j++) {
                System.out.println("ingresar nota " + examen[j] + " del alumno n° " + alumnos[i]);
                        notas [i] [j] = leer.nextDouble();                 
                }
            }
        for (int i = 0; i < n; i++) {
            promPyT[i] = notas[i][0] * 0.1;
        }
        }

    

    public static void mostrarDatos(String[] examen, int [] alumnos, double[][] notas, double[] promPyT, int n) {
        
        for (int i = 0; i < n; i++) {
             System.out.print("notas alumno " + alumnos[i] );
             System.out.println("");
            for (int j = 0; j < examen.length; j++) {
                System.out.print(notas[i][j] + " ");
            }
            System.out.println("");
        }
        for (int i = 0; i < n; i++) {
            System.out.println(promPyT[i]);
        }
    }
}
