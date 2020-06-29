package exercicios.desafios.uri;

import java.util.Locale;
import java.util.Scanner;

public class Media21006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double media;

        media = (A * 2 + B * 3 + C * 5) / 10;

        System.out.format("MEDIA = %.1f%n", media);

        sc.close();
    }
}