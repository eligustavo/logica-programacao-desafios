package exercicios.desafios.entradadedados;

import java.util.Scanner;

public class CalcAnteriorSucessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int digitado = sc.nextInt();
        int anterior = (digitado - 1);


        System.out.println(anterior - digitado);

    }

}