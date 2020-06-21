package exercicios.desafios.condicionais;

import java.util.Locale;
import java.util.Scanner;

public class DepositoECalculoImposto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int opcao = 0;
        double renda;
        double deposito;
        int agencia;
        int conta;

        while (opcao != 3) {

            System.out.println("1. Calcular imposto");
            System.out.println("2. Depositar salário");
            System.out.println("3. Sair");
            System.out.println("Digite sua opção");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Informe seu salário");
                renda = sc.nextDouble();
                if (renda <= 1903.98) {
                    System.out.println("Isento");
                } else if (renda >= 1903.98 && renda <= 2826.65) {
                    System.out.println("7,5% " + (renda * 0.075));
                } else if (renda >= 2826.66 && renda <= 3751.05) {
                    System.out.println("15% " + (renda * 0.15));
                } else if (renda >= 3751.06 && renda <= 4664.68) {
                    System.out.println("22,5% " + (renda * 0.225));
                } else {
                    System.out.println("27,5% " + (renda * 0.275));
                }

            }

            if (opcao == 2) {
                double saldo = 500;
                System.out.println("Informe o número da agência: ");
                agencia = sc.nextInt();

                System.out.println("Informe o número da conta");
                conta = sc.nextInt();

                System.out.println("Informe o valor para depósito");
                deposito = sc.nextDouble();

                System.out.println("Valor em saldo de conta é: " + (saldo + deposito));
            } else {
                System.out.println("Programa encerrado");
            }
        }
        sc.close();
    }
}