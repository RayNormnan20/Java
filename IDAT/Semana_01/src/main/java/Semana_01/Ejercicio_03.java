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
public class Ejercicio_03 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int num;
        String nombre;
        
        System.out.print("¿Cómo te llmas? ");
        nombre = scaner.next();
        System.out.print("¿Cual es tu edad? ");
        num = scaner.nextInt();
        System.out.println(nombre + ", tienes " + num + " años ");
        scaner.close();
    }   
}
