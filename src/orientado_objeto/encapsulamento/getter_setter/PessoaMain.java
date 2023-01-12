package orientado_objeto.encapsulamento.getter_setter;

public class PessoaMain {
    public static void main(String[] args) {

        // Tentando passar a idade negativa
        // Não vai ficar negativa por causa da validação no metodo 'setIdade()'
        Pessoa p1 = new Pessoa("a", "Carol", -45);
        p1.setIdade(-30);
        p1.setNome("B");
        System.out.println("Idade está zerada pois tentou passar uma idade negativa: " + p1.getIdade());
        System.out.println("Nome esta com apenas 1 caracter, por isso é invalido: " + p1.getNome() + "\n");

        p1.setIdade(34);
        p1.setNome("Ana");
        System.out.println("Idade correta já passando pelas validações: " + p1.getIdade());
        System.out.println("Agora o nome tem mais de um caracter: " + p1.getNome() + "\n");

        System.out.println(p1 + "\n"); // Imprimindo pelo metodo 'toString()'

        System.out.println("Meu nome completo é: " + p1.getNomeCompleto());
    }

}
