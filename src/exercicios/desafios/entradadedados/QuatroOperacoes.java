package exercicios.desafios.entradadedados;
import java.util.Scanner;

public class QuatroOperacoes {
    public static void main(String[] args) {

        int n1, n2, resultado;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        n1 = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        n2 = sc.nextInt();

        System.out.println("Resultados:");
        System.out.println("Adição: " + (resultado = n1 + n2));
        System.out.println("Subtração: " + (resultado = n1 - n2));
        System.out.println("Multiplicação: " + (resultado = n1 * n2));
        if (n2 != 0) {
            System.out.println("Divisão: " + (resultado = n1 / n2));
        } else {
            System.out.println("Não é possível dívidir por zero");
        }
        sc.close();
    }

}