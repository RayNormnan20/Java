package Pregunta_02;

import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class JosePintado {

    protected double celsius;
    protected double Farenheit;

    public void lecturaCelsius() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        celsius = entrada.nextDouble();
    }

    protected void calculoFarenheit() {
        Farenheit = (celsius * 1.8) + 32;
    }

    public void mostrarFarenheit() {
        System.out.println("===============================================================");
        System.out.println("Su equivalente en grados Farenheit es: " + (int) Farenheit + " °F");
    }

    public static void main(String[] args) {
        JosePintado app = new JosePintado();
        app.lecturaCelsius();
        app.calculoFarenheit();
        app.mostrarFarenheit();
    }
}
