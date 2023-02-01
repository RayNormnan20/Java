package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Jose Pintado
 */
public class Ejercicio_04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a, b, c;

        System.out.print("Ingresar el primer numero: ");
        a = entrada.nextInt();
        System.out.print("Ingresar el segundo numero: ");
        b = entrada.nextInt();
        System.out.print("Ingresar el segundo numero: ");
        c = entrada.nextInt();

        System.out.println("El resultado de ( a > b ) && (b < c) es: " + ((a > b) && (b < c)));
        System.out.println("El resultado es: ((a + b) < c ) || (( a - c ) > b) es: " + (((a + b) < c) || ((a - c) > b)));
        System.out.println("El resultado es: (a + b > b || ! ((a + b) == c) es: " + (((a + b) > b) || !((a + b) == c)));
    }
}
