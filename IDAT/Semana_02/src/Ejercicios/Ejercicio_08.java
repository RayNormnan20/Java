package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Jose Pintado
 */
public class Ejercicio_08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a;

        System.out.println("Ingresar el 1er numero: ");
        a = entrada.nextInt();

        if ((a >= 1) && (a <= 9)) {
            System.out.println(a + " esta entre 1 y 9 ");
        } else if ((a >= 10) && (a <= 10)) {
            System.out.println(a + " esta entre 10 y 19");
        } else if ((a >= 20) && (a <= 29)) {
            System.out.println(a + " esta entre 20 y 29");
        } else {
            System.out.println(a + "No esta entre 1 y 29");
        }
        entrada.close();

    }
}
