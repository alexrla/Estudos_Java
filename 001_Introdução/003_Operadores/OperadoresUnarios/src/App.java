public class App {
    public static void main(String[] args) throws Exception {
        // Operadores de incremento e decremento
        int x = 2, y = 3;

        // Operador de incremento
        System.out.println("x = " + x); // x = 2

        // Pré-fixo: primeiro o valor é incrementado em 1 e depois ele é retornado
        System.out.println("x = " + (++x)); // x = 3

        // Pós-fixo: primeiro o valor é retornado e em seguida ele é incrementado em 1
        System.out.println("x = " + (x++)); // x = 3

        System.out.println("x = " + x); // x = 4

        // Operador de decremento
        // Funciona de forma semelhante ao operador de incremento
        System.out.println("y = " + y); // y = 3
        System.out.println("y = " + (--y)); // y = 2
        System.out.println("y = " + (y--)); // y = 2
        System.out.println("y = " + y); // y = 1
    }
}
