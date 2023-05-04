package Ejercicio_09;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Lenovo
 */
interface jugable {

    void iniciar();
    void jugar();
    void finalizar();
}

class lanzarDados implements jugable {

    private String jugador1, jugador2;
    private int dado1, dado2;

    public void iniciar() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el nombre del primer jugador: ");
        jugador1 = entrada.nextLine();
        System.out.print("Ingrese el nombre del segundo jugador: ");
        jugador2 = entrada.nextLine();
    }

    public void jugar() {
        Random random = new Random();
        dado1 = random.nextInt(6) + 1;
        dado2 = random.nextInt(6) + 1;
        System.out.println(jugador1 + " tiro un " + dado1);
        System.out.println(jugador2 + " tiro un " + dado2);
    }

    public void finalizar() {
        if (dado1 > dado2) {
            System.out.println(jugador1 + " ganó!");
        } else if (dado2 > dado1) {
            System.out.println(jugador2 + " ganó!");
        } else {
            System.out.println("Empate...!!!");
        }
    }
}
