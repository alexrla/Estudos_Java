import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String[][] movieTheater = new String[10][10];

        for (int i = 0; i < movieTheater.length; i++) {
            for (int j = 0; j < movieTheater.length; j++) {
                movieTheater[i][j] = "0";
            }
        }

        System.out.println("Digite:");
        System.out.println("1 - Exibir poltronas");
        System.out.println("2 - Reservar Ingresso");
        System.out.println("3 - Sair");
        System.out.print("Resposta: ");

        Scanner input = new Scanner(System.in);
        int response = input.nextInt();

        while (response != 3) {
            if (response == 1) {

                System.out.printf("\n");

                for (int i = 0; i < movieTheater.length; i++) {
                    for (int j = 0; j < movieTheater.length; j++) {
                        System.out.print(movieTheater[i][j] + "  ");
                    }
                    System.out.printf("\n");
                }

                System.out.printf("\n");

            } else if (response == 2) {
                System.out.print("\nInforme o número da fileira: ");
                int row = input.nextInt();
                System.out.print("Agora infore o número da poltrona: ");
                int column = input.nextInt();

                if (movieTheater[row - 1][column - 1] == "0") {

                    movieTheater[row - 1][column - 1] = "X";
                    System.out.println("Ingresso reservado com sucesso!\n");

                } else {
                    System.out.println("A poltrona já está reservada!\n");
                }
            }

            System.out.println("Digite:");
            System.out.println("1 - Exibir poltronas");
            System.out.println("2 - Reservar Ingresso");
            System.out.println("3 - Sair");
            System.out.print("Resposta: ");
            response = input.nextInt();
        }

        System.out.println("\nFIM!!!");

        input.close();
    }
}
