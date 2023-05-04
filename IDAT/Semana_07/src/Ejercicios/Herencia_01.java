package Ejercicios;

/**
 *
 * @author Lenovo
 */
public class Herencia_01 {

    public static void main(String[] args) {
        Animal ani = new Animal();
        ani.hacerRuido();
        Gato cat = new Gato();
        cat.hacerRudido();
        Perro dog = new Perro();
        dog.hacerRudido();
    
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

class Perro extends Animal {

    public void hacerRudido() {
        System.out.println("Guau Guau...");
    }
}
