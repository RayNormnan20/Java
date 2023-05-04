package Yamo;

import Pintado.Vuelo;
import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class Aerolinea {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        char opcion;
        int maletas;
        Vuelo vuelo1 = new Vuelo("Lima", "Bogota", 300, 2);
        Vuelo vuelo2 = new Vuelo("Lima", "Santiago", 350, 2);
        Vuelo vuelo3 = new Vuelo("Lima", "Quito", 320, 2);

        do {
            System.out.println("Oferta de Vuelos");
            System.out.println("----------------");
            System.out.println("Vuelo 1: " + vuelo1.getOrigen() + " - "
                    + vuelo1.getDestino() + ", $ " + vuelo1.getPrecio());
            System.out.println("Vuelo 2: " + vuelo2.getOrigen() + " - "
                    + vuelo2.getDestino() + ", $ " + vuelo2.getPrecio());
            System.out.println("Vuelo 3: " + vuelo3.getOrigen() + " - "
                    + vuelo3.getDestino() + ", $ " + vuelo3.getPrecio());
            System.out.println("\n¿Que vuelo desea comprar? [1][2][3]: ");
            opcion = entrada.next().charAt(0);
            System.out.println("\n¿Cuantas maletas llevara? El valor de las maletas es $ "
                    + vuelo1.getValorMaleta() + ": ");
            maletas = entrada.nextInt();

            switch (opcion) {
                case '1' ->
                    vuelo1.venderPasaje(maletas);
                case '2' ->
                    vuelo2.venderPasaje(maletas);
                case '3' ->
                    vuelo3.venderPasaje(maletas);
                default ->
                    System.out.println("\nOpcion invalida...!!!\n");
            }

        } while (!(vuelo1.getPasajesVendidos() >= vuelo1.getCapacidadAvion() * 0.7
                && vuelo2.getPasajesVendidos() >= vuelo2.getCapacidadAvion() * 0.7
                && vuelo3.getPasajesVendidos() >= vuelo3.getCapacidadAvion() * 0.7));
        entrada.close();

        System.out.println("Resumen de venta de pasajes");
        System.out.println("---------------------------");

        System.out.println("Total venta Vuelo 1 es: " + vuelo1.getPrecio() * vuelo1.getPasajesVendidos());
        System.out.println("Total venta Vuelo 1 es: " + vuelo2.getPrecio() * vuelo2.getPasajesVendidos());
        System.out.println("Total venta Vuelo 1 es: " + vuelo3.getPrecio() * vuelo3.getPasajesVendidos());
        System.out.println("Total de las ventas de hoy es: " + (vuelo1.getTotalVenta() + vuelo2.getTotalVenta()
                + vuelo3.getTotalVenta()));
    }
}
