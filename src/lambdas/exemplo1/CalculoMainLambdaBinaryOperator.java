package lambdas.exemplo1;

import java.util.function.BinaryOperator;

// Neste exemplo não precisaria ter a interface Calculo
public class CalculoMainLambdaBinaryOperator {
    public static void main(String[] args) {

        // Substituindo para um interface que ja esta presente no java 'BinaryOperator<Double>'
        BinaryOperator<Double> calculo = (a, b) -> {
            double result = a + b;
            return result;
        };
        System.out.println(calculo.apply(2.0, 3.0)); // usando o 'apply'

        calculo = (a, b) -> a * b;
        System.out.println(calculo.apply(2.0, 3.0));


        // Exemplo com Integer
        BinaryOperator<Integer> calculo2 = (a, b) -> {
            int result = a + b;
            return result;
        };
        System.out.println(calculo2.apply(2, 3)); // usando o 'apply'

        calculo2 = (a, b) -> a * b;
        System.out.println(calculo2.apply(2, 3));

    }
}
