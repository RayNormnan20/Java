package Ejercicio_10;

/**
 *
 * @author Lenovo
 */
class cuadrado extends figuraGeometrica {

    private double lado;

    public cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        this.area = this.lado * this.lado;
    }

    @Override
    public void calcularPerimetro() {
        this.perimetro = 4 * this.lado;
    }

    public double getLado() {
        return this.lado;
    }
}
