
// Importando a classe Test do pacote que eu criei
import com.converter.RealToDollar;

import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Digite o valor em real: R$ ");
        double valueInReal = input.nextDouble();

        input.close();

        // Método convertRealToDollar(), chamado da classe RealToDollar
        String valueInDollar = RealToDollar.convertRealToDollar(valueInReal);

        System.out.println("Valor em dólar: " + valueInDollar);
    }
}
