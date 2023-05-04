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
public class Ejercicio_21 {

    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número menor que 10: ");
        int numero = entrada.nextInt();

        entrada.close();

        for (int i = 9; i >= 1; i--) {
            if (i > numero) {
                continue; // Salta la iteración si se supera el límite ingresado
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
