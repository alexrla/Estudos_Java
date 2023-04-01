import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double number = input.nextDouble();

        input.close();

        if(number > 0) {

            System.out.println("Você digitou um número positivo!");

        } else if(number < 0) {

            System.out.println("Você digitou um número negativo!");

        } else {

            System.out.println("Você digitou o número zero!");

        }
    }
}
