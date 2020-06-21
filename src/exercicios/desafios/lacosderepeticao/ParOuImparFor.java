package exercicios.desafios.lacosderepeticao;

public class ParOuImparFor {
    public static void main(String[] args) {

        int valorFinal = 100;

        for (int i = 0; i <= valorFinal; i++) {
            if (i % 2 == 0) {
                System.out.println("i = " + i);
            }
        }
    }
}