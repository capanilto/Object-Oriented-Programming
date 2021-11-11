import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        int[][] mat = new int[5][5];

        int i, j;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite cinco valores inteiros: ");

        for (i = 0; i < 5; i++) {
            mat[i][i] = ler.nextInt();
        }

        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }
}