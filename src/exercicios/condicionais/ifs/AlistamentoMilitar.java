package exercicios.condicionais.ifs;

public class AlistamentoMilitar {

    public static void main(String[] args) {

        /*
         * Como secretário de alistamento militar eu gostaria que meu sistema aceitasse
         * os seguintes parâmetros para que eu possa agilizar o processo de
         * cadastramento: sexo, sendo válido apenas M ou F e idade. Se o sexo for
         * Masculino e a idade for maior ou igual a 18, o sistema deve imprimir
         * "Alistamento obrigatório" Se o sexo for Masculino e a idade for menor que 18,
         * o sistema deve imprimir "Alistamento não permitido" Se o sexo for Feminino e
         * a idade for maior ou igual a 18 o sistema deve perguntar se a pessoa deseja
         * se alistar Se o sexo for Feminino e a idade for menor que 18, o sistema deve
         * imprimir "Alistamento não permitido"
         */

        char sexo = 'M';
        int idade = 18;

        if (sexo == 'M' || sexo == 'F' && idade < 18) {
            System.out.println("Alistamento não permitido");
        } else if (sexo == 'M' && idade >= 18) {
            System.out.println("Alistamento obrigatório");
        } else if (sexo == 'F' && idade >= 18) {
            System.out.println("Deseja se alistar?");
        }
    }
}