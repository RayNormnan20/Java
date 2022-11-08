package clases;

public class ClaseHija_Desposito extends ClasePadre_Abstracta {

    @Override
    public void Transacciones() {
        System.out.print("Cuanto deseas depositar: ");
        Desposito();

        transacciones = getSaldo();
        setSaldo(transacciones + deposito);
        System.out.println("-----------------------------------");
        System.out.println("Depositaste: " + deposito);
        System.out.println("Tu saldo actual es: " + getSaldo());
        System.out.println("-----------------------------------");
    }

}
