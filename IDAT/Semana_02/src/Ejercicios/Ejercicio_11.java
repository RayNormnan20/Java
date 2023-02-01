package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Jose Pintado
 */
public class Ejercicio_11 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1;
        System.out.print("Ingresar un nuemro:  ");
        num1 = entrada.nextInt();
        if (num1 % 2 == 0) {
            System.out.println("EL numero ingresado es par");
        } else {
            System.out.println("El numero ingresado no es par ");
        }
    }
}
