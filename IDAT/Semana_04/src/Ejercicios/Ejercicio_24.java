/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Ejercicio_24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String respuesta = "S";

        while (respuesta.equalsIgnoreCase("S")) {
            // Mostrar menú de operaciones aritméticas
            System.out.println("Operaciones Aritméticas");
            System.out.println("--------------------------------");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.print("Ingrese el número de la operación a realizar: ");
            int opcion = scanner.nextInt();

            // Solicitar ingreso de los operadores
            System.out.print("Ingrese el primer número: ");
            double num1 = scanner.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            double num2 = scanner.nextDouble();

            // Realizar la operación seleccionada
            double resultado = 0;
            String operacion = "";
            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    operacion = "suma";
                    break;
                case 2:
                    resultado = num1 - num2;
                    operacion = "resta";
                    break;
                case 3:
                    resultado = num1 * num2;
                    operacion = "multiplicación";
                    break;
                case 4:
                    while (num2 == 0) {
                        System.out.println("El segundo número no puede ser cero. Ingrese un número diferente.");
                        num2 = scanner.nextDouble();
                    }
                    resultado = num1 / num2;
                    operacion = "división";
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

            // Mostrar el resultado de la operación
            System.out.println("La " + operacion + " entre " + num1 + " y " + num2 + " sale " + resultado + ".");

            // Preguntar si desea realizar otra operación
            System.out.print("Desea realizar otra operación [S/N]? ");
            respuesta = scanner.next();
        }

        scanner.close();
        System.out.println("Gracias por utilizar la calculadora.");
    }
}

