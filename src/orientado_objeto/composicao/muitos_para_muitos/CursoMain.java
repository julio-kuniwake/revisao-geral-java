package orientado_objeto.composicao.muitos_para_muitos;

public class CursoMain {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Ana");
        Aluno aluno2 = new Aluno("Caroline");
        Aluno aluno3 = new Aluno("Julio");

        Curso curso1 = new Curso("Java");
        Curso curso2 = new Curso("PHP");
        Curso curso3 = new Curso("Angular");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);

        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);

        // Buscando todos os alunos do curso1
        System.out.println("Buscando todos os alunos que estão no curso de " + curso1.nome);
        for (Aluno aluno : curso1.alunos) {
            System.out.println(aluno.nome);
        }

        // Buscando de outra forma os alunos do curso1
        System.out.println("\n" + aluno1.cursos.get(0).alunos);
        System.out.println();

        Curso cursoEncontrado = aluno1.obterCursoPorNome("PHP");
        if (cursoEncontrado != null) {
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
        }
    }
}
