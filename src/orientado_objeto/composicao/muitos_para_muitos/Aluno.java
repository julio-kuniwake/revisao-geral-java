package orientado_objeto.composicao.muitos_para_muitos;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    final String nome;
    final List<Curso> cursos = new ArrayList<>();

    Aluno(String nome) {
        this.nome = nome;
    }

    // Relação BiDirecional
    void adicionarCurso(Curso curso) {
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    // Metodo para procurar o curso pelo nome
    Curso obterCursoPorNome(String nome) {
        for (Curso curso : this.cursos) {
            if (curso.nome.equalsIgnoreCase(nome)) {
                return curso;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return nome;
    }
}

