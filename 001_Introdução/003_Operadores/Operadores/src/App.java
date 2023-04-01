public class App {
    public static void main(String[] args) throws Exception {
        // Operadores aritméticos
        System.out.println(2 + 2); // 4
        System.out.println(5 - 2); // 3
        System.out.println(4 * 4); // 16
        System.out.println(40 / 5); // 8
        System.out.println(27.0 / 3); // 9.0
        System.out.println(12.1 / 1.1); // 10.999999999999998
        System.out.println(10 % 2); // 0

        // Operadores lógicos
        System.out.println((4 > 2) && (8 > 4));  // true
        System.out.println((5 > 3) && (7 > 9));  // false

        System.out.println((1 < 2) || (4 < 5));  // true
        System.out.println((6 < 7) || (9 < 8));  // true
        System.out.println((4 < 3) || (3 < 2));  // false

        System.out.println(!(2 == 3));  // true
        System.out.println(!(2 == 2));  // false
    }
}
