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
public class Ejercicio_06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double dinero, tipCambio, total;
        
        System.out.print("Ingrese la cantidad de dinero en dolares: ");
        dinero = entrada.nextFloat();
        System.out.print("Ingrese el valor del cambio: ");
        tipCambio = entrada.nextFloat();
        
        total = dinero * tipCambio;
        
        System.out.println("La cntidad de soles es: " + dinero);
        System.out.println("Tipo de cambio: " + tipCambio);
        System.out.println("El total en soles es: " + total );
        entrada.close();
        
    }
}
