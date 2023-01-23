package streams.filter;

import streams.Cachorro;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {

        Cachorro c = new Cachorro("Luna", "femea", 5);
        Cachorro c1 = new Cachorro("Stark", "macho", 4);
        Cachorro c2 = new Cachorro("Tunico", "macho", 12);
        Cachorro c3 = new Cachorro("Pink", "macho", 13);
        Cachorro c4 = new Cachorro("Nina", "femea", 8);
        Cachorro c5 = new Cachorro("Max", "macho", 18);

        List<Cachorro> cachorros = Arrays.asList(c, c1, c2, c3, c4, c5);

        // Recebe um único parâmetro(T) e retorna true ou false
        Predicate<Cachorro> estaVelho = e -> e.getIdade() > 5;
        // Aceita um único argumento(T) e produz um resultado(R)
        Function<Cachorro, String> statusCachorro = e -> e.getNome() + " já está velho(a)";

        // Function<String, Integer> tamanhoString = e -> e.length();

        cachorros.stream()
                .filter(estaVelho)
                .map(statusCachorro)
                // .map(tamanhoString)
                .forEach(System.out::println);
    }
}
