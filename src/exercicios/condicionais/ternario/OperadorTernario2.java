package exercicios.condicionais.ternario;

public class OperadorTernario2 {

    public static void main(String[] args) {

        int idade = 15;
        String status;

        status = idade < 15 ? "Infantil" : idade >= 15 && idade < 18 ? "juvenil" : "adulto";
        System.out.println(status);

    }

}