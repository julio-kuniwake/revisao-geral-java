package streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class ComposicaoMap {
    public static void main(String[] args) {

        Consumer<String> print = System.out::print;

        List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda\n");
        marcas.stream().map(m -> m.toUpperCase()).forEach(print);

        UnaryOperator<String> maicuscula = n -> n.toUpperCase();
        UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
        UnaryOperator<String> exclamacao = n -> n + "!!!! ";

        System.out.println("\nUsando composição...");
        marcas.stream()
                .map(maicuscula)
                .map(primeiraLetra)
                .map(exclamacao)
                .forEach(print);
    }
}
