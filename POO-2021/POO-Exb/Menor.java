public class Menor {

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