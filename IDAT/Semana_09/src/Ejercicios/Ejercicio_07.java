package Ejercicios;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Ejercicio_07 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList();
        nombres.add("Ana");
        nombres.add("Luisa");
        nombres.add("Felipe");
        System.out.println(nombres);
        
        nombres.add(1, "Pablo");
        System.out.println(nombres);
        nombres.remove(0);
        System.out.println(nombres);
        nombres.set(0, "Alfonso");
        System.out.println(nombres);
        String s = nombres.get(1);
        String ultimo = nombres.get(nombres.size() -1);
        System.out.println(s + " " + ultimo);
    }
}
