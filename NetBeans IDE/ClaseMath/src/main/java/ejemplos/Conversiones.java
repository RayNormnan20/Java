package ejemplos;

public class Conversiones {

    public static void main(String[] args) {
        double anguloEnGrados = 45;

        double anguloEnRadianes = Math.toRadians(anguloEnGrados);
        System.out.println("Deg a Rad " + anguloEnGrados + "° = " + anguloEnRadianes + " rad");

        anguloEnGrados = Math.toDegrees(anguloEnRadianes);
        System.out.println("Rad a Deg " + anguloEnRadianes + " Rad = " + anguloEnGrados + "°");
    }
}
