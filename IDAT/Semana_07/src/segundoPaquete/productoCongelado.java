package segundoPaquete;



/**
 *
 * @author Lenovo
 */
public class productoCongelado extends producto {

    private String temCongeRecomendada;

    public productoCongelado(String fechaCaducidad, int numLote, String tempCongelacionRecomendada) {
        super(fechaCaducidad, numLote);
        this.temCongeRecomendada = tempCongelacionRecomendada;

    }

    public String getTemCongeRecomendada() {
        return temCongeRecomendada;
    }

    public void setTemCongeRecomendada(String temCongeRecomendada) {
        this.temCongeRecomendada = temCongeRecomendada;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Temperatura de congelacion recomendada: " + temCongeRecomendada);
    }
}
