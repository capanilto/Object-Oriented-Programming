public class TesteEstudante {

    public static void main(String[] args) {
        Estudante e1 = new Estudante("José da Silva", 30.5);
        Estudante e2 = new Estudante("Maria da Silva", 70.9);
        Estudante e3 = new Estudante("João da Silva", 90.1);


        System.out.printf("%s teve media %s\n", e1.getNome(), e1.getLetraMedia() );
        System.out.printf("%s teve media %s\n", e2.getNome(), e2.getLetraMedia() );
        System.out.printf("%s teve media %s\n", e3.getNome(), e3.getLetraMedia() );
        System.out.println("Nome: " + e3.getNome() + "Media: " + e3.getMedia() );
    }
    
}
