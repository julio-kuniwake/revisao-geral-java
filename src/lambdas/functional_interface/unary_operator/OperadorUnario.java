package lambdas.functional_interface.unary_operator;

import java.util.function.UnaryOperator;

public class OperadorUnario {
    public static void main(String[] args) {

        // O tipo de parâmetro passado é o mesmo retornado
        UnaryOperator<Integer> maisDois = numero -> (numero + 2);
        UnaryOperator<Integer> vezesDoid = numero -> (numero * 2);
        UnaryOperator<Integer> aoQuadrado = numero -> (numero * numero);

        int resultado1 = maisDois
                .andThen(vezesDoid)
                .andThen(aoQuadrado)
                .apply(0);
        System.out.println("Resultado com AndThen: " + resultado1);

        // Compose gera o mesmo resultado mais indo do ultimo para o primeiro
        int resultado2 = aoQuadrado
                .compose(vezesDoid)
                .compose(maisDois)
                .apply(0);
        System.out.println("Resultado com Compose: " + resultado2);

    }
}
