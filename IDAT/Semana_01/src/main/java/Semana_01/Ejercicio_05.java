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
public class Ejercicio_05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int lado;
        int area;
       
        System.out.print("Ingresar el lado de un cuadrado: ");
        lado = entrada.nextInt();
        area = lado * lado;
        
        System.out.println("El área del cuadrado es: " + area);
        entrada.close();
      
    }
}
