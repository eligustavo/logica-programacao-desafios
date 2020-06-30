package exercicios.desafios.uri;

import java.util.Scanner;

public class TiposTriangulo {

    public static void main(String[] args) {
        // Area de declaração de variaveis
        double A, B, C;
        double aux, a2, bc;
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o valor de a");
        A = sc.nextDouble();
        System.out.println("digite o valor de b");
        B = sc.nextDouble();
        System.out.println("digite o valor de c");
        C = sc.nextDouble();

        // verifica se "a" é maior que os elementos
        if (B > A) {
            aux = B;
            A = B;
            B = aux;
        }
        if (C > A) {
            aux = A;
            A = C;
            C = aux;
        }
        a2 = Math.pow(A, 2);
        bc = Math.pow(B, 2) + Math.pow(C, 2);

        if (A > B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {

            // Pode formar algum triangulo
            if (a2 > bc) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else if (a2 < bc) {
                System.out.println("TRIANGULO ACUTANGULO");
            } else {
                System.out.println("TRIANGULO RETANGULO");
            }

            // Verifica arestas
            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (A == B || A == C || B == C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
        sc.close();

    }
}
