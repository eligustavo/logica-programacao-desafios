package exercicios.desafios.condicionais;

import java.util.Scanner;

public class Permissao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();

        if (valor >= 1 && valor <= 9) {
            System.out.println(valor + " está dentro do valor permitido");
        } else {
            System.out.println(valor + " está fora do valor permitido");
        }
        sc.close();
    }
}