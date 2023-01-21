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
public class Ejercicio_02 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int num;
        
        System.out.print("Ingrese el primer numero: ");
        num = scaner.nextInt();
        num = num * 2;
        System.out.println("El doble del numero es: " + num);
        scaner.close();
    }
}
