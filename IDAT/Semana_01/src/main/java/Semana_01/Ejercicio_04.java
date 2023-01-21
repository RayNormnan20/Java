/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana_01;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Ejercicio_04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double costo, precio;
        System.out.print("¿Cual es el costo del producto? ");
        costo = entrada.nextFloat();
        precio = costo * 1.18;
        System.out.println("El precio del producto es " + precio);
        entrada.close( );
    }
}
