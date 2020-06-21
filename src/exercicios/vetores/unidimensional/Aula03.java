package exercicios.vetores.unidimensional;
import java.util.Scanner;

public class Aula03 {

    /**
     * Armazenar em dois vetores V1 e V2 valores numéricos inteiros e exibir o
     * resultado da multiplicação dos núnemros do V1 com os correspondentes do V2.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // int[] array1 = { 1, 2, 3, 4, 5 };
        // for (int i = 0; i < array1.length; i++) {
        // System.out.println(array1[i]);
        // }

        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int[] array3 = new int[3];

        for (int i = 0; i < array1.length; i++) {
            System.out.println("Vetor 1, posição: " + i + ": ");
            array1[i] = sc.nextInt();
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.println("Vetor 2, posição: " + i + ": ");
            array2[i] = sc.nextInt();
        }

        System.out.println("Vetor 3 multiplicado");
        for (int i = 0; i < array3.length; i++) {
            array3[i] = array1[i] * array2[i];
            System.out.print(array3[i] + " ");
        }
        sc.close();
    }
}