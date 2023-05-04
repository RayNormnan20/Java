/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author Lenovo
 */
public class Ejercicio_09 {
    public static void main(String[] args) {
        int [] numeros = new int [3];
        numeros[0] = 21;
        numeros[1] = 67;
        numeros[2] = 19;
        numeros[3] = 33;
        
        for(int i=0; i<numeros.length; i++){
            System.out.println(numeros[i]/i);
        }
    }
}
