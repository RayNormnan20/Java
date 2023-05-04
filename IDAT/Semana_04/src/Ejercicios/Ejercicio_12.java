
package Ejercicios;

/**
 *
 * @author Lenovo
 */
public class Ejercicio_12 {

    public static void main(String[] args) {
        int numero = 7; // Definimos el número del que queremos mostrar la tabla de multiplicar
        System.out.println("Tabla de multiplicar del número " + numero + ":");
        for (int i = 1; i <= 10; i++) { // Recorremos los números del 1 al 10
            System.out.println(numero + " x " + i + " = " + (numero * i)); // Mostramos la multiplicación del número por cada valor del 1 al 10
        }
    }
}
