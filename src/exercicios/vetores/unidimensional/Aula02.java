package exercicios.vetores.unidimensional;
import java.util.Scanner;

public class Aula02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] notas = new double[4];

        // Laço para preencher os valores
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i + 1));
            notas[i] = sc.nextDouble();
        }

        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            media = media + notas[i];
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }
        media = media / notas.length;
        System.out.println("Média das notas: " + media);

        sc.close();
    }
}