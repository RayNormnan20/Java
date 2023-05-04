/*
 * Desarrollar una aplicación que imprima 
 *  los números del 1 al 9 con excepción del 5.
 */
package Ejercicios;

/**
 *
 * @author Lenovo
 */
public class Ejercicio_03 {
    public static void main(String[] args) {
       for ( int i = 1; i < 10 ; i++){
           if (i == 5)
               continue;
           System.out.println(i);
           
       }
    }
}
