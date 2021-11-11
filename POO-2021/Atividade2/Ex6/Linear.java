import java.util.Scanner;

public class Linear {

    public static void main(String[] arg) {
        int[] vet = {11, 22, 33, 44, 12, 13, 1, 2, 3, 9 ,10, 5, 21, 56} ;
        int d;
        int pos = -1;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um valor inteiro: ");
        d = ler.nextInt();

        pos = linear(vet, d);

        if (pos == -1) {
            System.out.println("Valor não encontrado.");
        }
        else {
            System.out.println("Valor " + vet[pos] + " encontrado na posição " + pos + ".");
        }

    }

    public static int linear(int[] v, int p) {
        int pos = -1;
        for (int i=0; i < v.length; i++) {
            if (v[i] == p) {
                pos = i;
                return pos;
            }
        }
        return pos;

    }
}