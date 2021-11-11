public class Menor {

    public static int m(int[] v) {
        int menor = v[0];
        for (int i=1; i < v.length; i++) {
            if (v[i] < menor) {
                menor = v[i];
            }
        }
        return menor;
    }
}