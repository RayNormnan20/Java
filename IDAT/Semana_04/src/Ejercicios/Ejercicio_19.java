/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author Lenovo
 */
public class Ejercicio_19 {

    public static void main(String[] args) {
        int n = 5; // Número de filas
        int i, j, numero;

        for (i = 1; i <= n; i++) {
            numero = i;

            for (j = 1; j <= i; j++) {
                System.out.print(numero);
                numero++;
            }
            System.out.println();
        }

    }
}
