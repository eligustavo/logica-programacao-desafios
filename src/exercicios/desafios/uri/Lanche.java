package exercicios.desafios.uri;

import java.util.Locale;
import java.util.Scanner;

public class Lanche {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codProd = sc.nextInt();
        int qtdProd = sc.nextInt();
        double total;

        if (codProd == 1) {
            double hotDog = 4.0;
            total = qtdProd * hotDog;
            System.out.printf("Total: R$ %.2f%n", total);
        } else if (codProd == 2) {
            double salada = 4.5;
            total = qtdProd * salada;
            System.out.printf("Total: R$ %.2f%n", total);
        } else if (codProd == 3) {
            double bacon = 5.0;
            total = qtdProd * bacon;
            System.out.printf("Total: R$ %.2f%n", total);
        } else if (codProd == 4) {
            double torrada = 2.0;
            total = qtdProd * torrada;
            System.out.printf("Total: R$ %.2f%n", total);
        } else if (codProd == 5) {
            double refri = 1.50;
            total = qtdProd * refri;
            System.out.printf("Total: R$ %.2f%n", total);
        }

        sc.close();
    }
}
