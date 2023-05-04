package Ejercicio_19;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class CampeonatoFutbol {

    private ArrayList<PartidoFutbol> partidos;

    public CampeonatoFutbol(ArrayList<PartidoFutbol> partidos) throws Exception {
        this.partidos = partidos;
        validarPartidos();
    }

    private void validarPartidos() throws Exception {
        int partidosPorEquipo = partidos.size() / 2;
        for (PartidoFutbol partido : partidos) {
            int countEquipoLocal = 0;
            int countEquipoVisitante = 0;
            for (PartidoFutbol p : partidos) {
                if (p.getEquipoLocal().equals(partido.getEquipoLocal()) || p.getEquipoVisitante().equals(partido.getEquipoLocal())) {
                    countEquipoLocal++;
                }
                if (p.getEquipoLocal().equals(partido.getEquipoVisitante()) || p.getEquipoVisitante().equals(partido.getEquipoVisitante())) {
                    countEquipoVisitante++;
                }
            }
            if (countEquipoLocal != partidosPorEquipo || countEquipoVisitante != partidosPorEquipo) {
                throw new Exception("No todos los equipos tienen la misma cantidad de partidos");
            }
        }
    }

    public String obtenerCampeon() throws Exception {
        ArrayList<String> equipos = new ArrayList<String>();
        ArrayList<Integer> puntos = new ArrayList<Integer>();
        for (PartidoFutbol partido : partidos) {
            int puntosLocal = 0;
            int puntosVisitante = 0;
            if (partido.getGolesLocal() > partido.getGolesVisitante()) {
                puntosLocal = 3;
            } else if (partido.getGolesLocal() < partido.getGolesVisitante()) {
                puntosVisitante = 3;
            } else {
                puntosLocal = 1;
                puntosVisitante = 1;
            }
            int indexEquipoLocal = equipos.indexOf(partido.getEquipoLocal());
            int indexEquipoVisitante = equipos.indexOf(partido.getEquipoVisitante());
            if (indexEquipoLocal == -1) {
                equipos.add(partido.getEquipoLocal());
                puntos.add(puntosLocal);
            } else {
                puntos.set(indexEquipoLocal, puntos.get(indexEquipoLocal) + puntosLocal);
            }
            if (indexEquipoVisitante == -1) {
                equipos.add(partido.getEquipoVisitante());
                puntos.add(puntosVisitante);
            } else {
                puntos.set(indexEquipoVisitante, puntos.get(indexEquipoVisitante) + puntosVisitante);
            }
        }

        // Mayor cantidad de puntos
        ArrayList<String> equiposConMasPuntos = new ArrayList<String>();
        int maxPuntos = 0;
        for (int i = 0; i < equipos.size(); i++) {
            int puntosEquipo = puntos.get(i);
            if (puntosEquipo > maxPuntos) {
                maxPuntos = puntosEquipo;
                equiposConMasPuntos.clear();
                equiposConMasPuntos.add(equipos.get(i));
            } else if (puntosEquipo == maxPuntos) {
                equiposConMasPuntos.add(equipos.get(i));
            }
        }

        // Campeón
        if (equiposConMasPuntos.size() == 1) {
            return equiposConMasPuntos.get(0);
        }

        // Repechaje
        ArrayList<PartidoFutbol> repechaje = new ArrayList<PartidoFutbol>();
        for (int i = 0; i < equiposConMasPuntos.size() - 1; i++) {
            for (int j = i + 1; j < equiposConMasPuntos.size(); j++) {
                PartidoFutbol partido = new PartidoFutbol(equiposConMasPuntos.get(i), equiposConMasPuntos.get(j), 0, 0);
                repechaje.add(partido);
            }
        }
        CampeonatoFutbol campeonatoRepechaje = new CampeonatoFutbol(repechaje);
        return campeonatoRepechaje.obtenerCampeon();
    }
}
