package exercicios.desafios.uri;

import java.util.Locale;
import java.util.Scanner;

public class DistanciaEntrePontos1015 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double conteudo = ((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        double distancia = Math.sqrt(conteudo);

        System.out.printf("%.4f%n", distancia);

        sc.close();
    }
}