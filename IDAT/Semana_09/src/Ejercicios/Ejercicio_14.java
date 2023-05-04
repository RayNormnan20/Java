package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Ejercicio_14 {

    public static void main(String[] args) throws IngresoIncorrecto {
        int edad;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");

        edad = entrada.nextInt();
        if (validar(edad)) {
            System.out.println("Bienvenido");

        }
    }

    static boolean validar(int edad) throws IngresoIncorrecto {
        if (edad < 1 || edad > 120) {
            throw new IngresoIncorrecto("Edad incorrecta");
        } else {
            return true;
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
