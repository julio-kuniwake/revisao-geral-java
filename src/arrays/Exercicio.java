package arrays;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite a quantidade de notas: ");
        int qtdNotas = scan.nextInt();
        double notas[] = new double[qtdNotas];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Informe a nota " + (i + 1) + ": ");
            notas[i] = scan.nextDouble();
        }

        double total = 0;
        for (double nota : notas) {
            total += nota;
        }
        System.out.println("A media das notas é: " + total / notas.length);

        scan.close();
    }

}
