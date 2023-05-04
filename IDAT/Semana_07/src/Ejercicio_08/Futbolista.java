package Ejercicio_08;

/**
 *
 * @author Lenovo
 */
public class Futbolista extends equipoFutbol {

    private String posicion;

    public Futbolista(String nombre, String apellidos, int edad, String genero, String posicion) {
        super(nombre, apellidos, edad, genero);
        this.posicion = posicion;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void entrenar() {
        System.out.println(nombre + " " + apellidos + " esta entrenando.");
    }

    public void jugarPartido() {
        System.out.println(nombre + " " + apellidos + " esta jugando un partido.");
    }
}
