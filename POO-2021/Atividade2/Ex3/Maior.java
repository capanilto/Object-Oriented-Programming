public class Maior {
    public static void main(String[] args) {
        int[] vet = {11, 3, 5, 7, 2, 8, 9 , 10};
        int m;
        m = maior(vet);
        System.out.println("Maior: " + m);

    }

    public static int maior( int[] v) {
        int maior = v[0];
        for (int i = 1; i < v.length; i++) {
            if (v[i] > maior) {
                maior = v[i];
            }
        }
        return maior;
    }
}
    
