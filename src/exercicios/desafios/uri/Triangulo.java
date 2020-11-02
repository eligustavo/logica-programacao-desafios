package exercicios.desafios.uri;

import java.util.Locale;
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double base = sc.nextDouble();
        double altura = sc.nextDouble();

        double area = base + altura + altura / 3;

        System.out.println("Area = " + area);
    }
}
