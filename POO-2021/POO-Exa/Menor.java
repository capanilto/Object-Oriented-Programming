public class Menor {
    public static void main(String[] args) {

        int[] vetor = {1, 3, 15, 3, 7, 22};

        int menor;

        menor = menor1(vetor);

        System.out.printf("%n Menor = %d%n", menor);
    }

    public static int menor1(int[] v) {
        int menor = v[0];
        for (int i = 1; i< v.length; i++) {
            if (v[i] < menor) {
                    menor = v[i];
            }
        }
        return menor;
    }
}

                  
            


