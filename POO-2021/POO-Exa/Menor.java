import javax.swing.plaf.metal.MetalBorders.MenuItemBorder;

public class Menor {

    public static void main(String[] args) {

        int[] vetor = {13, 3, 15, 3, 7, 1, 22};
        int[] vetor1 = {3, 2, 1, 4, 2, 1, 0, 2};
        int[] vetor2 = {5, 3, 2, 6, 4, 1, -1};

        System.out.println(" Menor valor :" + menor1(vetor) );
        System.out.println(" Menor valor :" + menor1(vetor1) );
        System.out.println(" Menor valor :" + maior(vetor2) );
    }

    public static int menor1(int[] v) {
        int mn = v[0];
        for (int i = 1; i < v.length; i++) { 
            if (v[i] < mn) {
                mn = v[i];
            }
        }
        return mn;
    }

    public static int maior(int[] v) {
        int mn = v[0];
        for (int i = 1; i < v.length; i++) { 
            if (v[i] > mn) {
                mn = v[i];
            }
        }
        return mn;
    }
    
}

                  
            


