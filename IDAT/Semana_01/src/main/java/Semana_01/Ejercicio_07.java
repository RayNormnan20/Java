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
public class Ejercicio_07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int base, area, altura;
        double  perimetro;
        
        System.out.print("Ingrese la base del rectándulo: ");
        base = entrada.nextInt();
        System.out.print("Ingrese la altura del rectángulo: ");
        altura = entrada.nextInt();
        area = base * altura;
        perimetro = (base *  altura) / 2;
        System.out.println("La base es: " + base);
        System.out.println("La altura es: " + altura) ;
        System.out.println("El área del rectángulo es: " + area);
        System.out.println("El perímetro del rectángulo es: " + perimetro);
        entrada.close();
    }
}
