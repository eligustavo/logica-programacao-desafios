package exercicios.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final String usuario = "Elivelton";
        final String senha = "UsuarioPrincipal";
        boolean exibirTelaLogin = true;

        while (exibirTelaLogin) {
            System.out.println("Digite seu login: ");
            String usuarioDigitado = sc.nextLine();
            System.out.println("Digite sua senha: ");
            String senhaDigitada = sc.nextLine();
            if (usuario.equals(usuarioDigitado) && senha.equals(senhaDigitada)) {
                System.out.println("ACESSO CONCEDIDO");
                exibirTelaLogin = false;
                break;
            }
            System.out.println("ACESSO NEGADO");
        }
        System.out.println("Programa terminado");
        sc.close();
    }
}