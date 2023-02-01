package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Jose Pintado
 */
public class Ejercicio_02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a, b;
        boolean condicion = true;

        System.out.print("Ingresar el primer numero: ");
        a = entrada.nextInt();
        System.out.print("Ingresar el segundo numero: ");
        b = entrada.nextInt();

        System.out.println("a es igual que b? : " + (a == b));
        System.out.println("a es menor que b? : " + (a < b));
        System.out.println("a es menor o igual que b? " + (a <= b));
        System.out.println("a es mayor que b? : " + (a > b));
        System.out.println("a es mayor o igual que b? : " + (a >= b));
        System.out.println("a es diferente que b? : " + (a != b));
        System.out.println("Condicion es verdadera? : " + (condicion == true));
    }
}
