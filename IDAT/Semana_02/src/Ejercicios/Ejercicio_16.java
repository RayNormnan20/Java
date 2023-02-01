package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Jose Pintado
 */
public class Ejercicio_16 {

    public static void main(String[] args) {

        int AreaT, AreaC, Base, Altura, Lado, opcion;
        double PI = 3.1416, Radio, AreaCirculo;
        Scanner entrada = new Scanner(System.in);
        System.out.println("======================");
        System.out.println("Opcion1 ==> Triangulo");
        System.out.println("Opcion2 ==> Cuadrado");
        System.out.println("Opcion3 ==> Circulo");
        System.out.println("======================");
        System.out.println("Ingrese opcion a realizar: ");
        opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ingrese base de triangulo:");
                Base = entrada.nextInt();
                System.out.println("Ingrese altura de triangulo:");
                Altura = entrada.nextInt();
                AreaT = Base * Altura;
                System.out.println("El area del triangulo es :" + AreaT);
                break;
            case 2:
                System.out.println("Ingrese lado de cuadrado :");
                Lado = entrada.nextInt();
                AreaC = Lado * Lado;
                System.out.println("El area del cuadrado es :" + AreaC);
                break;
            case 3:
                System.out.println("Ingrese Radio del circulo:");
                Radio = entrada.nextFloat();
                AreaCirculo = PI * Radio;
                System.out.println("El area del circulo es :" + AreaCirculo);
                break;
            default:
                System.out.println("Esta opcion no esta disponible...!!!");
                break;
        }
        entrada.close();
    }
}
