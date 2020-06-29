package exercicios.desafios.uri;

import java.util.Scanner;

public class FatorialSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // for (int i = 1; i <= 3; i++) {
        // N *= i;
        // System.out.println(N);

        for (long i = 0; i <= 10; i++) {
            System.out.println(i + "! = " + fatorial(i));
        }
    }

    public static long fatorial(long num) {
        if (num <= 1)
            return 1;
        else
            return num * fatorial(num - 1);
    }

}