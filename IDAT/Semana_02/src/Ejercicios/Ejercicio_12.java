package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Jose Pintado
 */
public class Ejercicio_12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1, num2;
        System.out.print("Ingresar un numero:  ");
        num1 = entrada.nextInt();
        System.out.print("Ingresar otro numero: ");
        num2 = entrada.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " es mayor que " + num1);

        } else {
            System.out.println("Son numeros iguales");
        }

    }
}
