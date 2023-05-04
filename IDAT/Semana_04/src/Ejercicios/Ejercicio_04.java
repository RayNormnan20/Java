/*
 Desarrollar una aplicación que muestre 
los números del 00 al 99.
Tip: Usar un bucle “for” anidado.

 */
package Ejercicios;

/**
 *
 * @author Lenovo
 */
public class Ejercicio_04 {
    
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(Integer.toString(i) + Integer.toString(j));
                
            }
        }
    }
}
