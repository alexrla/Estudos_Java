public class App {
    public static void main(String[] args) throws Exception {
        int[] numbers = new int[]{ 80, 85, 38, 81, 97, 64, 58, 57, 44, 11};

        for(int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("\n");

        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers.length; j++) {
                if(numbers[j] > numbers[i]) {
                    int aux = numbers[i]; 
                    numbers[i] = numbers[j];
                    numbers[j] = aux;
                }
            }
        }

        for(int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
