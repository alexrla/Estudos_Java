// Tamanhos e numerações de roupa

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe sua numeração: ");
        int numeration = input.nextInt();

        input.close();

        switch(numeration) {
            case 34:
                System.out.println("Seu tamanho é: PP");
            break;

            case 36:
                System.out.println("Seu tamanho é: PP");
            break;

            case 38:
                System.out.println("Seu tamanho é: P");
            break;
            
            case 40:
                System.out.println("Seu tamanho é: P");
            break;

            case 42:
                System.out.println("Seu tamanho é: M");
            break;
            
            case 44:
                System.out.println("Seu tamanho é: M");
            break;

            case 46:
                System.out.println("Seu tamanho é: G");
            break;

            case 48:
                System.out.println("Seu tamanho é: G");
            break;
            
            case 50:
                System.out.println("Seu tamanho é: XG");
            break;
        }
    }
}
