package exercicios.desafios.uri;

import java.util.Locale;
import java.util.Scanner;

public class GastoCombustivel1017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int tempo = sc.nextInt();
        int velocidade = sc.nextInt();
        int qtdKm = tempo * velocidade;
        double qtdLitros = qtdKm / 12.0;
        System.out.format("%.3f%n", qtdLitros);
        sc.close();
    }
}