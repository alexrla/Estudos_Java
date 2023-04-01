import java.util.Scanner;

// Exibindo os n primeiros números naturais

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = input.nextInt();

        input.close();

        for(int i = 0; i <= n; i++) {
            System.out.println(i);
        }
    }
}
