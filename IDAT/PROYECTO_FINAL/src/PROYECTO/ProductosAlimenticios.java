package PROYECTO;

import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class ProductosAlimenticios {

    private String fechaVencimiento;
    private String paisOrigen;

    public ProductosAlimenticios(String fechaVencimiento, String paisOrigen) {
        this.fechaVencimiento = fechaVencimiento;
        this.paisOrigen = paisOrigen;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    /**
     * @return the fechaVencimiento
     */
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * @param fechaVencimiento the fechaVencimiento to set
     */
    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

}
