package Ejercicios;

/**
 *
 * @author Lenovo
 */
public class Ejercicio_14 {

    public static void main(String[] args) {
        int i, j;

        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                if (i == 0 && j == 0) {
                    // Dejamos un espacio para el 00
                    System.out.print("  ");
                } else if (j == 0) {
                    System.out.print(i + "0 ");
                } else {
                    System.out.print(i + "" + j + " ");
                }
            }
            // Agregamos una línea nueva al final de cada fila
            System.out.println();
        }

    }
}
