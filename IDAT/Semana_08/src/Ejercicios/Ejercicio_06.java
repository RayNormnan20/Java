package Ejercicios;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

/**
 *
 * @author Lenovo
 */
public class Ejercicio_06 {

    public static void main(String[] args) {

        System.out.println("El día del trabajo es: " + Festejable.DIADELTRABAJO);
        System.out.println("El día de la independencia del Perú es: " + Festejable.INDEPENDENCIA1);
        System.out.println("El día de todos los santos es: " + Festejable.TODOSSANTOS);

        System.out.println("Jueves Santo es: " + Festejable.getJuevesSanto("06/04/2023"));
        System.out.println("Viernes Santo es: " + Festejable.getViernesSanto("06/04/2023"));
        System.out.println("Domingo de Pascua es: " + Festejable.getDomingoPascua("06/04/2023"));
        Felicitaciones feliz = new Felicitaciones();
        feliz.felicitar("28/07");
    }
}

interface Festejable {

    String ANONUEVO = "01/01";
    String DIADELTRABAJO = "01/05";
    String SANPEDROSANPABLO = "29/06";
    String INDEPENDENCIA1 = "28/07";
    String INDEPENDENCIA2 = "29/07";
    String BATALLAJUNIN = "06/08";
    String SANTAROSA = "30/08";
    String COMBATEANGAMOS = "08/10";
    String TODOSSANTOS = "01/11";
    String INMACULADACONCEPCION = "08/12";
    String BATALLAAYACUCHO = "09/12";
    String NAVIDAD = "25/12";

    void felicitar(String today);

    static String getJuevesSanto(String lunaLlena) {
        return calcularSemanaSanta(lunaLlena, 'J');
    }

    static String getViernesSanto(String lunaLlena) {
        return calcularSemanaSanta(lunaLlena, 'V');
    }

    static String getDomingoPascua(String lunaLlena) {
        return calcularSemanaSanta(lunaLlena, 'D');
    }

    private static String calcularSemanaSanta(String lunaLlena, char dia) {
        LocalDate fecha = LocalDate.parse(lunaLlena, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        fecha = fecha.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        switch (dia) {
            case 'J':
                fecha = fecha.minusDays(3);
                break;
            case 'V':
                fecha = fecha.minusDays(2);
                break;
        }
        return fecha.format(DateTimeFormatter.ofPattern("dd/MM"));
    }

}

class Felicitaciones implements Festejable {

    @Override
    public void felicitar(String today) {
        switch (today) {
            case ANONUEVO:
                System.out.println("Feliz Ano Nuevo");
                break;
            case DIADELTRABAJO:
                System.out.println("Feliz Día del Trabajo");
                break;
            case SANPEDROSANPABLO:
                System.out.println("Feliz Día de san Pedro y San Pablo");
                break;

            case INDEPENDENCIA1:
            case INDEPENDENCIA2:
                System.out.println("Felices Fiestas Patrias. Vival el Perú!!!");
                break;

            case BATALLAJUNIN:
                System.out.println("Feliz Aniversario de la Batalla de Junin");
                break;
            case SANTAROSA:
                System.out.println("Feliz Día de Santa Rosa de Lima");
                break;
            case COMBATEANGAMOS:

                System.out.println("Feliz Aniversario del Combate de Angamos");
                break;
            case TODOSSANTOS:
                System.out.println("Feliz Día de Todos los Santos");
                break;
            case INMACULADACONCEPCION:

                System.out.println("Feliz Día de la Inmaculada Concepción");
                break;
            case BATALLAAYACUCHO:

                System.out.println("Feliz Aniversario de la Batalla de Ayacucho");
                break;
            case NAVIDAD:
                System.out.println("Feliz Navidad");
                break;
        }
    }
}
