package exercicios.desafios.uri;

public class NumerosPares {
    public static void main(String[] args) {
        int pares = 100;
        int i = 2;

        while (i <= pares) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i = i + 1;
        }
    }
}