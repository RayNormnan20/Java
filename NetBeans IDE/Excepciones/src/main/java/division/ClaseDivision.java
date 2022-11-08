package division;

import java.util.Scanner;

public class ClaseDivision {

    public static void main(String[] args) {

        try {
            //Codigo que se ejecute de manera inicial
            int valor1, valor2, resultado;
            Scanner entrada = new Scanner(System.in);

            System.out.print("Dame el primer valor: ");
            valor1 = entrada.nextInt();

            System.out.print("Dame el segundo valor: ");
            valor2 = entrada.nextInt();

            resultado = valor1 / valor2;

            System.out.println("La division es igual a: " + resultado);

        } catch (Exception e) {
            //Comportamiento cuando se genere el error
            System.out.println("Error!!! " + e);
        } finally {
            System.out.println("Operacion concluida!!");
        }

    }
}
