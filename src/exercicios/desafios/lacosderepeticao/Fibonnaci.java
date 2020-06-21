package exercicios.desafios.lacosderepeticao;

public class Fibonnaci {

    public static void main(String[] args) {

        int n1 = 1, n2 = 0;

        System.out.println(n2);
        System.out.println(n1);

        for (int i = 0; i < 15; i++) {
            n1 = n1 + n2;
            n2 = n1 - n2;
            System.out.println(n1);
        }

        // int num = 8;
        // int a = 0;
        // int b = 1;
        // for (int j = 0; j < num; j++) {
        //     if (num == 1 || num == 2) {
        //         System.out.println(1);
        //     } else {
        //         b = b + a;
        //         a = b - a;
        //         System.out.println(a);

        //     }
        // }
    }

}