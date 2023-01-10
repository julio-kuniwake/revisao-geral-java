package collections;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<Usuario> usuarios = new HashSet<>();

        usuarios.add(new Usuario("Ana"));
        usuarios.add(new Usuario("Julio"));
        usuarios.add(new Usuario("Thiago"));

        // Caso comente o metodo hashCode da classe Usuario o resultado sera diferente
        // pois primeiro ele faz a varedura pelo hashCode e depois pelo equals
        boolean resultado = usuarios.contains(new Usuario("Ana"));
        System.out.println(resultado);
    }
}
