package lambdas.functional_interface.function;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {

        // Abaixo é um exemplo de composição de funções
        // usando uma o 'resultado' de uma funcção, como 'argumento' da outra

        // Aceita um unico argumento(T) e retorna um resultado(R)
        Function<Integer, String> parOuImpar =
                numero -> numero % 2 == 0 ? "Par" : "Impar";

        Function<String, String> oResultadoE = valor
                -> "O resultado é: " + valor;

        Function<String, String> empolgado = valor
                -> valor + "!!!";

        String resultadoFinal = parOuImpar
                .andThen(oResultadoE)
                .andThen(empolgado)
                .apply(32);

        System.out.println(resultadoFinal);
        System.out.println("\n" + parOuImpar.apply(33));
    }
}
