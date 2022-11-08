package decimales;
import java.text.DecimalFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class ClasePrincipal {

    public static void main(String[] args) {

        double numero = 2;
        double raiz = Math.sqrt(numero);

        System.out.println("La raiz cuadrada de: " + numero + " es: " + raiz);
        
        //Utilizando la clase decimal 
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("");
        System.out.println("La raiz cuadrada de: " + numero + " es: " + df.format(raiz));
        
        //Utilizando string format
        System.out.println("La raiz cuadrada de: " + numero + " es: " + String.format("%.3f", raiz));
        
        //Utilizando la clase Math.round
        System.out.println("La raiz cuadrada de: " + numero + " es: " + (double)Math.round(raiz * 10000d) / 10000);
        
        //Utlizando la clase BigDecimal --Imporrtar 2 librerias
        BigDecimal bd = new BigDecimal(raiz);
        bd = bd.setScale(5, RoundingMode.HALF_UP);
        System.out.println("La raiz cuadrada de: " + numero + " es: " + bd.doubleValue());
    }
}
