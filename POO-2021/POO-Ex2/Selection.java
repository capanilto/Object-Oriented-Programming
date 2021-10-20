public class Selection {
    
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
    
}
