package EC03_JOSE_PINTADO;

import java.util.ArrayList;

/**
 *
 * @author Pintado
 */
public class Pintado {

    public static void main(String[] args) {
        try {
            Vivienda[] vivi = new Vivienda[6];
            vivi[0] = new Departamento(3, 100, false, 5, true);
            vivi[1] = new Departamento(7, 40, true, 2, false);
            vivi[2] = new Departamento(1, 40, false, 21, true);
            vivi[1].alquilar();
            vivi[2].vender();

            vivi[3] = new Casa(8, 60, true, 3, true);
            vivi[4] = new Casa(8, 40, true, 1, false);
            vivi[5] = new Casa(2, 100, true, 1, false);
            vivi[4].vender();

            System.out.println("Feria Inmobiliaria");
            System.out.println("==================");
            for (int i = 0; i < vivi.length; i++) {
                System.out.println(vivi[i].toString());
            }

        } catch (Exception e) {
            System.out.println("Error...!!!" + e.getMessage());
        }
    }
}

interface Habitable {

    boolean ALQUILER = true;
    boolean VENDER = true;

    void alquilar();

    void vender();
}

abstract sealed class Vivienda implements Habitable permits Departamento, Casa {

    private int numCuartos;
    private int metros2;
    private boolean mascotas;
    private String estado;

    public Vivienda(int numCuartos, int metros2, boolean mascotas) {
        this.numCuartos = numCuartos;
        this.metros2 = metros2;
        this.mascotas = mascotas;
        this.estado = "Disponible";
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

    private int piso;
    private boolean ascensor;

    public Departamento(int numCuartos, int metros2, boolean mascotas, int piso, boolean ascensor) {
        super(numCuartos, metros2, mascotas);
        this.piso = piso;
        this.ascensor = ascensor;
    }

    @Override
    public boolean ofrecerAlquiler() {
        return ALQUILER;
    }

    @Override
    public boolean ofrecerVender() {
        return !VENDER;
    }

    @Override
    public String toString() {
        ArrayList<String> arreglo = new ArrayList();
        arreglo.add("Dpto. de" + this.getMetros2() + "m2 ");
        arreglo.add("Cuartos: " + this.getNumCuartos());
        arreglo.add("Mascotas: " + (this.isMascotas() ? "si" : "No"));
        arreglo.add("Pisos: " + this.piso);
        arreglo.add("Piscina: " + (this.ascensor ? "Si" : "No"));
        arreglo.add("Alquiler: " + (this.ofrecerAlquiler() ? "Si" : "No"));
        arreglo.add("Vender: " + (this.ofrecerVender() ? "Si" : "No"));
        arreglo.add("Estado: " + this.getEstado());
        return arreglo.toString();
    }
}

non-sealed class Casa extends Vivienda {

    private int Pisos;
    private boolean piscina;

    public Casa(int numCuartos, int metros2, boolean mascotas, int numPisos, boolean piscina) {
        super(numCuartos, metros2, mascotas);
        this.Pisos = numPisos;
        this.piscina = piscina;
    }

    @Override
    public boolean ofrecerAlquiler() {
        return !ALQUILER;
    }

    @Override
    public boolean ofrecerVender() {
        return VENDER;
    }

    @Override
    public String toString() {
        ArrayList<String> arreglo = new ArrayList();
        arreglo.add("Casa de  " + this.getMetros2() + "m2 ");
        arreglo.add("Cuartos: " + this.getNumCuartos());
        arreglo.add("Mascotas: " + (this.isMascotas() ? "si" : "No"));
        arreglo.add("Pisos: " + this.Pisos);
        arreglo.add("Ascensor: " + (this.piscina ? "Si" : "No"));
        arreglo.add("Alquiler: " + (this.ofrecerAlquiler() ? "Si" : "No"));
        arreglo.add("Vender: " + (this.ofrecerVender() ? "Si" : "No"));
        arreglo.add("Estado: " + this.getEstado());
        return arreglo.toString();

    }
}
