package clase;

public class ClasePrincipal {

    public static void main(String[] args) {

        int matriz1[][] = new int[3][3];
        int matriz2[][] = new int[3][3];
        int matrizResultante[][] = new int[3][3];

        //Llenado de la matriz
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz1[i][j] = (int) (Math.random() * 5);
            }
        }

        //LLenado de la segunta matriz
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                matriz2[i][j] = (int) (Math.random() * 5);
            }
        }

        //Suma o resta de matrices 
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                matrizResultante[i][j] = matriz1[i][j] + matriz2[i][j];
                //matrizResultante[i][j] = matriz1[i][j] - matriz2[i][j];

            }
        }

        //Imprimiendo las matrices
        for (int i = 0; i < matriz1.length; i++) {

            for (int j = 0; j < matriz1.length; j++) {
                System.out.print("[ " + matriz1[i][j] + " ]");

            }
            if(i == 1){
                System.out.print("   +   ");
            }else{
                System.out.print("       ");
            }

            for (int j = 0; j < matriz2.length; j++) {
                System.out.print("[ " + matriz2[i][j] + " ]");
            }
            
            if(i == 1){
                System.out.print("   =   ");
            }else{
                System.out.print("       ");
            }
            
            for (int j = 0; j < matrizResultante.length; j++) {
                System.out.print("[ " + matrizResultante[i][j] + " ]");
            }
            
            System.out.println("");
        }
    }
}
