package exercicios.desafios.condicionais;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        double n1, n2;
        String operacao = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a operação que deseja efetuar");
        operacao = sc.next();

        System.out.println("Digite o primeiro número");
        n1 = sc.nextDouble();

        System.out.println("Digite o segundo número");
        n2 = sc.nextDouble();

        switch (operacao) {
            case "+":
                System.out.println("O resultado da soma é: " + (n1 + n2));
                break;

            case "-":
                System.out.println("O resultado da subtração é: " + (n1 - n2));
                break;

            case "*":
                System.out.println("O resultado da multiplicação é: " + (n1 * n2));
                break;

            case "/":
                System.out.println("O resultado da divisão é: " + (n1 / n2));
                break;

            default:
                break;
        }
        sc.close();
    }
}