
package Ejercicios;

/**
 *
 * @author Lenovo
 */
public class Ejercicio_12 {
    public static void main(String[] args) {
        try {
            int [] numeros = {21, 67, 19};
            
            for (int i=0; i<numeros.length; i++){
                System.out.println(numeros[i]/i);
            }
        } catch (ArithmeticException ae) {
            System.out.println(ae.toString());
        }finally{
            System.out.println("La aplicacion termino correctamente");
        }
    }
}
