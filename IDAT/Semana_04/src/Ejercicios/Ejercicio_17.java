package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Ejercicio_17 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce una palabra: ");
        String palabra = entrada.nextLine();

        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            System.out.println(c);
        }

    }

}
