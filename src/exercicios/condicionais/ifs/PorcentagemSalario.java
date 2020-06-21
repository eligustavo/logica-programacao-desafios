package exercicios.condicionais.ifs;

public class PorcentagemSalario {

    public static void main(String[] args) {

        /*
         * Dado um determinado salário se o salário for maior que 4500 imprima 30% do
         * valor senão imprima 15% do valor Desafio: Utilize apenas uma variável para
         * guardar o resultado e imprimir Desafio2: Dizer na impressão se é 30% ou 10%
         */
        
        double salario = 4100.50;
        double resultado = 0;
        String porcentagem = "";

        if (salario > 4500.00) {
            resultado = salario * 0.3;
            porcentagem = "30%";
            // System.out.println("30% do salário é = " + trintaPorCento);
        } else {
            resultado = salario * 0.15;
            porcentagem = "15%";
            // System.out.println("15% do salário é = " + quinzePorCento);
        }
        System.out.println("O valor final em porcentagem de " + porcentagem + " é de " + resultado);
    }
}