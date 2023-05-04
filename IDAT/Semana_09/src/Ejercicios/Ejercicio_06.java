
package Ejercicios;

/**
 *
 * @author Lenovo
 */
public class Ejercicio_06 {
    public static void main(String[] args) {
        Mascota[] mascotas = new Mascota[2];
        mascotas[0] = new Mascota ("Dora");
        mascotas[1] = new Mascota("Canela");
        for (int i=0; i<mascotas.length; i++){
            System.out.printf("Mascotas[%d] = %s\n", i, mascotas[i]);
        }
    }
}



class Mascota{
    private String nombre;
    public Mascota(String nombre){
        this.nombre = nombre;
    }
    @Override
    public String toString(){
        return "Mascota {nombre='" + nombre + "\'}";
    }
}