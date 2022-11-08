package clases;

public class ClasePrincipal {

    public static void main(String[] args) {
        HiloProceso hilo1 = new HiloProceso();
        HiloProceso hilo2 = new HiloProceso();

        hilo1.start();

        try {
            hilo1.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error en hilo 1 " + e);
        }

        hilo2.start();
        hilo2.stop();

        try {
            hilo2.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error en hilo 2 " + e);
        }
    }
}
