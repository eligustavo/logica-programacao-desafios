package exercicios.desafios.uri;

import java.util.Scanner;

public class DDD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int DDD = sc.nextInt();

        if (DDD == 11) {
            System.out.println("Sao Paulo");
        } else if (DDD == 19) {
            System.out.println("Campinas");
        } else if (DDD == 21) {
            System.out.println("Rio de Janeiro");
        } else if (DDD == 27) {
            System.out.println("Vitoria");
        } else if (DDD == 31) {
            System.out.println("Belo Horizonte");
        } else if (DDD == 32) {
            System.out.println("Juiz de Fora");
        } else if (DDD == 61) {
            System.out.println("Brasilia");
        } else if (DDD == 71) {
            System.out.println("Salvador");
        } else {
            System.out.println("DDD nao cadastrado");
        }
        sc.close();

        // switch (DDD) {
        //     case 11:
        //         System.out.println("Sao Paulo");
        //         break;
        //     case 19:
        //         System.out.println("Campinas");
        //         break;
        //     case 21:
        //         System.out.println("Rio de Janeiro");
        //         break;
        //     case 27:
        //         System.out.println("Vitoria");
        //         break;
        //     case 31:
        //         System.out.println("Belo Horizonte");
        //         break;
        //     case 32:
        //         System.out.println("Juiz de fora");
        //         break;
        //     case 61:
        //         System.out.println("Brasilia");
        //         break;
        //     case 71:
        //         System.out.println("Salvador");
        //         break;
        //     default:
        //         System.out.println("DDD nao cadastrado");
        //         break;
        // }

    }
}