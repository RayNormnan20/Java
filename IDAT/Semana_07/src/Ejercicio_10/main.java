package Ejercicio_10;

/**
 *
 * @author Lenovo
 */
public class main {

    public static void main(String[] args) {

        //RECTANGULO
        rectangulo rectangulo = new rectangulo(4, 5);
        rectangulo.calcularArea();
        rectangulo.calcularPerimetro();
        System.out.println("Rectangulo: Area = " + rectangulo.getArea() + ", Perimetro = " + rectangulo.getPerimetro());

        //CUADRADO
        cuadrado cuadrado = new cuadrado(3);
        cuadrado.calcularArea();
        cuadrado.calcularPerimetro();
        System.out.println("Cuadrado: Area = " + cuadrado.getArea() + ", Perimetro = " + cuadrado.getPerimetro());

        //TRIANGULO
        triangulo triangulo = new triangulo(4, 3, 5, 4, 3);
        triangulo.calcularArea();
        triangulo.calcularPerimetro();
        System.out.println("Triangulo: Area = " + triangulo.getArea() + ", Perimetro = " + triangulo.getPerimetro());

        //CIRCULO
        circulo circulo = new circulo(2);
        circulo.calcularArea();
        circulo.calcularPerimetro();
        System.out.println("Circulo: Area = " + circulo.getArea() + ", Perimetro = " + circulo.getPerimetro());
    }

}
