package Ejercicio_10;

/**
 *
 * @author Lenovo
 */
class triangulo extends figuraGeometrica {

    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;

    public triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public void calcularArea() {
        this.area = 0.5 * this.base * this.altura;
    }

    @Override
    public void calcularPerimetro() {
        this.perimetro = this.lado1 + this.lado2 + this.lado3;
    }

    public double getBase() {
        return this.base;
    }

    public double getAltura() {
        return this.altura;
    }
}
