package exercicios.desafios.uri;

import java.util.Scanner;

public class Distancia1016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = 60;
        int Y = 90;

        int tempo = sc.nextInt();
        Y = tempo * 2;
        System.out.println(Y + " " + "minutos");
        sc.close();
    }
}