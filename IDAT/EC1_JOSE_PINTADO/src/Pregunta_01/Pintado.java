package Pregunta_01;

import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class Pintado {

    private static boolean Divisible(int numero) {
        if (numero % 3 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        System.out.print("Ingrese un numero: ");
        numero = entrada.nextInt();

        if (Divisible(numero)) {
            System.out.println("============================================");
            System.out.println("El numero " + numero + " es divisible entre 3.");
        } else {
            System.out.println("============================================");
            System.out.println("El numero " + numero + " NO es divisible entre 3.");
        }
    }
}
