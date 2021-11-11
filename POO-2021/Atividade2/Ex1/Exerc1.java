public class Exerc1 {

    public static void main(String[] args) {
        int[] vet = {1, 2, 3, 4, 5 , 6, 7, 8, 9, 10, 11};
        int aux;

        System.out.println("Vetor original: ");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
        
        int j = vet.length / 2;
        int k = vet.length - 1 ;

        for (int i = 0; i < j; i++) {
            aux = vet[i];
            vet[i] = vet[k - i];
            vet[k - i] = aux;
        }

        System.out.println("\nVetor invertido: ");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }

    }
}