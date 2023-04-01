import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int number = input.nextInt();

        System.out.print("Digite um número em ponto flutuante: ");
        double value = input.nextDouble();

        System.out.print("Digite uma palavra: ");
        String word = input.next();

        input.close();

        System.out.println("Número inteiro digitado: " + number);
        System.out.println("Número em ponto flutuante digitado: " + value);
        System.out.println("Palavra digitada: " + word);
    }
}
