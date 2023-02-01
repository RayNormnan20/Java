package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Jose Pintado
 */
public class Ejercicio_15 {

    public static void main(String[] args) {
        char letra1, letra2;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa la letra: ");
        letra1 = entrada.next().charAt(0);
        letra2 = letra1;
        if (Character.toUpperCase(letra1) == Character.toLowerCase(letra2)) {
            System.out.println("No ha ingresado una letra...!!!");
        } else if (Character.isUpperCase(letra1)) {
            System.out.println("La letra ingresada esta en mayuscula");
        } else {
            System.out.println("La letra ingresada esta en minuscula");
        }
        entrada.close();
    }
}
