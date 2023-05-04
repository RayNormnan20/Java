/*
 * Desarrollar una aplicación que muestre 
el factorial de un número.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Ejercicio_08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, factorial, i;
        System.out.print("Ingrese un número: ");
        num = entrada.nextInt();
        factorial = 1;
        for ( i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
    }
}
