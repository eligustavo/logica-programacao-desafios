package exercicios.desafios.uri;

import java.util.Locale;
import java.util.Scanner;

public class Bhaskara1036 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double A, B, C, DELTA;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        DELTA = Math.pow(B, 2) - (4 * A * C);

        if ((A == 0) || (DELTA < 0)) {
            System.out.println("Impossivel calcular");
        } else {
            double R1 = (((-1 * B) + Math.pow(DELTA, 0.5)) / (2 * A));
            double R2 = (((-1 * B) - Math.pow(DELTA, 0.5)) / (2 * A));
            System.out.printf("R1 = %5f\n", R1);
            System.out.printf("R2 = %5f\n", R2);
        }
        sc.close();
    }
}