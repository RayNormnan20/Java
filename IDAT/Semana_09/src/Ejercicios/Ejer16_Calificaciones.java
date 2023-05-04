package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Ejer16_Calificaciones {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] nombres = new String[2];
        double[] notas = new double[2];
        String[] calificaciones = new String[2];

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Ingrese el nombre del alumno " + (i + 1) + ": ");
            nombres[i] = entrada.nextLine();
            try {
                System.out.println("Ingrese la nota del alumno " + (i + 1) + ": ");
                double nota = Double.parseDouble(entrada.nextLine());
                
                if (nota < 0 || nota > 20) {
                    throw new IngresoIncorrecto("La nota debe estar entre 0 y 20.");
                }
                notas[i] = nota;
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un número válido para la nota.");
                i--;
            } catch (IngresoIncorrecto e) {
                System.out.println(e.getMessage());
                i--;
            }
        }

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 18 && notas[i] <= 20) {
                calificaciones[i] = "Sobresaliente";
            } else if (notas[i] >= 16 && notas[i] <= 17.99) {
                calificaciones[i] = "Notable";
            } else if (notas[i] >= 13 && notas[i] <= 15.99) {
                calificaciones[i] = "Bien";
            } else {
                calificaciones[i] = "A Mejorar";
            }
        }

        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i] + " tiene una nota de " + notas[i] + " y su calificación es " + calificaciones[i]);
        }

        entrada.close();
    }
}
