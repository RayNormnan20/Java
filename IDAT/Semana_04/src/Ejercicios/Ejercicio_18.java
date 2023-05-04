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
public class Ejercicio_18 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int inicio, fin;
        System.out.print("Ingrese el número inicial del rango: ");
        inicio = entrada.nextInt();
        System.out.print("Ingrese el número final del rango: ");
        fin = entrada.nextInt();

        for (int i = inicio; i <= fin; i++) {
            if (i % 3 == 0) {
                // Si es múltiplo de 3, se salta la iteración
                continue;
            }
            if (i % 7 == 0) {
                // Si es múltiplo de 7, se termina el bucle
                break;
            }
            System.out.print(i + " ");
        }
    }
}
