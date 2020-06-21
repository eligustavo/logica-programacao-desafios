package exercicios.condicionais.ifs;

import java.util.Scanner;

public class TorneioDeNatacao {

    public static void main(String[] args) {

        /*
         * Eu, como usuário gostaria de ter o nome e a idade de participantes de um
         * torneio de natação e que o sistema imprimisse da seguinte forma: Menor que 10
         * anos: <Nome> participará da categoria infantil, entre 11 e 15 anos: <Nome>
         * participará da categoria juvenil, entre 16 e 19 anos: <Nome> participará da
         * categoria pré-adulto, acima de 20 anos: <Nome> participará da categoria
         * adulto, para que eu possa rapidamente classificar todos os participantes.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.next();
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade <= 10) {
            System.out.println(nome + " participará da categoria infantil");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(nome + " participará da categoria juvenil");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println(nome + " participará da categoria pré-adulto");
        } else {
            System.out.println(nome + " participará da categoria adulto");
        }
        sc.close();
    }
}