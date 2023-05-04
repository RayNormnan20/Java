package Ejercicio_01;

/**
 *
 * @author Lenovo
 */
public class Ejercicio_02 {

    public static void main(String[] args) {
        Persona per = new Persona();
        per.nombre = "Jose";
        per.apellido = "Pintado";
        per.edad = (150);
        per.mostrarDatos();
    }
}

class Persona {

    String nombre;
    String apellido;
    int edad;

    void mostrarDatos() {
        System.out.println("La edad de " + nombre + " " + apellido
                + " es: " + edad + " años.");
    }
}
