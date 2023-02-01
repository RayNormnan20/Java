package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Jose Pintado
 */
public class Ejercicio_09 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char letra;

        System.out.print("Ingresar la inicial de una estacion: ");
        letra = entrada.next().toUpperCase().charAt(0);
        switch (letra) {
            case 'V':
                System.out.println("La estacion es Verano");
                break;
            case 'P':
                System.out.println("La estacion es Primavera");
                break;
            case 'I':
                System.out.println("La estacion es Otoño");
                break;
            case 'O':
                System.out.println("La estacion es Otoño");
            default:
                System.out.println("No es una estacion...!!!");
                break;
        }
        entrada.close();
    }
}
