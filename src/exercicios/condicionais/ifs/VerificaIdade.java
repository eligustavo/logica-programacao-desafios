package exercicios.condicionais.ifs;

public class VerificaIdade {

    public static void main(String[] args) {

        /*
         * Receber uma idade como entrada Se a idade for maior que a 18, imprima
         * "adulto" Senão, imprima "Ainda não é adulto"
         */

        int idade = 26;

        // ==, !=, >, >=, <, <=, &&, ||

        if (idade > 18) {
            System.out.println("Adulto");
        } else {
            System.out.println("Ainda não é adulto");
        }
    }
}