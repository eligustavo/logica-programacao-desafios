package exercicios.condicionais.ifs;

import java.util.Scanner;

public class CadastroLogin {

    /*
     * Eu, como admin do sistema, gostaria de permitir que os próprios usuários
     * cadastrassm o nome de usuário (login) no sistema para agilizar o processo de
     * migração do sistema antigo para o novo. O usuário não pode deixar o login
     * vazio "", ou criar um usuário com login "admin" ou "administrador". Se o
     * valor digitado for válido, o sistema deverá exibir uma mensagem
     * "<nome do usuário> cadastrado com sucesso" Senão o sistema deverá mostrar o
     * erro "Usuário inválido"
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.next();

        if (nome.equals("") || nome.equalsIgnoreCase("admin") || nome.equalsIgnoreCase("administrador")) {
            System.out.println("Usuário inválido");
        } else {
            System.out.println(nome + " cadastrado com sucesso!");
        }
        sc.close();
    }
}