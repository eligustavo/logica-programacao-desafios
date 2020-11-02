package exercicios.desafios.uri;

import java.util.Scanner;

public class CrescenteDecrescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x == y)
                return;

            String resultado = (x > y) ? "Decrescente" : "Crescente";
            System.out.println(resultado);

//             if(x > y){
//                 System.out.println("Decrescente");
//             } else {
//                 System.out.println("Crescente");
//             }


        }
    }
}