/*
Desarrollar una aplicación que imprima 
los números del 1 al 9. Interrumpir la 
si “i” es igual a “j”. 
 */
package Ejercicios;

/**
 *
 * @author Lenovo
 */
public class Ejercicio_02 {
    public static void main(String[] args) {
        int i = 1, j = 5;
        while (i < 10){
            if (i == j)
                break;
            System.out.println(i);
            i++;
        }
    }
}
