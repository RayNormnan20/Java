package Ejercicio_08;

/**
 *
 * @author Lenovo
 */
public class Entrenador extends equipoFutbol {

    private String estrategia;

    public Entrenador(String nombre, String apellidos, int edad, String genero, String estrategia) {
        super(nombre, apellidos, edad, genero);
        this.estrategia = estrategia;
    }

    public String getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(String estrategia) {
        this.estrategia = estrategia;
    }

    public void dirigirEntrenamiento() {
        System.out.println(nombre + " " + apellidos + " esta dirigiendo un entrenamiento.");
    }

    public void dirigirPartido() {
        System.out.println(nombre + " " + apellidos + " esta dirigiendo un partido.");
    }
}
