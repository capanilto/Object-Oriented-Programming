public class Menor {

    public int menor;
    public int posmenor;
    public int maior;
    public int posmaior;

    Menor(int[] v) {
        int m = v[0];
        int p = 0;
        for (int i = 1; i< v.length; i++) {
            if (v[i] < m) {
                    m = v[i];
                    p = i;
            }
        }
        this.menor = m;
        this.posmenor = p;

        int mr = v[0];
        int pr = 0;
        for (int i = 1; i< v.length; i++) {
            if (v[i] > mr) {
                    mr = v[i];
                    pr = i;
            }
        }
        this.maior = mr;
        this.posmaior = pr;
    }
}