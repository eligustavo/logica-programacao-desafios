package exercicios.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula03 {

    /**
     * Como usuário, eu gostaria de ter um menu visual que seja navegável atráves de
     * números. O menu deve ser exibido da seguinte forma
     * 
     * 1. Calcular imposto 2. Depositar salário 3. Sair
     * 
     * O menu deve ficar disponível enquanto eu não digitar o numero 3. Dessa forma
     * o sistema ficará em execução, evitando ter que ser reiniciado a cada
     * operação.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 3) {
            System.out.println("1. Calcular imposto");
            System.out.println("2. Depositar salário");
            System.out.println("3. Sair");
            System.out.println("Digite sua opção");
            opcao = sc.nextInt();

        }
        System.out.println("Programa encerrado");
        sc.close();
    }
}
