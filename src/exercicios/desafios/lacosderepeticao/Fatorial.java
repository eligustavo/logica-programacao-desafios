package exercicios.desafios.lacosderepeticao;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        System.out.println("Fatorial de: " + numero + " é " + fatorial(numero));
    }

    public static int fatorial(int numero) {
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}