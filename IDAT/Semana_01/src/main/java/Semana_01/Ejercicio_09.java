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
public class Ejercicio_09 {
    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            
            double nota1, nota2, nota3, nota4, promedio;
        System.out.print("Ingrese la nota de la EC01: ");   
        nota1 = entrada.nextDouble();
        System.out.print("Ingrese la nota de la EC02: ");
        nota2 = entrada.nextDouble();
        System.out.print("Ingrese la nota de la EC03: ");
        nota3 = entrada.nextDouble();
        System.out.print("Ingrese la nota de la EF: ");
        nota4 = entrada.nextInt();
        
        nota1 = nota1 * 0.04;
        nota2 = nota2 * 0.12;
        nota3 = nota3 * 0.24;
        nota4 = nota4 * 0.60;
        promedio = nota1 + nota2 + nota3 + nota4;
        
       
        System.out.println("El promedio final es: " + promedio);
        entrada.close();
        
        
    }
}
