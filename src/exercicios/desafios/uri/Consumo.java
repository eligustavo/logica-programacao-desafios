package exercicios.desafios.uri;

import java.util.Locale;
import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        double Y = sc.nextDouble();

        System.out.format("%.3f km/l%n", X / Y);

        sc.close();
    }
}