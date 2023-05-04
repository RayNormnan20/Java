package Ejercicios;

/**
 *
 * @author Lenovo
 */
public class Ejercicio_04 {

    public static void main(String[] args) {
        int[][] matriz = {{21, 12}, {67, 76}, {19, 91}};
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.print("\n");
        }

    }
}
