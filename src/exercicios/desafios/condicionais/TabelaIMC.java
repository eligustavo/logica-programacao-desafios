package exercicios.desafios.condicionais;

import java.util.Locale;
import java.util.Scanner;

public class TabelaIMC {

    public static void main(final String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double peso;
        double altura;
        double resultado;

        System.out.println("Digite o seu peso: ");
        peso = sc.nextDouble();

        System.out.println("Digite sua altura: ");
        altura = sc.nextDouble();

        resultado = peso / (altura * altura);

        if (resultado < 10) {
            System.out.format("Desnutrição Grau V : %.1f" , resultado);
        } else if (resultado > 10 && resultado <= 12.9) {
            System.out.format("Desnutrição Grau IV : %.1f" , resultado);
        } else if (resultado > 13 && resultado <= 15.9) {
            System.out.format("Desnutrição Grau III: %.1f" , resultado);
        } else if (resultado > 16 && resultado <= 16.9) {
            System.out.format("Desnutrição Grau II: %.1f" , resultado);
        } else if (resultado > 17 && resultado <= 18.4) {
            System.out.format("Desnutrição Grau I: %.1f" , resultado);
        } else if (resultado > 18.5 && resultado <= 24.9) {
            System.out.format("Normal: %.1f" , resultado);
        } else if (resultado > 25 && resultado <= 29.9) {
            System.out.format("Pré-Obesidade: %.1f" , resultado);
        } else if (resultado > 30 && resultado <= 34.5) {
            System.out.format("Obesidade Grau I: %.1f" , resultado);
        } else if (resultado > 35 && resultado <= 39.9) {
            System.out.format("Obesidade Grau II: %.1f" , resultado);
        } else if (resultado > 40) {
            System.out.format("Obesidade Grau III: %.1f" , resultado);
        }
        sc.close();
    }
}