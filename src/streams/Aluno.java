package streams;

public class Aluno {
    String nome;
    double nota;
    boolean bomComportamento;

    public Aluno(String nome, double nota) {
        this(nome, nota, true); // Chamndo o contrutor de baixo
    }

    public Aluno(String nome, double nota, boolean bomComportamento) {
        this.nome = nome;
        this.nota = nota;
        this.bomComportamento = bomComportamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public boolean isBomComportamento() {
        return bomComportamento;
    }

    public void setBomComportamento(boolean bomComportamento) {
        this.bomComportamento = bomComportamento;
    }
}
