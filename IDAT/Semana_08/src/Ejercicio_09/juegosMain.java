
package Ejercicio_09;

import java.util.Scanner;
import Ejercicio_09.lanzarDados;
import Ejercicio_09.adivinaNumero;
/**
 *
 * @author Lenovo
 */
public class juegosMain {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        jugable juego = null;
        
        System.out.println("");
        System.out.println("Que juego quieres jugar?");
        System.out.println("");
        System.out.println("1. Lanzar Dados");
        System.out.println("");
        System.out.println("2. Adivina el Numero");
        int opcion = entrada.nextInt();
        System.out.println("Escribiste la opcion: " + opcion);

        if (opcion == 1) {
            juego = new lanzarDados();
            System.out.println("El juego es lanzar Dados");
        } else if (opcion == 2) {
            juego = new adivinaNumero();
            System.out.println("El juego es adividar el numero");
        }

        juego.iniciar();

        while (true) {
            juego.jugar();
            if (juego instanceof adivinaNumero && ((adivinaNumero) juego).intentos == 1) {
                System.out.println("Pista: El numero esta entre 1 y 100.");
            }
            System.out.print("Quieres seguir jugando? (s/n) ");
            String continuar = entrada.next();
            if (continuar.equalsIgnoreCase("n")) {
                break;
            }
        }

        juego.finalizar();
    }
}

