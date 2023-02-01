package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Jose Pintado
 */
public class Ejercicio_19 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int año;

        System.out.print("Ingresar el año: ");
        año = entrada.nextInt();

        if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0) {
            System.out.println("El año es BISIESTO");
        } else {
            System.out.println("El año no es BISIESTO...!!!");
        }
        entrada.close();
    }
}
