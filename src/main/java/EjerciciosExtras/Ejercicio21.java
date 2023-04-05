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

        int aprobados = 0, desaprobados = 0, n = 3;
        double[] promedios = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("ingrese notas de alumno " + (i + 1));
            double nota1 = leer.nextDouble();
            double nota2 = leer.nextDouble();
            double nota3 = leer.nextDouble();
            double nota4 = leer.nextDouble();
            double promedio = nota1 * 0.1 + nota2 * 0.15 + nota3 * 0.25 + nota4 * 0.5;
            promedios[i] = promedio;
            if (promedio >=7) {
                aprobados++;
            }else {
                desaprobados++;
            }
        }
        System.out.println("promedios");
        for (double promedio : promedios) {
            System.out.println(promedio);
        }
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Desaprobados: " + desaprobados);
    }
}
