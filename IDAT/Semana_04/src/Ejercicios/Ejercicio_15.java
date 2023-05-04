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
public class Ejercicio_15 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double inversion, interes, cantidad;
        int anios = 0;

        System.out.print("Ingrese la cantidad de dinero invertida: ");
        inversion = entrada.nextDouble();

        System.out.print("Ingrese el interes anual en porcentaje: ");
        interes = entrada.nextDouble();

        cantidad = inversion;

        do {
            cantidad = cantidad * (1 + interes / 100);
            anios++;
        } while (cantidad < inversion * 2);

        System.out.println("La cantidad de años necesarios para duplicar la inversion es: " + anios);
        entrada.close();
    }

}
