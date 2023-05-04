package Ejercicio_09;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
class adivinaNumero implements jugable {

    private int numero;
    int intentos;

    public void iniciar() {
        Random random = new Random();
        numero = random.nextInt(100) + 1;
        intentos = 0;
    }

    public void jugar() {
        Scanner entrada = new Scanner(System.in);

        int adivinado;

        System.out.print("Adivina el numero: ");
        adivinado = entrada.nextInt();
        intentos++;

        if (adivinado < numero) {
            System.out.println("El numero a adivinar es mayor.");
        } else if (adivinado > numero) {
            System.out.println("El numero a adivinar es menor.");
        }
    }

    public void finalizar() {
        System.out.println("Felicidades, adivinaste el numero en " + intentos + " intentos!");
    }
}
