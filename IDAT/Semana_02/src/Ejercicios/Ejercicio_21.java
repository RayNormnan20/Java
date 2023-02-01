package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Jose Pintado
 */
public class Ejercicio_21 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad;

        System.out.print("Ingresar la edad: ");
        edad = entrada.nextInt();

        if (edad >= 0 && edad <= 5) {
            System.out.println("PRIMERA INFANCIA");
        } else if (edad >= 6 && edad <= 11) {
            System.out.println("INFANCIA");
        } else if (edad >= 12 && edad <= 18) {
            System.out.println("ADOLESCENCIA");
        } else if (edad >= 14 && edad <= 26) {
            System.out.println("JUVENTUD");
        } else if (edad >= 27 && edad <= 59) {
            System.out.println("ADULTEZ");
        } else {
            System.out.println("ADULTEZ MAYOR");
        }
        entrada.close();
    }
}
