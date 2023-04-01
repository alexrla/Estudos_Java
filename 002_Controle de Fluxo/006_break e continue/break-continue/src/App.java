public class App {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            // Quando i for zero ou um número ímpar, a iteração atual é pulada
            if(i == 0 || i % 2 == 1) {
                continue;
            }

            System.out.println(i);

            int j = 0;

            while (j < 10) {
                System.out.println("\t" + i + "." + (j + 1));

                j++;

                // Quando j for maior que 2, o loop interno é encerrado
                if (j > 2) break;
            }
        }
    }
}
