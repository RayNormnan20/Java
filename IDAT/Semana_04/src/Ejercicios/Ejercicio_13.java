package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Ejercicio_13 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, i;
        System.out.print("Ingrese un numero: ");
        num = entrada.nextInt();

        for (i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

    }
}
