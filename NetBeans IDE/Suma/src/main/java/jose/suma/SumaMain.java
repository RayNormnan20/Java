package jose.suma;

import java.util.Scanner;

public class SumaMain {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Dame el primer valor: ");
        int valorUno = entrada.nextInt();

        System.out.print("Dame el segundo valor: ");
        int valorDos = entrada.nextInt();

        //Para comunicar con la clase suma y enviar y pasar datos 
        Suma valores = new Suma(valorUno, valorDos);
        valores.Imprimir();
    }
}
