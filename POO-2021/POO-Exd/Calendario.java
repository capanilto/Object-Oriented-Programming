public class Calendario {
    public static void main(String[] args) {
        int[] mes = {31 ,29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] nomes = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};

        int[][] calendario = new int[12][];
        int i, j;

        for (i = 0; i < 12; i++) {
            calendario[i] = new int[ mes[i] ];
            for (j = 0; j < mes[i]; j++) {
                calendario[i][j] = j+1;
            }
        }

        System.out.println ("Calendario: ");

        for (i = 0; i < 12; i++) {
            System.out.println("Mês: " + nomes[i] + " = ");
            for (j = 0; j < mes[i]; j++) {
                // operador ternario: (condição) ? caso verdadeiro : caso falso;
                System.out.print(  (calendario[i][j] % 7 == 0) ? calendario[i][j] + "\n" :  calendario[i][j] + " ") ;
            }
            System.out.println();
        }


    }
}