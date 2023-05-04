package Ejercicios;

/**
 *
 * @author Lenovo
 */
public class Ejercicio_11 {

    public static void main(String[] args) {
        // Inicializamos el contador en 0
        int contador = 0;
        // Recorremos los números del 21 al 41
        for (int i = 21; i <= 41; i++) {
            // Si el número es múltiplo de 5
            if (i % 5 == 0) {
                // Incrementamos el contador en 1
                contador++;
            }
        }
        // Mostramos el resultado por consola
        System.out.println("La cantidad de números multiplos de 5 en el rango del 21 al 41 es: " + contador);
    }
}
