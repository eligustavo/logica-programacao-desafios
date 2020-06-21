package exercicios.desafios.entradadedados;
import java.util.Locale;
import java.util.Scanner;

public class PesMetros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        float pes = 1f;
        float cm = 0.03048f;
        float conversor;

        System.out.println("Digite uma medida em pés: ");
        pes = sc.nextFloat();

        conversor = cm * pes;

        System.out.println("A conversão de centrimetro para pés é: " + conversor);

        sc.close();

    }
}