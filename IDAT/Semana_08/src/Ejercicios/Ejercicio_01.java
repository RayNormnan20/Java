
package Ejercicios;

/**
 *
 * @author Lenovo
 */
public class Ejercicio_01 {
    public static void main(String[] args) {
        Nadador nadador = new Nadador();
        nadador.nadaLibre();
        nadador.nadaMariposa();
    }
}

interface Nadable {
    void nadaLibre();
    void nadaMariposa();
}
class Nadador implements Nadable{
    @Override
    public void nadaLibre(){
        System.out.println("Nado librementre....");
    }
    @Override
    public void nadaMariposa(){
        System.out.println("Nado con estilo mariposa....");
    }
}