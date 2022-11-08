package clases;

import java.util.Scanner;

public class ConConstructor {

    public ConConstructor() {

        Scanner entrada = new Scanner(System.in);
        String nombre = "";

        System.out.print("Cual es tu nombre?: ");
        nombre = entrada.nextLine();
        System.out.println("Tu nombre es: " + nombre);
    }
}
