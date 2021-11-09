// classe com métodos estáticos

public class Menor {

    public static int menor(int[] v) {
        int menor = v[0];
        for (int i = 1; i< v.length; i++) {
            if (v[i] < menor) {
                    menor = v[i];
            }
        }
        return menor;
    }
}