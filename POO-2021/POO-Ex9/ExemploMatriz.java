import java.util.Random;

public class ExemploMatriz {

    public static void main(String[] args) {
        int[][] a = new int[5][5];
        int i, j;

        Random gerador = new Random();

        System.out.println("Gerando matriz de numeros aleatorios");
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                a[i][j] = gerador.nextInt(10);
            }
        }

        System.out.println("Matriz gerada: ");
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print( a[i][j] + " ");
            }
            System.out.println();
        }
    }
}