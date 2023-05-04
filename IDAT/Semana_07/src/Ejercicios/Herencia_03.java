
package Ejercicios;

/**
 *
 * @author Lenovo
 */
public class Herencia_03 {
    public static void main(String[] args) {
        Animal1 ani = new Animal1();
        ani.hacerRuido();
        Gato cat = new Gato();
        cat.hacerRudido();
        Perro dog = new Perro();
        dog.hacerRudido();
        GatoMontes catm = new GatoMontes();
        catm.hacerRudido();
    }
}

class Animal1 {
    public Animal1(){
        System.out.println("SuperClase");
    }
    public void hacerRuido() {
        System.out.println("Grr...");
    }
}
class Gato extends Animal1 {
    public void hacerRudido() {
        System.out.println("Miauuuu...");
    }
}
class Perro extends Animal1 {
    public void hacerRudido() {
        System.out.println("Guau Guau...");
    }
}
class GatoMontes extends Animal1 {
    public void hacerRudido() {
        System.out.println("Wuiggg...");
    }
}

