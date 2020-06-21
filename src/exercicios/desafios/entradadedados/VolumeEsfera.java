package exercicios.desafios.entradadedados;
import java.util.Scanner;

public class VolumeEsfera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float raio = sc.nextFloat();
        float pi = 3.141592654f;
        float volume = (4 / 3) * pi + (raio * raio * raio);

        System.out.format("%.2f", volume);
        sc.close();
    }
}