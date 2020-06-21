package exercicios.desafios.entradadedados;
import java.util.Locale;
import java.util.Scanner;

public class GrausCelsius {

    public static void main(String[] args) {

        /**
         * Escreva um programa que realize a conversão de graus Celsius (C) para graus
         * Fahrenheit (F).
         */

        Scanner sc = new Scanner(System.in);

        sc.useLocale(Locale.US);

        double c;
        double f;

        System.out.println("Digite um valor em graus Celsius: ");
        c = sc.nextDouble();

        f = (c * 9 / 5) + 32;

        System.out.println("A conversão em Fahrenheit é: " + f);

        System.out.println("<================================================>");

        System.out.println("Digite um valor em Fahrenheit: ");
        f = sc.nextDouble();

        c = ((f - 32) * 5) / 9;

        System.out.println("A conversão para Celsius é de: " + c);

        sc.close();

    }
}