package Ejercicios;

/**
 *
 * @author Lenovo
 */
public class Herencia {

    public static void main(String[] args) {
        Animal ani = new Animal();
        ani.hacerRuido();
        Gato cat = new Gato();
        cat.hacerRudido();
    }
}

class Animal {

    public void hacerRuido() {
        System.out.println("Grr...");
    }
}

class Gato extends Animal {

    public void hacerRudido() {
        System.out.println("Miauuuu...");
    }
}
