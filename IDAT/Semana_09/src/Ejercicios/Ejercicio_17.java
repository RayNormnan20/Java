package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Ejercicio_17 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String correo;
        System.out.print("Ingrese el correo electronico: ");

        correo = entrada.nextLine();

        try {
            validarCorreo(correo);
            System.out.println("El correo " + correo + " es valido.");
        } catch (CheckedException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void validarCorreo(String correo) throws CheckedException {
        int arroba = correo.indexOf("@");
        if (arroba == -1) {
            throw new CheckedException("El correo debe tener el '@'.");
        }
        String izquierda = correo.substring(0, arroba);
        String derecha = correo.substring(arroba  + 1);

        if (!izquierda.matches("[a-zA-Z0-9-]+")) {
            throw new CheckedException("El lado izquierdo del correo debe contener solo letras, numeros y guiones.");
        }
 
        if (!derecha.matches("[a-zA-Z]+(\\.[a-zA-Z]{2,3}){1,2}")) {
            throw new CheckedException("El lado derecho del correo debe contener al menos un punto y despues del ultimo punto debe tener solo 2 o 3 caracteres.");
        }
    }

    public static class CheckedException extends Exception {

        public CheckedException(String message) {
            super(message);
        }
        
    }
    
}
