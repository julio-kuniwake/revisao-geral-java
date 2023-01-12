package orientado_objeto.encapsulamento.getter_setter;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private int idade;

    public Pessoa(String nome, String sobrenome, int idade) {
        this.setNome(nome);
        this.setSobrenome(sobrenome);
        this.setIdade(idade); // Chamando o metodo setIdade no contrutor para tambem pegar a validação
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome.length() > 1) { // Regra para não ter nome com apenas ula letra
            this.nome = nome;
        }
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNomeCompleto() { // Criando um metodo get com o nome completo, opu seja um atributo calculado
        return getNome() + " " + getSobrenome();
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0 && idade <= 125) { // Regra para não deixar idade negativa
            this.idade = idade;
        }
    }

    @Override
    public String toString() {
        return "Eu sou " + getNome() + " e tenho " + getIdade() + " anos.";
    }
}
