package lambdas.functional_interface.binary_operator;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
    public static void main(String[] args) {

        // Recebe dois parametro e retorna um, sendo ambos do mesmo tipo
        BinaryOperator<Double> media = (num1, num2) -> (num1 + num2) / 2;
        System.out.println("A media é: " + media.apply(9.8, 5.4));

        // Recebe dois parâmetros e retorna um, sendo que o retorno pode ser de tipo diferente
        BiFunction<Double, Double, String> resultado = (n1, n2) -> {
            double notaFinal = (n1 + n2) / 2;
            return notaFinal >= 7 ? "Aprovado" : "Reprovado";
        };
        System.out.println(resultado.apply(9.8, 5.4));

        // Aceita um único argumento(T) e produz um resultado(R)
        Function<Double, String> conceito = m -> (m >= 7) ? "Aprovado" : "Reprovado";
        System.out.println(media.andThen(conceito).apply(6.6, 7.2)); // Composição de funções
    }
}
