package exercicios.condicionais.ifs;

public class ParOuImpar {

    public static void main(String[] args) {

        /*
         * Dado um número inteiro, imprima se ele é par ou ímpar
         */
        
        // +, -, *, / e %
        int numero = 35;

        if ((numero % 2) == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }
    }
}