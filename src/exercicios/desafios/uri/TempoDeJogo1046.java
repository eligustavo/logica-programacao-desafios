package exercicios.desafios.uri;

import java.util.Scanner;

public class TempoDeJogo1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inicio = sc.nextInt();
        int termino = sc.nextInt();
        int duracao = 24 - (24 + inicio - termino) % 24;

        if (inicio == termino) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        } else {
            System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);
        }

        sc.close();
    }
}