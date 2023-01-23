package streams.mim_max;

import streams.Aluno;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
    // Para utilizar o mim ou max é necessario implementar o 'Comparator'
        public static void main(String[] args) {

        Aluno a1 = new Aluno("julio", 8.8);
        Aluno a2 = new Aluno("Ana", 7.6);
        Aluno a3 = new Aluno("Carol", 5.9);
        Aluno a4 = new Aluno("Claudia", 9.8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
            if (aluno1.getNota() > aluno2.getNota()) return 1;
            if (aluno1.getNota() < aluno2.getNota()) return -1;
            return 0;
        };

        System.out.println(alunos.stream().max(melhorNota).get()); // Melhor nota
        System.out.println(alunos.stream().min(melhorNota).get()); // Pior nota
    }
}
