package exercicios.desafios.uri;

import java.util.Scanner;

public class ProdutoSimples1004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A;
        int B;

        A = sc.nextInt();
        B = sc.nextInt();

        System.out.println("PROD = " + (A * B));

        sc.close();
    }

}