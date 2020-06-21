package exercicios.condicionais.ternario;

public class OperadorTernario {

    public static void main(String[] args) {

        int idade = 20;
        String status;

        status = idade < 18 ? "Não é adulto" : "Adulto";
        System.out.println(status);
    }

}