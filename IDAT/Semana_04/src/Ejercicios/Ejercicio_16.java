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
public class Ejercicio_16 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int inferior, superior;

        System.out.print("Introduce el limite inferior del rango: ");
        inferior = entrada.nextInt();
        System.out.print("Introduce el límite superior del rango: ");
        superior = entrada.nextInt();

        int sumaPares = 0;
        int multiplicacionImpares = 1;

        for (int i = inferior; i <= superior; i++) {
            if (i % 2 == 0) {  // es par
                sumaPares += i;
            } else {  // es impar
                multiplicacionImpares *= i;
            }
        }

        System.out.println("La suma de los números pares en el rango es: " + sumaPares);
        System.out.println("La multiplicación de los números impares en el rango es: " + multiplicacionImpares);

    }
}
