public class Menor {
    public static void main(String[] args) {

        int[] vetor = {1, 3, 15, 3, 7, 22};

        int maior;

        maior = maior1(vetor);

        System.out.printf("%n Maior = %d%n", maior);

    public maior1(int[] v) {

        for (int i = 1; i< v.length; i++) {
            if (v[i] > maior) {
                    maior = v[i];
            }
        }

    }
}
}
                  
            


