package exercicios.desafios.uri;

import java.util.Locale;

public class CalculoSimples {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int cod1 = 12;
        int qtd1 = 1;
        double valor1 = 5.30;
        int cod2 = 16;
        int qtd2 = 2;
        double valor2 = 5.10;

        double custoTotal = qtd1 * valor1 + qtd2 * valor2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", custoTotal);
    }
}