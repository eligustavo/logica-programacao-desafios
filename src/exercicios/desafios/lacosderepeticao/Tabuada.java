package exercicios.desafios.lacosderepeticao;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont, digito = sc.nextInt(), resultado;

        for (cont = 1; cont <= 10; cont++) {
            resultado = cont * digito;
            System.out.println(cont + " x " + digito + " = " + resultado);

            sc.close();
        }
    }
}