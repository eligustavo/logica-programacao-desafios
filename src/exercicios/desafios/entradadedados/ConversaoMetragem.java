package exercicios.desafios.entradadedados;
import java.util.Scanner;

public class ConversaoMetragem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double m, km, mm;

        System.out.println("Insira um valor de metros:");
        m = sc.nextDouble();
        km = m / 1000;
        mm = m * 1000;

        System.out.println("Kilometro: " + km);
        System.out.println("Milimetro: " + mm);
    }
}