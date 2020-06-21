package exercicios.desafios.uri;

import java.util.Locale;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int funcionario = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double recebePorHora = sc.nextDouble();

        System.out.println("NUMBER = " + funcionario);
        System.out.format("SALARY = U$ %.2f", horasTrabalhadas * recebePorHora);

        sc.close();
    }
}