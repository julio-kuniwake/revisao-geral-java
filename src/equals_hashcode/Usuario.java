package equals_hashcode;

public class Usuario {
    String nome;
    String email;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Usuario) {
            Usuario outro = (Usuario) obj;

            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailEqual = outro.email.equals(this.email);
            return nomeIgual && emailEqual;
        } else return false;
    }
}
