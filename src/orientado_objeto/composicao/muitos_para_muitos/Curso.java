package orientado_objeto.composicao.muitos_para_muitos;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    final String nome;
    final List<Aluno> alunos = new ArrayList<>();

    Curso(String nome) {
        this.nome = nome;
    }

    // Relação BiDirecional
    void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }
}
