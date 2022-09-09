public class Operaciones01 {
    public static void main(String[] args) {
        int operacion = 5;
        int num_uno = 8;
        int num_dos = 4;
        int resultado = 0;

        if (operacion == 1){
            resultado = num_uno + num_dos;
            System.out.println("El resultado de la suma es: " + resultado);    
        }   else if(operacion == 2){
            resultado = num_uno - num_dos;
            System.out.println("El resulatado de la resta es: " + resultado); 
        }   else if(operacion == 3){
            resultado = num_uno  * num_dos;
            System.out.println("El resultado de la multiplicación es: " + resultado); 
        }   else if (operacion == 4){
            resultado = num_uno / num_dos;
            System.out.println("El resultado de la división es: " + resultado); 
        }   else {
            System.out.println("La opción que elegiste no existe...!!!!");
        }
        
    }
    
}
