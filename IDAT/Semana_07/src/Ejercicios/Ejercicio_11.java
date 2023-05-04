package Ejercicios;

/**
 *
 * @author Lenovo
 */
public class Ejercicio_11 {

    public static void main(String[] args) {
        Beta beta = new Beta();
        beta.method();
    }
}

class Alfa {

    Alfa() {
        method();

    }

    void method() {

    }
}

class Beta extends Alfa {

    int number = 4;

    @Override
    void method() {
        System.out.println(number);
    }
}

//Respuesta es:  0 4