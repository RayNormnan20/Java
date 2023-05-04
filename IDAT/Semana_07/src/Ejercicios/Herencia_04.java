package Ejercicios;

/**
 *
 * @author Lenovo
 */
public class Herencia_04 {

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

    String ruido = "Grrr...";

    public void hacerRuido() {
        System.out.println(ruido);
    }
}

class Gato extends Animal1 {

    String ruido = "Miau...";

    public void hacerRudido() {
        super.hacerRuido();
        System.out.println(super.ruido
                + this.ruido);
    }
}

class Perro extends Animal1 {

    public void hacerRudido() {
        super.hacerRuido();
        System.out.println("Gua Gua...");
    }
}

class GatoMontes extends Gato {

    @Override
    public void hacerRudido() {
        super.hacerRuido();
        System.out.println("Wuiggg...");
    }
}
