package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Jose Pintado
 */
public class Ejercicio_07 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a, b;

        System.out.print("Ingresar 1er numero: ");
        a = entrada.nextInt();
        System.out.print("Ingresar el 2do numero: ");
        b = entrada.nextInt();

        if (a > b) {
            System.out.println(a + " es mayor que " + b);
        } else if (a == b) {
            System.out.println(a + " es igual a " + b);
        } else {
            System.out.println(a + " no es mayor que " + b);
        }
        entrada.close();

    }
}
