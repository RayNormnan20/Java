package Ejercicios;

/**
 *
 * @author Lenovo
 */
public class Ejercicio_02 {

    public static void main(String[] args) {
        Deportista depor = new Deportista();
        depor.nadaLibre();
        depor.nadaMariposa();
        depor.caminar();
        depor.correr();
    }
}

interface Nadable {

    void nadaLibre();

    void nadaMariposa();
}

interface Ejercitable {

    void caminar();

    void correr();
}

class Deportista implements Nadable, Ejercitable {

    @Override
    public void nadaLibre() {
        System.out.println("Nado libremente....");
    }

    @Override
    public void nadaMariposa() {
        System.out.println("Nado con estilo mariposa...");
    }

    @Override
    public void caminar() {
        System.out.println("Estoy caminando....");
    }

    @Override
    public void correr() {
        System.out.println("Estoy corriendo....");
    }
}
