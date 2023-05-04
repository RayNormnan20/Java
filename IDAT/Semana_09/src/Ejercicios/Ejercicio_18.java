// Arreglos numéricos
package Ejercicios;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Ejercicio_18 {

    public static void main(String[] args) {
        int[][] arreglo = {
            {1, 2, 0, 3, 0, 7},
            {0, 0, 0, 0},
            {0, 6, 9, 8, 0, 9, 6},
            {0, 0, 0, 0, 7, 9, 0, 0},
            {0, 0, 0, 0, 0},
            {8, 7, 0, 8, 9, 0, 8}

        };

        ArrayList<int[]> nuevosArreglos = new ArrayList<int[]>();
        for (int i = 0; i < arreglo.length; i++) {
            int[] arregloSinCeros = eliminarCeros(arreglo[i]);
            if (arregloSinCeros.length > 0) {
                nuevosArreglos.add(arregloSinCeros);
            }
        }
        for (int i = 0; i < nuevosArreglos.size(); i++) {
            int[] arregloActual = nuevosArreglos.get(i);
            for (int j = 0; j < arregloActual.length; j++) {
                System.out.print(arregloActual[j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] eliminarCeros(int[] arreglo) {
        ArrayList<Integer> arregloSinCeros = new ArrayList<Integer>();
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != 0) {
                arregloSinCeros.add(arreglo[i]);
            }
        }
        int[] resultado = new int[arregloSinCeros.size()];
        for (int i = 0; i < arregloSinCeros.size(); i++) {
            resultado[i] = arregloSinCeros.get(i);
        }
        return resultado;
    }
}
