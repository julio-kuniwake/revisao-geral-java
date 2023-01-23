package streams.match;

import streams.Aluno;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("julio", 8.8);
        Aluno a2 = new Aluno("Ana", 7.6);
        Aluno a3 = new Aluno("Carol", 5.9);
        Aluno a4 = new Aluno("Claudia", 9.8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        // Recebe um único parâmetro(T) e retorna true ou false
        Predicate<Aluno> aprovado = a -> a.getNota() >= 7;

        Predicate<Aluno> reprovado = aprovado.negate();

        System.out.println("Todos os alunos foram aprovados? " + alunos.stream().allMatch(aprovado));
        System.out.println("Algum aluno foi reprovado? " + alunos.stream().anyMatch(aprovado));
        System.out.println("Nenhum aluno foi aprovado? " + alunos.stream().noneMatch(aprovado));
        System.out.println("Ninguem foi reprovado na turma? " + alunos.stream().noneMatch(reprovado));

    }
}
