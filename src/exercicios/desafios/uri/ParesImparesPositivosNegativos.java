package exercicios.desafios.uri;

import java.util.Scanner;

public class ParesImparesPositivosNegativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, par = 0, impar = 0, positivo = 0, negativo = 0;
        for (int i = 0; i < 5; i++) {
            n = sc.nextInt();
            if (n % 2 == 0) {
                par++;
            } else {
                impar++;
            }
            if (n > 0) {
                positivo++;
            }
            if (n < 0) {
                negativo++;
            }
            System.out.println(par + " valor(es) par(es)");
            System.out.println(impar + " valor(es) impar(es)");
            System.out.println(positivo + " valor(es) positivo(s)");
            System.out.println(negativo + " valor(es) negativo(s)");
        }
    }
}
