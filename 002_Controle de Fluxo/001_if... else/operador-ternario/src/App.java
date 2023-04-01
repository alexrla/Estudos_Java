import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite três números:");

        System.out.print("Número 1: ");
        int number1 = input.nextInt();
        System.out.print("Número 2: ");
        int number2 = input.nextInt();
        System.out.print("Número 3: ");
        int number3 = input.nextInt();

        input.close();

        int bigger = (number1 >= number2) ? (number1 > number3 ? number1 : number3) : (number2 >= number3 ? number2 : number3);

        System.out.println("O maior número digitado foi: " + bigger);
    }
}
