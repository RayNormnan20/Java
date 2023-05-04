package Ejercicio_01;

/**
 *
 * @author Lenovo
 */
//Clase Persona con Encapsulamiento
public class Miclase03_01 {

    public static void main(String[] args) {
        Persona per = new Persona();
        per.identificarPersona("Jose", "Pintado", 50);
        per.mostrarDatos();
    }
}

class Persona {

    private String nombre;
    private String apellido;
    private int edad;

    void identificarPersona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        if (edad >= 1 && edad <= 120) {
            this.edad = edad;
        } else {
            System.out.println("Edad incorrecta...!!!");
        }
    }

    void mostrarDatos() {
        System.out.println("La edad de " + nombre + " " + apellido
                + " es: " + edad + " años.");
    }
}
