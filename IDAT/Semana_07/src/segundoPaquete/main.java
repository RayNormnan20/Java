// Ejercicio 08
package segundoPaquete;

/**
 *
 * @author Lenovo
 */
public class main {

    public static void main(String[] args) {
        productoFresco p1 = new productoFresco("12/01/2024", 123, "02/03/2022", "Alemania");
        productoRefrigerado p2 = new productoRefrigerado("16/12/2022", 69, "P-022");
        productoCongelado p3 = new productoCongelado("02/06/2025", 180, "34°");

        System.out.println("Producctos Frescos: ");
        p1.mostrarInfo();

        System.out.println("Productos Refrigerado: ");
        p2.mostrarInfo();

        System.out.println("Productos Congelados: ");
        p3.mostrarInfo();

    }
}
