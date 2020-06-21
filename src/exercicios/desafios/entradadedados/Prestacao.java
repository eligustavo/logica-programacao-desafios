package exercicios.desafios.entradadedados;
import java.util.Locale;
import java.util.Scanner;

public class Prestacao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double prestacao;
        double valor;
        double taxa;
        double tempo;

        System.out.println("Digite o tempo de atraso em meses: ");
        tempo = sc.nextDouble();

        System.out.println("Digite o valor: ");
        valor = sc.nextDouble();

        System.out.println("Digite o valor da taxa: ");
        taxa = sc.nextDouble();

        prestacao = (valor + (valor * (taxa / 100) * tempo));

        System.out.println("O valor da prestação em atraso é: " + prestacao);

        sc.close();
    }

}