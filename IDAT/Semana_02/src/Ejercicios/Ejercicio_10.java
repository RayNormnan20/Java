package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Jose Pintado
 */
public class Ejercicio_10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int mes;
        System.out.print("Ingresar un numero de mes: ");
        mes = entrada.nextInt();

        switch (mes) {
            case 1:
                System.out.println("El mes " + mes + " es Enero");
                break;
            case 2:
                System.out.println("El mes " + mes + " es Febrero");
                break;
            case 3:
                System.out.println("El mes " + mes + " es Marzo");
                break;
            case 4:
                System.out.println("El mes " + mes + " es Abril");
                break;
            case 5:
                System.out.println("El mes " + mes + " es Mayo");
                break;
            case 6:
                System.out.println("El mes " + mes + " es Junio");
                break;
            case 7:
                System.out.println("El mes " + mes + " es Julio");
                break;
            case 8:
                System.out.println("El mes " + mes + " es Agosto");
                break;
            case 9:
                System.out.println("El mes " + mes + " es Setiembre");
                break;
            case 10:
                System.out.println("El mes " + mes + " es Octubre");
                break;

            case 11:
                System.out.println("El mes " + mes + " es Noviembre");
                break;
            case 12:
                System.out.println("El mes " + mes + " es Diciembre");
                break;
            default:
                System.out.println("No es un número de mes...!!!");
                break;
        }

    }
}
