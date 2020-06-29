package exercicios.desafios.uri;

import java.util.Locale;
import java.util.Scanner;

public class Media11005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double A = sc.nextDouble();
        double B = sc.nextDouble();

        double MEDIA = ((A * 3.5) + (B * 7.5)) / 11.0;

        System.out.format("MEDIA = %.5f%n" , MEDIA);

        sc.close();
    }

}