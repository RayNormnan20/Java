/*
Desarrollar una aplicación que muestre
la suma de los 9 primeros números naturales. 
 */
package Ejercicios;

/**
 *
 * @author Lenovo
 */
public class Ejercicio_06 {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 9; i++) {
            sum += i;
        }
        System.out.println("La suma de los 9 primeros números naturales es: " + sum);
    }
}
