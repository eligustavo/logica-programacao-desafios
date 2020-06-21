package exercicios.vetores.unidimensional;
import java.util.Scanner;

public class Aula02Ex02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] notas = new double[3];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i + 1));
            notas[i] = sc.nextDouble();
            double media = 0;
            for (int j = 0; j < notas.length; j++) {
                media = media + notas[j];
                System.out.println("Nota " + (j + 1) + ": " + notas[j]);
            }
            media = media / notas.length;
            System.out.println("Média das notas: " + media);
        }
        sc.close();
    }
}