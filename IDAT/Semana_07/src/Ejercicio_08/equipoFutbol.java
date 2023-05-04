
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_08;

/**
 *
 * @author Lenovo
 */
public class equipoFutbol {
    protected String nombre;
    protected String apellidos;
    protected int edad;
    protected String genero;

    public equipoFutbol(String nombre, String apellidos, int edad, String genero) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void concentrarse() {
        System.out.println(nombre + " " + apellidos + " esta concentrando.");
    }

    public void viajar() {
        System.out.println(nombre + " " + apellidos + " esta viajando.");
    }
}
