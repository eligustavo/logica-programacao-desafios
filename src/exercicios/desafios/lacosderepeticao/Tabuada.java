package exercicios.desafios.lacosderepeticao;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        int cont, numero, tabuada;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número entre 1 e 10: ");
        numero = sc.nextInt();

        for (cont = 0; cont <= 10; cont++) {
            tabuada = cont * numero;
            System.out.println(numero + " * " + cont + " = " + tabuada);

            sc.close();
        }
    }

}