package exercicios.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor desejado");
        int valorFinal = sc.nextInt();
        int i = 0;

        while (i < valorFinal) {
            if (i % 2 == 0) {
                // Ou pode ser (i % 2 != 0)
                System.out.println("i = " + i);
            }
            i = i + 1;
        }
        sc.close();
    }
}