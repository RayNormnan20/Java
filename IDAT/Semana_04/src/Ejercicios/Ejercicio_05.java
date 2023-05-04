/*
 * . Desarrollar una aplicación que muestre las 
     combinaciones de números enteros que suman 9.
Tip: Usar doble variable en la declaración del “for”.

 */
package Ejercicios;

/**
 *
 * @author Lenovo
 */
public class Ejercicio_05 {
    public static void main(String[] args) {
        for (int i = 0, j = 9; i < 10; i++, j--){
            System.out.println(Integer.toString(i) + " y " + Integer.toString(j));
        }
    }
}
