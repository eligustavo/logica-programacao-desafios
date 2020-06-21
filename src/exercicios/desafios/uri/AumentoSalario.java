package exercicios.desafios.uri;

import java.util.Locale;
import java.util.Scanner;

public class AumentoSalario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double novoSalario;
        double reajuste;

        if (salario >= 0.0 && salario <= 400.00) {
            double porcentagem = 0.15;
            String porc = "15 %";
            reajuste = salario * porcentagem;
            System.out.printf("Novo salario: %.2f%n", (novoSalario = salario + reajuste));
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: " + porc + "");
        } else if (salario >= 400.01 && salario <= 800.00) {
            double porcentagem = 0.12;
            String porc = "12 %";
            reajuste = salario * porcentagem;
            System.out.printf("Novo salario: %.2f%n", (novoSalario = salario + reajuste));
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: " + porc + "");
        } else if (salario >= 800.01 && salario <= 1200.00) {
            double porcentagem = 0.10;
            String porc = "10 %";
            reajuste = salario * porcentagem;
            System.out.printf("Novo salario: %.2f%n", (novoSalario = salario + reajuste));
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: " + porc + "");

        } else if (salario >= 1200.01 && salario <= 2000.00) {
            double porcentagem = 0.07;
            String porc = "7 %";
            reajuste = salario * porcentagem;
            System.out.printf("Novo salario: %.2f%n", (novoSalario = salario + reajuste));
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: " + porc + "");
        } else {
            double porcentagem = 0.04;
            String porc = "4 %";
            reajuste = salario * porcentagem;
            System.out.printf("Novo salario: %.2f%n", (novoSalario = salario + reajuste));
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: " + porc + "");

        }
    }
}