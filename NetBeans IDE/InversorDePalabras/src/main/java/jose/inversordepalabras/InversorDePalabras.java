/*
*Creado por Jose
* Versión 1.0
* Creado 15/09/2022
 */
package jose.inversordepalabras;

import java.util.Scanner;

public class InversorDePalabras {

    public static void main(String[] args) {
        String palabra = "", palabraInvertida = "";
        int longitudPalbra = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Escribe una palabra o frase: ");
        palabra = entrada.nextLine();

        // Aqquí cuanto los acarcteres 
        longitudPalbra = palabra.length();

        while (longitudPalbra != 0) {
            palabraInvertida += palabra.substring(longitudPalbra - 1, longitudPalbra);
            longitudPalbra--;
        }
        System.out.print("Labra invertida: " + palabraInvertida);
        System.out.println("");
    }

}
