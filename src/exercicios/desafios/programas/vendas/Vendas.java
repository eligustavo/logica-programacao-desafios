package exercicios.desafios.programas.vendas;

import java.util.Locale;
import java.util.Scanner;

public class Vendas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int opcao = 0;
        double venda;
        double valor;
        

        while (opcao != 6) {
            System.out.println("Menu Inicial");
            System.out.println("1. Vendas");
            System.out.println("2. À vista");
            System.out.println("3. Parcelado");
            System.out.println("4. Pestação em atraso");
            System.out.println("5. Ultimas vendas");
            System.out.println("6. Sair");
            opcao = sc.nextInt();

            if (opcao == 1) {
                double comissao = 0.25;
                double impostos = 0.65;
                System.out.println("Informe o valor do produto: ");
                valor = sc.nextDouble();
                venda = valor * (impostos + comissao);
                System.out.println("O valor total à pagar é: " + (venda + valor) + "R$");
                System.out.println("------------------------------------------------------");
            }

            if (opcao == 2) {
                double percentual;
                double desconto;
                System.out.println("Informe o valor à pagar: ");
                valor = sc.nextDouble();
                System.out.println("Informe o valor do desconto: ");
                percentual = sc.nextDouble();
                desconto = (valor * percentual) / 100;

                if (percentual <= 15) {
                    System.out.println("O valor do desconto é: " + desconto + "R$");
                    System.out.println("Valor total da venda é de: " + (venda = valor - desconto) + "R$");
                    System.out.println("------------------------------------------------------");
                } else {
                    System.out.println("O valor máximo de desconto à vista é de 15%");
                }

            }

            if (opcao == 3) {
                double parcelas;
                double juros;
                System.out.println("Informe o valor à pagar: ");
                valor = sc.nextDouble();
                System.out.println("Informe a quantidade de parcelas: ");
                parcelas = sc.nextInt();

                if (parcelas >= 3 && parcelas <= 36) {
                    juros = parcelas * 0.02;
                    while (parcelas <= 36) {
                        System.out.println("Juros por parcelas: " + juros);
                        break;
                    }
                    venda = valor + juros * parcelas;
                    System.out.println("O valor parcelado é de: " + (venda = valor + juros + parcelas) + "R$");
                } else {
                    System.out.println("A quantidade de parcelas mínima é de 3x");
                }
            }

            if (opcao == 4) {
                double prestacao;
                double taxa;
                double tempo;
                System.out.println("Digite o tempo de atraso em meses: ");
                tempo = sc.nextDouble();
                System.out.println("Digite o valor: ");
                valor = sc.nextDouble();
                System.out.println("Digite o valor da taxa: ");
                taxa = sc.nextDouble();
                prestacao = (valor + (valor * (taxa / 100) * tempo));
                System.out.println("O valor da prestação em atraso é: " + prestacao);
            }

            if (opcao == 5) {
                // precisará ser terminado
            } else {
                System.out.println("Fim do programa!");
            }
        }
    }
}
