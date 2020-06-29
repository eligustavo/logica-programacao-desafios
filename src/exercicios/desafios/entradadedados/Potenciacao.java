package exercicios.desafios.entradadedados;

import java.util.Scanner;

public class Potenciacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor a ser potencializado:");
        double digitado = sc.nextDouble();
        double q = Math.pow(digitado, 2);
        double c = Math.pow(digitado, 3);
        double d = Math.pow(digitado, 10);

        /**
         * int digitado = sc.nextInt(); int q = digitado * digitado; int c = digitado *
         * digitado * digitado; int d = digitado * digitado * digitado * digitado *
         * digitado * digitado * digitado * digitado * digitado * digitado;
         */

        System.out.println("Inicio potenciação");
        System.out.println(q);
        System.out.println(c);
        System.out.println(d);
        System.out.println(q + c + d);

        sc.close();
    }
}