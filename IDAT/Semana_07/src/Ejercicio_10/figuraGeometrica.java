package Ejercicio_10;

/**
 *
 * @author Lenovo
 */
public class figuraGeometrica {

    protected double area;
    protected double perimetro;

    public void calcularArea() {
        this.area = 0;
    }

    public void calcularPerimetro() {
        this.perimetro = 0;
    }

    public double getArea() {
        return this.area;
    }

    public double getPerimetro() {
        return this.perimetro;
    }

}
