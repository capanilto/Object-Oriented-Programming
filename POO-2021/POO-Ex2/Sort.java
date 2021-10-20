public class Sort {

    int i, j, aux;
    boolean troca;        
    int menor, posmenor;

    public static int[] bubble(int[] a){
        int i, j, aux;
        boolean troca; 
        // bubble sort
        j = a.length - 1; // 8-7
        do {
            troca = false;
            for (i=0; i < j; i++) {
                if (a[i] < a[i+1]) {
                    aux = a[i]; 
                    a[i] = a[i+1]; 
                    a[i+1] = aux;  
                    troca = true;
                }
            }
            j--;
        } while (troca);
	return a;
    }

    public static int[] selection(int[] a){
        int i, j;
        int menor, posmenor;
        // selection sort
        for (i = 0; i<a.length; i++){
            menor = a[i];
            posmenor = i;
            for (j = i + 1; j < a.length; j++) {
                if (a[j] < menor) {
                    menor = a[j];
                    posmenor = j;
                }                
            }
            if (posmenor != i) {
                a[posmenor] = a[i];
                a[i] = menor; 
            }
        }
	return a;
    }

    public static int[] insertion(int[] a) {
        int i, j, aux;
        // insertion sort
        for (i = 0; i < a.length; i++){
            aux = a[i];
            j = i - 1;
            while ( (j>=0) && (aux < a[j]) ) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = aux;
        }
        return a;
    }
    
}

