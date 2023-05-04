/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author Lenovo
 */
public class Ejercicio_22 {

    public static void main(String[] args) {
        int n = 5; // Número inicial de repeticiones

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(n + " ");
            }
            n--; // Disminuye el número de repeticiones para la siguiente fila
            System.out.println();
        }

    }
}
