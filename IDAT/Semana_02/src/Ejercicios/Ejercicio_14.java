package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Jose Pintado
 */
public class Ejercicio_14 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia;
        System.out.print("Ingresar un numero: ");
        dia = entrada.nextInt();

        switch (dia) {
            case 1:
                System.out.println("El DIA " + dia + " es LUNES");
                break;
            case 2:
                System.out.println("El DIA " + dia + " es MARTES");
                break;
            case 3:
                System.out.println("El DIA " + dia + " es MIERCOLES");
                break;
            case 4:
                System.out.println("El DIA " + dia + " es JUEVES");
                break;
            case 5:
                System.out.println("El DIA " + dia + " es VIERNES");
                break;
            case 6:
                System.out.println("El DIA " + dia + " es SABADO");
                break;
            case 7:
                System.out.println("El DIA " + dia + " es DOMINGO");
                break;
            default:
                System.out.println("No es un dia...!!!");
                break;
        }

    }
}
