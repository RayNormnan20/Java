package segundoPaquete;

/**
 *
 * @author Lenovo
 */
public class producto {

    private String fechaCaducidad;
    private int numLote;

    public producto(String fechaCaducidad, int numLote) {
        this.fechaCaducidad = fechaCaducidad;
        this.numLote = numLote;
    }

    public void mostrarInfo() {
        System.out.println("Fecha de caducidad: " + getFechaCaducidad());
        System.out.println("Numero de lote: " + getNumLote());
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getNumLote() {
        return numLote;
    }

    public void setNumLote(int numLote) {
        this.numLote = numLote;
    }

}
