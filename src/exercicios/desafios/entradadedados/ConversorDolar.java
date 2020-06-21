package exercicios.desafios.entradadedados;
import java.util.Locale;
import java.util.Scanner;

public class ConversorDolar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double realDolar = 4.97;
        double dolar;
        double convertido;

        System.out.println("Convertendo Dólar para Real");
        System.out.println("Cotação do dólar atual: R$4,97 = US$1,00");

        System.out.println("Digite o valor em dólares: ");
        dolar = sc.nextDouble();

        convertido = dolar * realDolar;
        System.out.println("O valor convertido é: " + convertido + "R$");

        sc.close();
    }
}