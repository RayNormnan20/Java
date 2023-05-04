package Ejercicio_10;

/**
 *
 * @author Lenovo
 */
class rectangulo extends figuraGeometrica {

    private double base;
    private double altura;

    public rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        this.area = this.base * this.altura;
    }

    @Override
    public void calcularPerimetro() {
        this.perimetro = 2 * (this.base + this.altura);
    }

    public double getBase() {
        return this.base;
    }

    public double getAltura() {
        return this.altura;
    }
}
