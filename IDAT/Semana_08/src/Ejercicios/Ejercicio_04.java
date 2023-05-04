package Ejercicios;

/**
 *
 * @author Lenovo
 */
public class Ejercicio_04 {

    public static void main(String[] args) {
        Gato cat = new Gato("Fora", 4, "Angora");
        cat.hacerRuido();
        cat.quejar();
        System.out.println("La edad de " + cat.nombre + "es: " + cat.crecer());

        Perro dog = new Perro("Canelo", 7, "Pitbull");
        dog.hacerRuido();
        dog.quejar();
        System.out.println("La edad de " + dog.nombre + "es: " + dog.crecer());

        GatoMontes catm = new GatoMontes("Ron Ron ", 5, "Europeo");
        catm.hacerRuido();
        catm.quejar();
        System.out.println("La edad de " + catm.nombre + "es: " + catm.crecer());
    }
}

interface Expresable {

    void hacerRuido();

    default void quejar() {
        System.out.println("mmm mmm");
    }

}

abstract class Animal implements Expresable {

    String nombre;
    int edad;
    String raza;

    public Animal(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }

    @Override
    abstract public void hacerRuido();

    public int crecer() {
        this.edad++;
        return this.edad;
    }
}

class Gato extends Animal {

    public Gato(String nombre, int edad, String raza) {
        super(nombre, edad, raza);
    }

    @Override
    public void hacerRuido() {
        System.out.println(nombre + " hace miau...");
    }
}

class GatoMontes extends Gato {

    public GatoMontes(String nombre, int edad, String raza) {
        super(nombre, edad, raza);
    }

    @Override
    final public void hacerRuido() {
        System.out.println(nombre + " hacer wuigg....");
    }
}

class Perro extends Gato {

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad, raza);
    }

    @Override
    final public void hacerRuido() {
        System.out.println(nombre + " hace guau....");
    }
}
