package Ejercicio_19;

import java.util.ArrayList;
import Ejercicio_19.CampeonatoFutbol;
import Ejercicio_19.PartidoFutbol;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class MainCampeonato {

    public static void main(String[] args) throws Exception {
        ArrayList<PartidoFutbol> partidos = new ArrayList<PartidoFutbol>();
        partidos.add(new PartidoFutbol("Equipo A", "Equipo B", 2, 1));
        partidos.add(new PartidoFutbol("Equipo A", "Equipo C", 1, 1));
        partidos.add(new PartidoFutbol("Equipo B", "Equipo C", 0, 1));
        partidos.add(new PartidoFutbol("Equipo C", "Equipo A", 2, 2));
        try {
            CampeonatoFutbol campeonato = new CampeonatoFutbol(partidos);
            String campeon = campeonato.obtenerCampeon();
            System.out.println("El equipo campeón es: " + campeon);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // Solicitar que se ingresen los partidos que faltan
            Scanner entrada = new Scanner(System.in);
            System.out.print("Ingrese el nombre del equipo local: ");
            String equipoLocal = entrada.nextLine();
            System.out.print("Ingrese el nombre del equipo visitante: ");
            String equipoVisitante = entrada.nextLine();
            System.out.print("Ingrese la cantidad de goles del equipo local: ");
            int golesLocal = entrada.nextInt();
            System.out.print("Ingrese la cantidad de goles del equipo visitante: ");
            int golesVisitante = entrada.nextInt();
            PartidoFutbol partidoFaltante = new PartidoFutbol(equipoLocal, equipoVisitante, golesLocal, golesVisitante);
            partidos.add(partidoFaltante);
            CampeonatoFutbol campeonato = new CampeonatoFutbol(partidos);
            String campeon = campeonato.obtenerCampeon();
            System.out.println("El equipo campeón es: " + campeon);
        }

    }
}
