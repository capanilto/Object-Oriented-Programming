import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        int i, j;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite os elementos da matriz 5 X 5:") ;

        for (i=0; i<5; i++) {
            for (j=0; j<5; j++) {
                a[i][j] = ler.nextInt();
            }
        }


        for (i=0; i<5; i++) {
            System.out.println("");
            for (j=0; j<5; j++) {
                System.out.print(a[i][j] + " ");
            }
        }


    }
}
