public class Bubble {
    
    public static int[] bubble(int[] a){

        int i, j, aux;
        boolean troca;
	
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

	return a;
    }
    
}