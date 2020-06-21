package exercicios.condicionais.switchcase;
public class Aula02 {

    public static void main(String[] args) {

        /*
         * Como gerente, eu gostaria que os meu usuários pudessem digitar o tipo da
         * conta e o sistema imprima qual a porcentagem de juros que aquela conta irá
         * oferecer. Com o intuito de agilizar o acesso as informações os tipos de conta
         * são: CONTA_POUPANCA 0.05% CONTA_CORRENTE 0.02% CONTA_INVESTIMENTO 0.1%
         */

        String conta = "CONTA_CORRENTE";

        switch (conta) {
            case "CONTA_POUPANCA":
                System.out.println("0.05%");
                break;
            case "CONTA_CORRENTE":
                System.out.println("0.02");
                break;
            case "CONTA_INVESTIMENTO":
                System.out.println("0.1");
                break;
            default:
                System.out.println("CONTA_INEXISTENTE");
        }
    }
}