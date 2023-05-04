package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Ejercicio_13 {

    public static void main(String[] args) throws IngresoIncorrecto {
        int edad;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");

        edad = entrada.nextInt();

        if (edad < 1 || edad > 120) {
            throw new IngresoIncorrecto("Edad incorrecta");
        } else {
            System.out.println("Bienevenido");
        }

    }
}

class IngresoIncorrecto extends Exception {

    public IngresoIncorrecto() {
        super();
    }

    public IngresoIncorrecto(String message) {
        super(message);
    }
}
