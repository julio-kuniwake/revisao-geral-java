package streams.outros_methodos;

import streams.Aluno;

import java.util.Arrays;
import java.util.List;

public class OutrosMethodosStream {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("julio", 8.8);
        Aluno a2 = new Aluno("Ana", 7.6);
        Aluno a3 = new Aluno("Carol", 5.9);
        Aluno a4 = new Aluno("Claudia", 5.8);
        Aluno a5 = new Aluno("Thiago", 6.6);
        Aluno a6 = new Aluno("Alex", 4.9);
        Aluno a7 = new Aluno("Araci", 8.3);
        Aluno a8 = new Aluno("Paulo", 8.2);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

        System.out.println("Distinct...");
        alunos.stream().distinct().forEach(System.out::println);

        System.out.println("\nSkip/Limit");
        alunos.stream()
                .distinct()
                .skip(2) // Pula dois elementos
                .limit(2) // limite de 2 elementos
                .forEach(System.out::println);

        System.out.println("\nTakeWhile");
        alunos.stream()
                .takeWhile(a -> a.getNota() >= 7) // Encotrar alguem ate encontrar alguem que não foi aprovado
                .forEach(System.out::println);
    }
}
