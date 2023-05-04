package Ejercicios;

/**
 *
 * @author Lenovo
 */
public class Ejercicio_03 {

    public static void main(String[] args) {
        Gato cat = new Gato("Fora", 4, "Angora");
        cat.hacerRuido();
        Perro dog = new Perro("Canelo", 7, "Pitbull");
        dog.hacerRuido();
        GatoMontes catm = new GatoMontes("Ron Ron ", 5, "Europeo");
        catm.hacerRuido();

    }
}

interface Expresable {

    void hacerRuido();
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
}
//////
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
