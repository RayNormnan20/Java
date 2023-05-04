package Ejercicio_08;

/**
 *
 * @author Lenovo
 */
public class Masajista extends equipoFutbol {

    private int aniosExperiencia;

    public Masajista(String nombre, String apellidos, int edad, String genero, int aniosExperiencia) {
        super(nombre, apellidos, edad, genero);
        this.aniosExperiencia = aniosExperiencia;
    }

    public void darMasaje() {
        System.out.println(nombre + " " + apellidos + " esta realizando un masaje");
    }

    public void tratarLesion() {
        System.out.println(nombre + " " + apellidos + " esta tratando una lesion.");
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
}
