package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Jose Pintado
 */
public class Ejercicio_23 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int mes;
        int dias;

        System.out.print(
                "Ingrese un número entero entre 1 y 12: ");
        mes = entrada.nextInt();

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30;
                break;
            case 2:
                dias = 28;
                break;
            default:
                dias = 0;
                System.out.println("El número ingresado no es válido.");
                break;
        }

        if (dias > 0) {
            System.out.println("El mes tiene " + dias + " días.");
        }
    }
}
