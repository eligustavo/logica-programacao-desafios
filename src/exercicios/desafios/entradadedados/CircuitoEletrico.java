package exercicios.desafios.entradadedados;

import java.util.Locale;
import java.util.Scanner;

public class CircuitoEletrico {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      sc.useLocale(Locale.US);

      double volt;
      double amperes;

      System.out.print("Digite a voltagem: ");
      volt = sc.nextDouble();
      System.out.print("Digite os amperes: ");
      amperes = sc.nextDouble();
      double resistencia = volt / amperes;
      System.out.println("Resistencia: " + resistencia);

      System.out.print("Digite o valor da resistencia: ");
      resistencia = sc.nextDouble();
      System.out.print("Digite os amperes: ");
      amperes = sc.nextDouble();
      volt = resistencia - amperes;
      System.out.println("Tensão em Volts: " + volt);

      

      sc.close();
   }
}