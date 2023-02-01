package Ejercicios;

/**
 *
 * @author Jose Pintado
 */
public class Ejercicio_03 {

    public static void main(String[] args) {
        int a = 20, b = 10, c = 10;
        System.out.println("El resultado de ( a > b ) && (b < c) es: " + ((a > b) && (b < c)));
        System.out.println("El resultado es: ((a + b) < c ) || (( a - c ) > b) es: " + (((a + b) < c) || ((a - c) > b)));
        System.out.println("El resultado es: (a + b > b || ! ((a + b) == c) es: " + (((a + b) > b) || !((a + b) == c)));
    }
}
