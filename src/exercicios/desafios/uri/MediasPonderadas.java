package exercicios.desafios.uri;

import java.util.Locale;
import java.util.Scanner;

public class MediasPonderadas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n;
        double media, a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        for (int i = 0; i < 3; i++) {
            n = sc.nextInt();
            media = (a * b * c) / 10;
            System.out.printf("Média %.1f= ", media);
        }
    }
}
