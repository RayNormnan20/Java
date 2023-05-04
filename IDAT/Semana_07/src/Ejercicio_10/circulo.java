package Ejercicio_10;

/**
 *
 * @author Lenovo
 */
class circulo extends figuraGeometrica {

    private double radio;

    public circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        this.area = Math.PI * Math.pow(this.radio, 2);
    }

    @Override
    public void calcularPerimetro() {
        this.perimetro = 2 * Math.PI * this.radio;
    }

    public double getRadio() {
        return this.radio;
    }
}
