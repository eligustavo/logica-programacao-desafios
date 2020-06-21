package exercicios.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int desejaContinuar = 1;

        do {
            System.out.println("PLAYER 1: Digite um número de 1 a 10");
            int num1 = sc.nextInt();
            System.out.println("PLAYER 2: Digite um número de 1 a 10");
            int num2 = sc.nextInt();
            System.out.println("Acertou " + (num1 == num2));
            System.out.println("=====================================");
            System.out.println("Deseja continuar jogando?");
            System.out.println("1.Sim");
            System.out.println("2.Não");
            desejaContinuar = sc.nextInt();
        } while (desejaContinuar == 1);

        sc.close();

    }

}