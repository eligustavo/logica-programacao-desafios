package exercicios.vetores.unidimensional;

public class Aula01 {

    public static void main(String[] args) {

        double[] notas = new double[5];
        notas[0] = 7.5;
        notas[1] = 8;
        notas[2] = 3;
        notas[3] = 5;
        notas[4] = 6;
        System.out.println("Tamanhho do array: " + notas.length);
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
    }
}