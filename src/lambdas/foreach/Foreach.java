package lambdas.foreach;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Ana", "Lia", "Gui");

        for (String nome : aprovados) { // Modo simples
            System.out.print(nome + " ");
        }

//  *********************************************************************************************************
        System.out.println("\nLambda #01...");

        aprovados.forEach((nome) -> { // Lambda com mais de uma senteça
            String nomeConcatenado = "!!!" + nome;
            System.out.println(nomeConcatenado);
        });

        System.out.println();
        aprovados.forEach(nome -> System.out.println(nome + "!!!")); // Modo mais simplificado

//  *********************************************************************************************************
        System.out.println("\nMethod Reference #01..."); // É menos flexivel

        aprovados.forEach(System.out::println); // Passando um referencia para essa função, usado quando se quer mostrar algo

//  *********************************************************************************************************
        System.out.println("\nLambda #02...");

        aprovados.forEach((nome) -> {
            String nomeConcatenado = "!!!" + nome;
            meuImprimir(nomeConcatenado); // Usando um metodo
        });

//        System.out.println();
//        aprovados.forEach(nome -> meuImprimir(nome));

//  *********************************************************************************************************
        System.out.println("\nMethod Reference #02...");

        aprovados.forEach(Foreach::meuImprimir); // Passando uma referencia para o metodo
    }

    static void meuImprimir(String nome) {
        System.out.println("Meu nome é " + nome);
    }
}
