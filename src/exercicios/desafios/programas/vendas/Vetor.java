package exercicios.desafios.programas.vendas;

import java.util.Scanner;

public class Vetor {

    static boolean busca(int x, int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == x) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        int i = 0;

        while (i < 10) {
            System.out.println("Digite o " + (i + 1) + "o numero: ");
            vetor[i] = sc.nextInt();
            i++;
        }
        System.out.println("Digite o vetor");
        int x = sc.nextInt();
        System.out.println(busca(x, vetor));
    }
}
