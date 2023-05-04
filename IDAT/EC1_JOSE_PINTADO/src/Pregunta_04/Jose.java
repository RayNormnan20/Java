package Pregunta_04;

import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class Jose {

    private static String cadena1;
    private static String cadena2;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        boolean contiene;

        System.out.print("Ingresar la 1ra cadena: ");
        cadena1 = entrada.nextLine();
        System.out.print("Ingresar la 2da cadena: ");
        cadena2 = entrada.nextLine();

        validaciones valid = new validaciones();
        contiene = valid.contiene(cadena1, cadena2);

        if (contiene) {
            System.out.println("==================================");
            System.out.println("La cadena 1 contiene a la cadena 2");
        } else {
            contiene = valid.contiene(cadena1, cadena2);
            if (contiene) {
                System.out.println("==================================");
                System.out.println("La cadena 2 contiene a la cadena 1");
            } else {
                System.out.println("======================================");
                System.out.println("Las cadenas son totalmente diferentes.");
            }
        }
    }
}

class validaciones {

    boolean contiene(String cadena1, String cadena2) {
        return cadena1.contains(cadena2);
    }
}
