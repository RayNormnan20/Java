package segundoPaquete;

import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class productoRefrigerado extends producto {

    private String codigoOrganismo;

    public productoRefrigerado(String fechaCaducidad, int numLote, String codigoOrganismo) {
        super(fechaCaducidad, numLote);
        this.codigoOrganismo = codigoOrganismo;
    }
    public String getCodigoOrganismo() {
        return codigoOrganismo;
    }

    public void setCodigoOrganismo(String codigoOrganismo) {
        this.codigoOrganismo = codigoOrganismo;
    }
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Codigo de supervision: " + codigoOrganismo);
    }
}
