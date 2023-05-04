
package Ejercicios;

/**
 *
 * @author Lenovo
 */
public class Herencia_05 {
    public static void main(String[] args) {
        Gato cat = new Gato();
        cat.hacerRudido();
        Perro dog = new Perro();
        dog.hacerRudido();
        GatoMontes catm = new GatoMontes();
        catm.hacerRudido();
    }
}
abstract class Animal4{
    abstract public void hacerRudido();
}
sealed class Gato extends   Animal4 permits GatoMontes{
    public  void hacerRuido(){
        System.out.println("Miau...");
    }
}
non-sealed class GatoMontes extends Gato(){
    @Override
    final public void  hacerRuido(){
        System.out.println("Wuiggg...");
    }
}

final class Perro extends Animal4{
    @Override
    public void 
}