package exercicios.vetores.multidimensional;

import java.util.Scanner;

public class Aula02 {

    public static void main(String[] args) {

        int[][] arrayMult1 = new int[2][3];
        // arrayMult1[0][0] = 22;
        // arrayMult1[0][1] = 12;
        // arrayMult1[0][2] = 92;
        // arrayMult1[1][0] = 29;
        // arrayMult1[1][1] = 25;
        // arrayMult1[1][2] = 55;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arrayMult1.length; i++) {
            for (int j = 0; j < arrayMult1[i].length; j++) {
                System.out.println("Digite o valor da posição [" + i + "][" + j + "]=");
                arrayMult1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arrayMult1.length; i++) {
            for (int j = 0; j < arrayMult1[i].length; j++) {
                System.out.println("[" + i + "][" + j + "]=" + arrayMult1[i][j]);
            }
        }
        sc.close();
    }
}