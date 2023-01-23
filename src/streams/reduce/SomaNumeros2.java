package streams.reduce;

import streams.Aluno;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class SomaNumeros2 {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("julio", 8.8);
        Aluno a2 = new Aluno("Ana", 7.6);
        Aluno a3 = new Aluno("Carol", 5.9);
        Aluno a4 = new Aluno("Claudia", 9.8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        // Recebe um único parâmetro(T) e retorna true ou false
        Predicate<Aluno> aprovado = a -> a.getNota() >= 7;

        // Aceita um único argumento(T) e produz um resultado(R)
        Function<Aluno, Double> getNota = a -> a.getNota();

        // Recebe dois parâmetros e retorna um, ambos têm que ser do mesmo tipo
        BinaryOperator<Double> somatoria = (v1, v2) -> v1 + v2;

        alunos.stream()
                .filter(aprovado)
                .map(getNota)
                .reduce(somatoria)
                .ifPresent(System.out::println);
    }
}
