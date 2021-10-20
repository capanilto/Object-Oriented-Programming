//
//
import java.util.Scanner; 

public class Addition 
{
    public static void main(String[] args)
    {
        // Criar um scanner para obter dados de entrada
        Scanner input = new Scanner(System.in);

        int number1 = 0;
        int number2;
        int sum;


        System.out.print("Entre o primeiro numero: ");
        number1 = input.nextInt();

        System.out.print("Entre o segundo numero: ");
        number2 = input.nextInt();

        sum = number1 + number2;

        System.out.printf("Soma de %d com %d é %d", number1, number2, sum);
    
    }
    
}
