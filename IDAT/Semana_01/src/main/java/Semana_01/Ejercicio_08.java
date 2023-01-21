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
public class Ejercicio_08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double horasTrabajadas, tarifaPorHora, sueldoBase, montoBonificaccion;
        double  sueldoBruto, montoDescuento, sueldoNeto;
        
        System.out.print("Ingrese la cantidad de horas trabajadas: ");
        horasTrabajadas = entrada.nextDouble();
        System.out.print("Ingrese la tarifa por hora: ");
        tarifaPorHora = entrada.nextDouble();
        
        sueldoBase = horasTrabajadas * tarifaPorHora;
        montoBonificaccion = sueldoBase * 0.20;
        sueldoBruto = sueldoBase + montoBonificaccion;
        montoDescuento = sueldoBruto * 0.10;
        sueldoNeto = sueldoBruto - montoDescuento;
        
        System.out.println("El sueldo básico de un trabajador es: " + sueldoBase);
        System.out.println("El sueldo bruto de un trabajador es: " + sueldoBruto);
        System.out.println("El sueldo neto de un trabajador es: " + sueldoNeto); 
        entrada.close();
    }
}
