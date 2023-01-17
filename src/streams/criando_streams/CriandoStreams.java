package streams.criando_streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {

        Consumer<String> print = System.out::print;
        Consumer<Integer> println = System.out::println;

        Stream<String> linguagens = Stream.of("Java ", "PHP ", "JS\n");
        linguagens.forEach(print);

        String[] maisLinguagens = {"Pyton ", "Lisp ", "Perl ", "Do\n"};

        Stream.of(maisLinguagens).forEach(print);
        Arrays.stream(maisLinguagens).forEach(print);
        Arrays.stream(maisLinguagens, 1, 4).forEach(print);

        List<String> outraLinguagens = Arrays.asList("C ", "Kotlin ", "Flutter\n");
        outraLinguagens.stream().forEach(print);
        outraLinguagens.parallelStream().forEach(print);

        // Gerar Streams que neste caso esta infinita
//        Stream.generate(() -> "A").forEach(print);
//        Stream.iterate(0, n -> n + 1).forEach(println);
    }
}
