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
public class Ejercicio_23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese A = asc y B = desc : ");
        String orden = scanner.nextLine();

        scanner.close();

        if (!orden.equalsIgnoreCase("A") && !orden.equalsIgnoreCase("D")) {
            System.out.println("La opción ingresada es inválida...!!!");
            return;
        }

        int inicio, fin, incremento;

        if (orden.equalsIgnoreCase("A")) {
            inicio = 1;
            fin = 100;
            incremento = 1;
        } else {
            inicio = 100;
            fin = 1;
            incremento = -1;
        }

        for (int i = inicio; i != fin + incremento; i += incremento) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println(i);
            } else if (i % 3 != 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }

    }
}
