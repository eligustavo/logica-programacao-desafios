package exercicios.desafios.entradadedados;

import java.util.Scanner;

public class Combustivel {

    public static void main(String[] args) {

        double distancia;
        double velocidade;
        double tempo;
        double litrosUtilizados;

        Scanner sc = new Scanner(System.in);

        /**
         * Efetuar o cálculo de quantos litros de combustível um automóvel consome em
         * uma viagem. Sabendo que o automóvel tem uma autonomia de 12 Km por litro de
         * combustível, desenvolva o cálculo utilizando a fórmula abaixo:
         * 
         * D = TV LU = D / 12
         * 
         * Onde: D = Distância em Km T = Tempo gasto na viagem V = Velocidade
         * 
         */

        System.out.println("Digite a distancia em metros: ");
        distancia = sc.nextDouble();
        System.out.println("Digite tempo de viagem em minutos: ");
        tempo = sc.nextDouble();
        System.out.println("Digite a velocidade constante: ");
        velocidade = sc.nextDouble();

        distancia = tempo + velocidade;

        System.out.format("%.3f%n", (litrosUtilizados = distancia / 12), " litros de gasolina");
        sc.close();
    }

}