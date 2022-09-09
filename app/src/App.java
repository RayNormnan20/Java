import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Ingrese su nombre: ");
            String nombre = obj.nextLine();
            System.out.print("Hola "+nombre+"!!!"+"\n");

            System.out.print("Ingrese el radio: ");
            double radio = obj.nextDouble();
            double lc = 2*Math.PI*radio;
            System.out.print("Longitud de la circunferencia: "+lc+"\n");

            System.out.print("Ingrese un valor entero: ");
            int n = obj.nextInt();
            double c = Math.pow(n,2);
            System.out.print("El cuadrado es: "+c+"\n");

            
        }
    }
}