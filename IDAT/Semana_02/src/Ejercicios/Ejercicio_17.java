package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Jose Pintado
 */
public class Ejercicio_17 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int lado1, lado2, lado3;
        System.out.print("Ingrese el 1er lado: ");
        lado1 = entrada.nextInt();
        System.out.print("Ingrese el 2do lado: ");
        lado2 = entrada.nextInt();
        System.out.print("Ingrese el 3er lado: ");
        lado3 = entrada.nextInt();

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("El triangulo es EQUILATERO");
        } else if (lado1 == lado2 && lado1 != lado3 || lado1 != lado2 && lado1 == lado3 || lado2 == lado3 && lado1 != lado3) {
            System.out.println("El tringulo es un ISOSCELES");
        } else {
            System.out.println("El triangulo es un ESCALENO");
        }
        entrada.close();
    }
}
