package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Jose Pintado
 */
public class Ejercicio_20 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        char letra;
        System.out.print("Ingresar una vocal: ");
        letra = entrada.next().charAt(0);

        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(letra + " : Es una vocal");
                break;
            default:
                System.out.println(letra + " Es una consonante");
        }
        entrada.close();
    }
}
