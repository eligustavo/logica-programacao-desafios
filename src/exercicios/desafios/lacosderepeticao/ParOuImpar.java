package exercicios.desafios.lacosderepeticao;

public class ParOuImpar {
    public static void main(String[] args) {

        int valorFinal = 100;
        int i = 0;

        while (i <= valorFinal) {
            if (i % 2 == 0) {
                System.out.println("i = " + i);
            }
            i = i + 1;
        }
    }
}