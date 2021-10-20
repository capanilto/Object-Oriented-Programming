// Exemplo de código: Algoritom Bubblesort
 
public class Bubble {
    public static void main(String[] args){

        int a[] = {3,2,5,7,4,6,9,1,8}; //vetor de exemplo
        int i, j, aux;
        boolean troca;
	
	// mostra o vetor
        System.out.println("Vetor: ");
        for (i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }

        // bubble sort
        j = a.length - 1; // 8-7
        do {
            troca = false;
            for (i=0; i < j; i++) {
                if (a[i] > a[i+1]) {
                    aux = a[i]; 
                    a[i] = a[i+1]; 
                    a[i+1] = aux;  
                    troca = true;
                }
            }
            j--;
        } while (troca);

	//mostra o vetor ordenado
        System.out.println("\nVetor ordenado: ");
        for (i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    
}
