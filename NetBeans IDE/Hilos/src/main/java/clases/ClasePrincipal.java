package clases;

public class ClasePrincipal {

    public static void main(String[] args) {

        //Primero se crean las instancias 
        Proceso1 hilo1 = new Proceso1();
        Proceso1 hilo3 = new Proceso1();
        Thread hilo2 = new Thread(new Proceso2());

        hilo1.start();
        hilo2.start();
        hilo3.start();

    }
}
