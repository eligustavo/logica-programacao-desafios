package exercicios.desafios.uri;

import java.util.Locale;
import java.util.Scanner;

public class Media3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = (sc.nextDouble() * 2) / 10;
        double B = (sc.nextDouble() * 3) / 10;
        double C = (sc.nextDouble() * 4) / 10;
        double D = (sc.nextDouble() * 1) / 10;
        double E;
        double media = A + B + C + D;

        if (media * 10 - Math.floor(media * 10) > 0.5001) {
            media = Math.ceil(media * 10) / 10;
        } else {
            media = Math.floor(media * 10) / 10;
        }
        System.out.printf("Media: %.1f\n", media);

        if (media < 5.0) {
            System.out.println("Aluno reprovado");
        }
        if (media >= 7.0) {
            System.out.printf("Aluno aprovado.\n");
        } else if (media >= 5.0) {
            System.out.printf("Aluno em exame.\n");
            E = sc.nextDouble();
            System.out.printf("Nota do exame: %.1f\n", E);
            media = (media + E) / 2;
            if (media >= 5) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n", media);
        }

        // if (media >= 7.0) {
        // System.out.println("Media: " + media);
        // System.out.println("Aluno aprovado.");

        // } else if (media < 5.0) {
        // System.out.println("Media: " + media);
        // System.out.println("Aluno reprovado.");

        // } else if (media >= 5.0 && media <= 6.9) {
        // System.out.println("Media: " + media);
        // System.out.println("Aluno em exame.");
        // double exame = sc.nextDouble();
        // System.out.println("Nota do exame: " + exame);
        // double mediaFinal = (exame + media) / 2;

        // if (mediaFinal >= 5.0 && mediaFinal <= 6.9) {
        // System.out.println("Aluno aprovado.");
        // } else {
        // System.out.println("Aluno reprovado.");
        // }
        // System.out.printf("Media final: " + mediaFinal);

        sc.close();
    }
}