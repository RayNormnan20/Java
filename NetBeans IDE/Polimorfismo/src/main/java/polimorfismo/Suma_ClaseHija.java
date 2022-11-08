package polimorfismo;

public class Suma_ClaseHija extends Operaciones_ClasePadre {

    @Override //Se hace referencia a una clase ya declarada y la 
    //y la sorescribe
    public void Operaciones() {
        resultado = valor1 + valor2;
    }

}
