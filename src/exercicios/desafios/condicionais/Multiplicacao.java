package exercicios.desafios.condicionais;

import java.util.Scanner;

public class Multiplicacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        int resultado = numero * 2;

        if (resultado >= 30) {
            System.out.println("Resultado: " + resultado);
        }
        sc.close();
    }
}