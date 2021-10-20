public class TestSort {
    
    public static void main(String[] args) {

        int i;
        int a[] = {3,2,5,7,4,6,9,1,8}; //vetor de exemplo

        // mostra o vetor original
        System.out.println("Vetor original:");
        for (i = 0; i < a.length; i++) {
            System.out.print( a[i] + " ");
        }

        Sort.selection(a);

        // mostra o vetor ordenado
        System.out.println("\nVetor ordenado:");
        for (i = 0; i < a.length; i++) {
            System.out.print( a[i] + " ");
        }

        Sort.bubble(a);

        // mostra o vetor ordenado
        System.out.println("\nVetor ordenado:");
        for (i = 0; i < a.length; i++) {
            System.out.print( a[i] + " ");
        }

        Sort.insertion(a);

        // mostra o vetor ordenado
        System.out.println("\nVetor ordenado:");
        for (i = 0; i < a.length; i++) {
            System.out.print( a[i] + " ");
        }


    }
}
