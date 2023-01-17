package streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class ExercicioMap {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        /*
         * 1. Número para string binaria... 6 => "110"
         * 2. Inverter a string... "110" => "011"
         * 3. Converter de volta para inteiro => "011" => 3
         * 4. Somar com 2
         * */

        // O tipo de parametro passado String T, é o mesmo retornado
        UnaryOperator<String> inverter = texto -> new StringBuilder(texto).reverse().toString();

        // Recebe uma String T, e retorna um Integer R
        Function<String, Integer> binarioParaInteger = s -> Integer.parseInt(s, 2);
        UnaryOperator<Integer> somarMaisDois = e -> e + 2;

        nums.stream()
                .map(n -> Integer.toBinaryString(n))
                .map(inverter)
                .map(binarioParaInteger)
                .map(somarMaisDois)
                .forEach(System.out::println);
    }
}
