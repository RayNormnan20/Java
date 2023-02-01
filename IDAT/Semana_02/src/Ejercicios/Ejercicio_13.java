package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Jose Pintado
 */
public class Ejercicio_13 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1, n2, suma, multipliacion;
        double division, resta;
        System.out.print("Ingresar el primer numero: ");
        n1 = entrada.nextInt();
        System.out.print("Ingresar el segundo numero:  ");
        n2 = entrada.nextInt();

        suma = n1 + n2;
        resta = n1 - n2;
        multipliacion = n1 * n2;

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multipliacion es: " + multipliacion);

        if (n2 > 0) {
            division = n1 / n2;
            System.out.println("la division es: " + division);
        } else {
            System.out.println("No se peude hacer esta division");
        }

    }
}
