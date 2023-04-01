// Calculando a soma dos valores de um array

public class App {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = 0;

        for(int number : numbers) {
            sum += number;
        }

        System.out.println("Total = " + sum);
    }
}
