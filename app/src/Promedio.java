public class Promedio{
    public static void main(String[] args) {
        int matematica = 5;
        int biologia = 5;
        int quimica = 5;
        int Promedio = 0;

        Promedio = (matematica +  biologia + quimica) / 3;
        if(Promedio >= 6){
            System.out.println("El alumno aprobó: " +  Promedio);
        }   else{
            System.out.println("El alumno rebrobó: " + Promedio);
        }
    }
}