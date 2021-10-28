public class Try {
    public static void main(String[] args) {

        int[] resp = {1, 2, 3, 2, 4, 1, 1, 2, 3, 15, 2, 4, 4, 2, 1};
        int[] freq = new int[6];

        for (int i = 0; i < resp.length; i++) {

            try {
                ++freq[ resp[i] ];
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
                System.out.printf(" Resp[%d] = %d%n%n", i, resp[i]);
            }          
        }

        System.out.printf("%s%10s%n", "Resp. ", "Freq");

        for (int j = 1; j < freq.length; j++) {
            System.out.printf("%6d%10d%n", j, freq[j]);
        }
    }
}