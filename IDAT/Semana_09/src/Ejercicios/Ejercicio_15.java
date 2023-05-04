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
        int edad;
        Scanner entrada = new  Scanner (System.in);
        System.out.println("Ingrese su edad: ");
        edad = entrada.nextInt();
        
        try {
            if(validar(edad))
                System.out.println("Bienvenido");
        } catch (IngresoIncorrecto ii) {
            System.out.println(ii.getMessage());
        }
    }
    
    static boolean validar(int edad) throws IngresoIncorrecto{
        if(edad < 1 || edad > 120)
            throw new IngresoIncorrecto("Edad incorrecta");
        else
            return true;
    }
}
class IngresoIncorrecto extends Exception{
    public IngresoIncorrecto(){
        super();
    }
    public IngresoIncorrecto(String message){
        super(message);
    }
}