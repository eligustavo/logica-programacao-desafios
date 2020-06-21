package aulas.variaveis;

public class ReutilizandoVariaveis {

    public static void main(String[] args) {

        /*
         * float salario = 2000.00F; float porcentagemA = 30, porcentagemB = 15, porcentagemC = 5; 
         * float resultado; 
         * System.out.println(resultado = salario * porcentagemA / 100);
         * System.out.println(resultado = salario * porcentagemB / 100);
         * System.out.println(resultado = salario * porcentagemC / 100);
         */
     
         // Outro exemplo prático
        double salario = 5000;
        double resultado = salario * 0.3;
        
        //30%
        System.out.println(resultado);
        
        //15%
        resultado = salario * 0.15;
        System.out.println(resultado);

        //5%
        resultado = salario * 0.05;
        System.out.println(resultado);
    }
}