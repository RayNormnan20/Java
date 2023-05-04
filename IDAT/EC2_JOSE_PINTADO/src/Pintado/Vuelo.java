package Pintado;

/**
 *
 * @author Jose
 */
public class Vuelo {

    private String origen;
    private String destino;
    private double precio;
    private int pasajesVendidos;
    private int capacidadAvion;
    private double valorMaleta;
    private double totalVenta;

    public Vuelo(String origen, String destino) {
        this.origen = origen;
        this.destino = destino;
        this.valorMaleta = 50;
    }

    public Vuelo(String origen, String destino, double precio, int capacidadAvion) {
        this(origen, destino);
        this.precio = precio;
        this.capacidadAvion = capacidadAvion;

    }

    public void venderPasaje(int maletas) {
        if (this.pasajesVendidos < this.capacidadAvion) {
            pasajesVendidos++;
            totalVenta += this.precio + this.valorMaleta * maletas;
            System.out.println("\nDisfrute su vuelo\n");
        } else {
            System.out.println("\nLo siento, el avión estalleno. No se puede vender el pasaje\n");
        }
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getPasajesVendidos() {
        return pasajesVendidos;
    }

    public void setPasajesVendidos(int pasajesVendidos) {
        this.pasajesVendidos = pasajesVendidos;
    }

    public int getCapacidadAvion() {
        return capacidadAvion;
    }

    public void setCapacidadAvion(int capacidadAvion) {
        this.capacidadAvion = capacidadAvion;
    }

    public double getValorMaleta() {
        return valorMaleta;
    }

    public void setValorMaleta(double valorMaleta) {
        this.valorMaleta = valorMaleta;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }
}
