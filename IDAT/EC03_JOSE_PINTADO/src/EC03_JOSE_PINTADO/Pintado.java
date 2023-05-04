package EC03_JOSE_PINTADO;

import java.util.ArrayList;

/**
 *
 * @author Pintado
 */
public class Pintado {

    public static void main(String[] args) {
        try {
            Vivienda[] viviendas = new Vivienda[4];
            viviendas[0] = new Departamento(70, 3, false, 5, true);
            viviendas[1] = new Departamento(100, 4, false, 2, false);
            viviendas[1].alquilar();
            viviendas[2] = new Casa(400, 6, true, 3, true);
            viviendas[3] = new Casa(200, 4, true, 1, true);
            viviendas[3].vender();

            System.out.println("Feria Inmobiliaria");
            System.out.println("==================");
            for (int i = 0; i < viviendas.length; i++) {
                System.out.println(viviendas[i]);
            }

        } catch (Exception e) {
            System.out.println("Error...!!!" + e.getMessage());
        }
    }
}

interface Habitable {

    boolean ALQUILAR = true;
    boolean VENDER = true;

    void alquilar();

    void vender();
}

abstract sealed class Vivienda implements Habitable permits Departamento, Casa {

    private int numCuartos;
    private int metros2;
    private boolean mascotas;
    private String estado;

    public Vivienda(int metros2, int numCuartos, boolean mascotas) {
        this.metros2 = metros2;
        this.numCuartos = numCuartos;
        this.mascotas = mascotas;
        this.estado = "Disponiple";
    }

    @Override
    public final void alquilar() {
        this.estado = "Alquilado";
    }

    @Override
    public final void vender() {
        this.estado = "Vendido";
    }

    abstract boolean ofrecerAlquiler();
    abstract boolean ofrecerVender();

    public int getNumCuartos() {
        return numCuartos;
    }

    public void setNumCuartos(int numCuartos) {
        this.numCuartos = numCuartos;
    }

    public int getMetros2() {
        return metros2;
    }

    public void setMetros2(int metros2) {
        this.metros2 = metros2;
    }

    public boolean isMascotas() {
        return mascotas;
    }

    public void setMascotas(boolean mascotas) {
        this.mascotas = mascotas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

final class Departamento extends Vivienda {

    private final int piso;
    private final boolean ascensor;

    public Departamento(int metros2, int numCuartos, boolean mascotas, int piso, boolean ascensor) {
        super(metros2, numCuartos, mascotas);
        this.piso = piso;
        this.ascensor = ascensor;
    }

    @Override
    public boolean ofrecerAlquiler() {
        return ALQUILAR;
    }

    @Override
    public boolean ofrecerVender() {
        return !VENDER;
    }

    @Override
    public String toString() {
        ArrayList<String> arreglo = new ArrayList();
        arreglo.add("Dpto. de " + this.getMetros2() + "m2 ");
        arreglo.add("Cuartos: " + this.getNumCuartos());
        arreglo.add("Mascotas: " + (this.isMascotas() ? "si" : "No"));
        arreglo.add("Piso: " + this.piso);
        arreglo.add("Ascensor: " + (this.ascensor ? "Si" : "No"));
        arreglo.add("Alquiler: " + (this.ofrecerAlquiler() ? "Si" : "No"));
        arreglo.add("Vender: " + (this.ofrecerVender() ? "Si" : "No"));
        arreglo.add("Estado: " + this.getEstado());
        return arreglo.toString();
    }
}

non-sealed class Casa extends Vivienda {

    private int numPisos;
    private boolean piscina;

    public Casa(int metros2, int numCuartos, boolean mascotas, int numPisos, boolean piscina) {
        super(metros2, numCuartos, mascotas);
        this.numPisos = numPisos;
        this.piscina = piscina;
    }

    @Override
    public boolean ofrecerAlquiler() {
        return !ALQUILAR;
    }

    @Override
    public boolean ofrecerVender() {
        return VENDER;
    }

    public String toStrings() {
        ArrayList<String> arreglo = new ArrayList();
        arreglo.add("Dpto. de " + this.getMetros2() + "m2 ");
        arreglo.add("Cuartos: " + this.getNumCuartos());
        arreglo.add("Mascotas: " + (this.isMascotas() ? "si" : "No"));
        arreglo.add("Piso: " + this.numPisos);
        arreglo.add("Ascensor: " + (this.piscina ? "Si" : "No"));
        arreglo.add("Alquiler: " + (this.ofrecerAlquiler() ? "Si" : "No"));
        arreglo.add("Vender: " + (this.ofrecerVender() ? "Si" : "No"));
        arreglo.add("Estado: " + this.getEstado());
        return arreglo.toString();

    }
}
