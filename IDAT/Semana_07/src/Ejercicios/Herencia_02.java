package Ejercicios;

/**
 *
 * @author Lenovo
 */
public class Herencia_02 {
    public static void main(String[] args) {
        Animal2 ani = new Animal2();
        ani.hacerRuido();
        Gato cat = new Gato();
        cat.hacerRudido();
        Perro dog = new Perro();
        dog.hacerRudido();
        GatoMontes catm = new GatoMontes();
        catm.hacerRudido();
    }
}

class Animal2 {

    public void hacerRuido() {
        System.out.println("Grr...");
    }
}
class Gato extends Animal2 {

    public void hacerRudido() {
        System.out.println("Miauuuu...");
    }
}
class Perro extends Animal2 {

    public void hacerRudido() {
        System.out.println("Guau Guau...");
    }
}
class GatoMontes extends Animal2 {

    public void hacerRudido() {
        System.out.println("Wuiggg...");
    }
}
