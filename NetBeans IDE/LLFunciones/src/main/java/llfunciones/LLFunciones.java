/*
 * Clase para las funciones logicas para una lavadora
 */
package llfunciones;

/**
 *
 * @author Lenovo
 */
public class LLFunciones {

    // Con el private encapsulamos nuestras variables
    private int kilos = 0, llenadoCompleto = 0, TipoDeRopa = 0, LavadoCompleto = 0, SecadoCompleto = 0;

    public LLFunciones(int kilos, int TipoDeRopa) {
        this.kilos = kilos;
        this.TipoDeRopa = TipoDeRopa;
    }

    // Para que no tengan acceso a la funcionalidad interna de mi clase
    //Este metodo sirve paara llenar
    private void Llenado() {
        if (kilos <= 12) {
            llenadoCompleto = 1;
            System.out.println("Llenando...");
            System.out.println("Llenado completo.");
        } else {
            System.out.println("La carga de ropa es muy pesada, reduce la carga");
        }
    }

    //Este metodo sirve para lavar
    private void Lavado() {
        Llenado();
        if (llenadoCompleto == 1) {
            if (TipoDeRopa == 1) {
                System.out.println("Ropa blanca / Lavado suave");
                System.out.println("Lavando...");
                LavadoCompleto = 1;
            } else if (TipoDeRopa == 2) {
                System.out.println("Ropa de color / lavado intenso");
                System.out.println("Lavando...");
                LavadoCompleto = 1;
            } else {
                System.out.println("El tipo de ropa no esta disponible");
                System.out.println("Se lavará como ropa de color / lavado intenso");
                LavadoCompleto = 1;
            }
        }
    }

    //Este metodo sirve para secar
    private void Secado() {
        Lavado();
        if (LavadoCompleto == 1) {
            System.out.println("Secando...");
            SecadoCompleto = 1;
        }
    }

    public void CicloFinalizado() {
        Secado();
        if (SecadoCompleto == 1) {
            System.out.println("Tu ropa esta lista");
        }
    }

    //Seter y Getter ...Permite el acceso a encapsulamientos privados
    public int getTipoDeRopa() {
        return TipoDeRopa;
    }

    public void setTipoDeRopa(int TipoDeRopa) {
        this.TipoDeRopa = TipoDeRopa;
    }

}
