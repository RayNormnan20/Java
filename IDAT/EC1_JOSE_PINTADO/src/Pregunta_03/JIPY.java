package Pregunta_03;

import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class JIPY {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        char opcion;
        int lado, base, altura;

        System.out.print("Ingrese C para el cuadrado y R para el rectangulo: ");
        opcion = entrada.next().charAt(0);

        switch (opcion) {
            case 'C':
                System.out.print("Ingrese el lado del cuadrado: ");
                lado = entrada.nextInt();
                System.out.print(FiguraGeometrica.calcularPerimetroCuadrado(lado));
                break;
            case 'R':
                System.out.print("Ingrese la base del rectangulo: ");
                base = entrada.nextInt();
                System.out.print("Ingrese la altura del rectangulo: ");
                altura = entrada.nextInt();
                System.out.println(FiguraGeometrica.calcularPerimetroRectangulo(base, altura));
                break;
            default:
                System.out.println("=======================================");
                System.out.println("La opcion ingresada no es valida...!!!");
                break;
        }
        entrada.close();
    }
}

class FiguraGeometrica {

    private FiguraGeometrica() {

    }

    public static String calcularPerimetroCuadrado(int lado) {
        System.out.println("=============================");
        return "El perimetro del cuadrado es: " + (4 * lado);
    }

    public static String calcularPerimetroRectangulo(int base, int altura) {
        System.out.println("============================================");
        return "El perimetro del rectangulo es: " + (2 * (base + altura));
    }
}
