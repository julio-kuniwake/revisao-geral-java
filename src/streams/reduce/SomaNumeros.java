package streams.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class SomaNumeros {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // Recebe dois parâmetros e retorna um, ambos têm que ser do mesmo tipo
        BinaryOperator<Integer> soma = (acumulador, n) -> acumulador + n;

        UnaryOperator<Integer> multiplica = m -> m * 3;
        Integer total = nums.stream().reduce(soma).get();
        System.out.println("Total = " + total);

        Integer total2 = nums.stream().reduce(10, soma);
        System.out.println("Total2 = " + total2);

        nums.stream()
                .filter(n -> n > 5) // 6 + 7 + 8 + 9 = 30
                .map(multiplica) // multiplica o resultado * 3 = 90
                .reduce(soma)
                .ifPresent(e -> System.out.println("Total 3 = " + e));

    }
}
