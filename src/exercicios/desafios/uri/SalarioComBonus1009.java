package exercicios.desafios.uri;

import java.util.Locale;
import java.util.Scanner;

public class SalarioComBonus1009 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome = sc.next();
        double salario = sc.nextDouble();
        double vendas = sc.nextDouble();
        double comissao = vendas * 0.15;
       

        System.out.format("TOTAL = R$ %.2f%n", salario + comissao);

        sc.close();
    }
}