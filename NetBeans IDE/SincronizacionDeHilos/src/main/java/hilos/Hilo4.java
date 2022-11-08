package hilos;

public class Hilo4 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("E");

            try {
                Hilo4.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error en la clase Hilo4 " + e);
            }
        }
    }
}
