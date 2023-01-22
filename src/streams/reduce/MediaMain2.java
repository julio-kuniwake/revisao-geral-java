package streams.reduce;

import streams.Aluno;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class MediaMain2 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("julio", 8.8);
        Aluno a2 = new Aluno("Ana", 7.6);
        Aluno a3 = new Aluno("Carol", 5.9);
        Aluno a4 = new Aluno("Claudia", 9.8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        // Recebe um único parâmetro(T) e retorna true ou false
        Predicate<Aluno> aprovado = a -> a.getNota() >= 7;

        // Aceita um único argumento(T) e produz um resultado(R)
        Function<Aluno, Double> apenasAprovados = a -> a.getNota();

        // Recebe dois parâmetros e retorna um, sendo que o retorno pode ser de tipo diferente.
        BiFunction<Media, Double, Media> calcularMedia =
                (media, nota) -> media.adicionar(nota);

        // Recebe dois parâmetros e retorna um, ambos têm que ser do mesmo tipo
        BinaryOperator<Media> combinarMedia =
                (m1, m2) -> Media.combinar(m1, m2);

        Media media = alunos.stream()
                .filter(aprovado)
                .map(apenasAprovados)
                .reduce(new Media(), calcularMedia, combinarMedia);

        System.out.println("A media dos aprovados da turma é: " + media.getValorMedia());
    }
}
