package Ejercicios;

/**
 *
 * @author Lenovo
 */
public class Ejercicio_03 {

    public static void main(String[] args) {
        int[][] matriz = new int[3][2];
        matriz[0][0] = 21;
        matriz[0][1] = 67;
        matriz[1][0] = 19;
        matriz[1][1] = 12;
        matriz[2][0] = 76;
        matriz[2][1] = 91;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
