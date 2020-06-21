package exercicios.desafios.programas.vendas;

import java.awt.Desktop;
import java.net.URI;
import java.util.Scanner;

public class Teste {/*
                     * Criação dos Arrays
                     */

    static int[] id = new int[100];
    static String[] nome = new String[100];
    static String[] genero = new String[100];

    // Metodo para mostrar o Menu Principal
    // #######################################################
    static int mostrarMenu() {
        int saida, opcao;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("@---------------------------------------------------------------------------@");
            System.out.println("@  ##    #   #####  #######   #####  ###  #       ##     ##  ######  #####  @");
            System.out.println("@  # #   #   #         #      #           #       # #   # #  #       #      @");
            System.out.println("@  #  #  #   ###       #      #####   #   #       #   #   #  ###     #####  @");
            System.out.println("@  #   # #   #         #      #       #   #       #       #  #           #  @");
            System.out.println("@  #    ##   #####     #      #       #   ######  #       #  ######  #####  @");
            System.out.println("@---------------------------------------------------------------------------@");
            System.out.println("#################################");
            System.out.println("#-------------------------------#");
            System.out.println("#\t 1 - LISTA DE FILMES    #");
            System.out.println("#-------------------------------#");
            System.out.println("#                               #");
            System.out.println("#-------------------------------#");
            System.out.println("#\t 2 - ASSISTIR FILMES    #");
            System.out.println("#-------------------------------#");
            System.out.println("#                               #");
            System.out.println("#-------------------------------#");
            System.out.println("#\t 3 - CADASTRAR FILME    #");
            System.out.println("#-------------------------------#");
            System.out.println("#                               #");
            System.out.println("#-------------------------------#");
            System.out.println("#\t 4 - ATLZR GENERO FILME #");
            System.out.println("#-------------------------------#");
            System.out.println("#                               #");
            System.out.println("#-------------------------------#");
            System.out.println("#\t 5 - BUSCAR FILME       #");
            System.out.println("#-------------------------------#");
            System.out.println("#                               #");
            System.out.println("#-------------------------------#");
            System.out.println("#\t 6 - EXCLUIR FILME      #");
            System.out.println("#-------------------------------#");
            System.out.println("#################################");
            System.out.print("\t Escolha uma opcao:");
            opcao = entrada.nextInt();

            saida = 1;

            if (opcao < 1) {
                System.out.println("\t Opcao invalida!!!\n");
                saida = 0;
            }
            if (opcao > 8) {
                System.out.println("\t Opcao invalida!!!\n");
                saida = 0;
            }
        } while (saida == 0);

        return opcao;

    }

    // fim do metodo Menu Principal
    // ################################################################

    // Metodo Listar todos os filmes
    // #################################################

    static void listar(int indice) {
        int i = 0;
        System.out.println("\n\n\tID --- FILME -------------------- GENERO");
        while (i < indice) {
            System.out.println("\t" + id[i] + "  -  " + nome[i] + "     - " + genero[i]);
            i++;
        }
        for (int j = 0; j < 3; j++) {
            System.out.println("\n");
        }

    }

    // Fim Listar dos filmes
    // #################################################################

    // Método assistir filme
    // ###################################################################################

    static void filmes_assistir(int indice) {
        String continuar;
        int id_filme, sinalizador = 0;
        double quantidade, subtotal, total = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n\n\t ###  BEM VINDO A NETFILMES ###\n");

        System.out.print("\t Digite o ID do filme: ");
        id_filme = entrada.nextInt();
        sinalizador = procuraIndiceID(indice, id_filme);

        if (id_filme == 1) {

            try {

                URI link = new URI("www.youtube.com/watch?v=hKo7qrPzeX4");
                Desktop.getDesktop().browse(link);
            } catch (Exception erro) {
                System.out.println("erro");
            }

        } else {
            if (id_filme == 2) {
                try {

                    URI link = new URI("www.youtube.com/watch?v=G1TM9goMymk");
                    Desktop.getDesktop().browse(link);
                } catch (Exception erro) {
                    System.out.println("erro");
                }

            } else {
                if (id_filme == 3) {
                    try {

                        URI link = new URI("www.youtube.com/watch?v=5EBxsgMAUAE");
                        Desktop.getDesktop().browse(link);
                    } catch (Exception erro) {
                        System.out.println("erro");
                    }
                } else {
                }

            }

        }
    }

    // Fim Metodo assistir filmes
    // #############################################################################

    // Método Cadastrar filme
    // ###########################################################

    static void cadastrarfilmes(int indice, String produto, String genero_filme) {

        id[indice] = indice;
        nome[indice] = produto;
        genero[indice] = genero_filme;

    }

    // Fim do Método Cadastro de filmes
    // #################################################

    // Método Consultar filmes
    // ###########################################################

    static void consultarfilme(int indice) {

        String nome_filme;
        Scanner entrada = new Scanner(System.in);
        System.out.println("\t ###  CONSULTA DE FILMES  ###");

        System.out.println("#---------------------------------#");
        System.out.println("#  1- DIGITE O NOME DO FILME      #");
        System.out.println("#---------------------------------#");
        System.out.print("");
        nome_filme = entrada.next();
        int ind = -1;

        for (int i = 0; i < indice; i++) {
            if (nome_filme.equals(nome[i])) {
                System.out
                        .println("\n\n\tID: " + id[i] + " - Nome: " + nome[i] + "  -   genero: " + genero[i] + "\n\n");
                ind = 1;

            }

        }
        if (ind == -1) {
            System.out.println("\n\n\tfilme não cadastrado!!!\n\n");
        }
    }

    // Fim do Método Consultar filmes
    // #####################################################

    // Método Atualizar genero filme
    // ################################################################

    static void atualizargenero(int indice) {
        String nome_filme;
        String genero_filme;

        int ind = -1, i = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("\t ###  Atualizar genero do filme  ###");
        System.out.print("\t Digite o nome do filme:");
        nome_filme = entrada.next();

        while (i < indice) {
            if (nome_filme.equals(nome[i])) {
                System.out.print("\n\t Digite o novo genero: ");
                genero_filme = entrada.next();
                genero[i] = genero_filme;
                System.out.println("\t genero alterado com sucesso!!!\n\n\n");
                ind = 1;
                break;
            }
            i++;
        }
        if (ind == -1) {
            System.out.println("\n\n\tProduto não cadastrado!!!\n\n");
        }
    }

    // Fim Métdo Atualizar genero filme
    // #############################################################

    // Método Excluir filme
    // ###############################################################

    static int excluirfilme(int indice) {

        Scanner entrada = new Scanner(System.in);
        int i, ID, sinalizador = -1;
        int retorno = indice;
        System.out.println("\n\t ###   Excluir Filme   ###");
        System.out.print("\tDigite o ID do filme: ");
        ID = entrada.nextInt();

        for (i = 0; i < indice; i++) {
            if (ID == id[i]) {
                id[i] = id[indice - 1];
                retorno = indice - 1;
                sinalizador = 1;
            }
        }
        System.out.print("\tFILME EXCLUIDO COM SUCESSO: ");
        System.out.print(" ");
        if (sinalizador == -1) {
            System.out.println("\n\n\tID não cadastrado!!!\n\n");
            retorno = indice;

        }
        return retorno;
    }

    // Fim Metodo Excluir filme
    // ##########################################################

    // Metodo Consultat ID
    // ###############################################################

    static int procuraIndiceID(int indice, int id_produto) {

        int i, retorno = -1;

        for (i = 0; i < indice; i++) {

            if (id_produto == id[i])
                retorno = i;
        }

        return retorno;
    }

    // Fim Método Consultat ID
    // ###########################################################

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner entrada = new Scanner(System.in);
        int indice = 10;

        // Criação de variáveis no MAIN
        int op = 0;

        /*
         * Populando os Arrays
         * 
         * Populando os id
         */

        for (int i = 0; i < 10; i++) {
            id[i] = i;
        }
        // Populando os nomes
        nome[0] = "-----";
        nome[1] = "OS_PARCAS";
        nome[2] = "POR_ACIDENTE";
        nome[3] = "DUAS_RAINHIAS";
        nome[4] = "LUKAS";
        nome[5] = "SUPER_TIRA 2";
        nome[6] = "O_QUINTO_PASSAGEIRO";
        nome[7] = "A_VIDA_NA_NATUREZA";
        nome[8] = "CLOSE";
        nome[9] = "LOGAN";

        // Populando os generos
        genero[0] = "\t        --------";
        genero[1] = "\t        COMEDIA";
        genero[2] = "       AÇÃO";
        genero[3] = "      DRAMA\t";
        genero[4] = "\t        AÇÃO";
        genero[5] = "       AÇÃO";
        genero[6] = "FICÇÃO";
        genero[7] = "\tDRAMA";
        genero[8] = "\t\tAÇÃO";
        genero[9] = "\t\tAÇÃO";

        // Menu Principal

        while (op != 8) {

            op = mostrarMenu();

            switch (op) {

                case 1:
                    listar(indice);
                    break;

                case 2:
                    filmes_assistir(indice);

                    break;

                case 3:
                    System.out.println("\n\n\t ###   Cadastrar filme   ####");
                    System.out.print("\n\tDigite o nome do filme: ");
                    String nome_filme;
                    nome_filme = entrada.next();
                    System.out.print("\n\tDigite o genero do filme: ");
                    String genero;
                    genero = entrada.next();
                    cadastrarfilmes(indice, nome_filme, genero);
                    indice++;
                    System.out.println("\t filme cadastrado com sucesso!!!\n\n\n");
                    break;

                case 4:
                    atualizargenero(indice);
                    break;

                case 5:
                    consultarfilme(indice);
                    break;

                case 6:
                    indice = excluirfilme(indice);
                    break;

                default:
                    break;
            }

        }

    }

}