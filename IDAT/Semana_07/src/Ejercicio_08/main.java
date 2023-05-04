
package Ejercicio_08;

/**
 *
 * @author Lenovo
 */
public class main {
    public static void main(String[] args) {
        //Futbolista futbolista1 = new Futbolista("Jose", "Pintado", 20, "Masculino", "Delantero");
       // Futbolista futbolista12 = new Futbolista("Miguel", "Chavez", 32, "Masculino", "Defensa");
        Futbolista futbolista = new Futbolista("Andres", "Iniesta", 32, "Masculino", "Mediocampista");
        
        Entrenador entren = new Entrenador("Vicente ", "Del Bosque ", 45, "Masculino", "Tiki-Taka");
        Masajista masa = new Masajista("Raul", "Martinez", 25, "Masculino", 4);
        
        
        System.out.println("PERSONAS CONCENTRADAS ");
        System.out.println("--------------------------------------------------");
        futbolista.concentrarse();
        entren.concentrarse();
        masa.concentrarse();
        System.out.println("--------------------------------------------------");
        
        System.out.println("VIAJAN PAAR UN PARTIDO");
        System.out.println("--------------------------------------------------");
        futbolista.viajar();
        masa.viajar();
        entren.viajar();
        System.out.println("--------------------------------------------------");
        System.out.println("DURANTE EL ENTRENAMIENTO");
        System.out.println("--------------------------------------------------");
        futbolista.entrenar();
        entren.dirigirEntrenamiento();
        System.out.println("--------------------------------------------------");

        
        System.out.println("MASAJES");
        System.out.println("--------------------------------------------------");
        masa.darMasaje();
        System.out.println("--------------------------------------------------");
        
        System.out.println("EN EL PARTIDO ");
        System.out.println("--------------------------------------------------");
        futbolista.jugarPartido();
        entren.dirigirPartido();
        System.out.println("--------------------------------------------------");
        
       
        
    }
}
