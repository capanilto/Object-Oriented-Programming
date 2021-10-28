import java.util.Scanner;

public class Vetor1 {

    public static void main(String[] args) {

        int[] a = new int[5];
        int i;

        Scanner ler = new Scanner(System.in);

        for (i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = ler.nextInt();
        }

        System.out.println("Vetor lido: ");

        for (i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}