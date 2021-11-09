public class TestMenor {
    public static void main(String[] args) {

        int[] vetor = {11, 3, 15, 3, 7, 22};
        int[] vetor1 = {1,2,3,4,5,6,0};
        int[] vetor2 = { 1, 1, 1, 0, 1, 0};

        Menor obj1 = new Menor(vetor);
        Menor obj2 = new Menor(vetor1);
        Menor obj3 = new Menor(vetor2);
        
        System.out.println("Menor valor obj1: " + obj1.menor);
        System.out.println("Posição obj1: " + obj1.posmenor);

        System.out.println("Menor valor obj2: " + obj2.menor);
        System.out.println("Posição obj2: " + obj2.posmenor);

        System.out.println("Menor valor obj3: " + obj3.menor);
        System.out.println("Posição obj3: " + obj3.posmenor);

        System.out.println("Maior valor obj2: " + obj2.maior);
        System.out.println("Posição obj2: " + obj2.posmaior);

    }
}
