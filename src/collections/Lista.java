package collections;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {

        List<Usuario> usuarioList = new ArrayList<>();
        Usuario u1 = new Usuario("Ana");

        usuarioList.add(u1);
        usuarioList.add(new Usuario("julio"));
        usuarioList.add(new Usuario("Pedro"));
        usuarioList.add(new Usuario("João"));
        usuarioList.add(new Usuario("Carol"));

        // Acessando valor pelo indice
        System.out.println("Usuario pelo indice -> " + usuarioList.get(3).nome + "\n");

        // Exemplo de remoção
        System.out.println(">>>>>>> Removendo " + usuarioList.remove(1));
        System.out.println(usuarioList.remove(new Usuario("João")));

        // Exemplo de contains
        System.out.println("Contem o usuario " + (usuarioList.get(2).nome) + " -> " + usuarioList.contains(new Usuario("Carol")));

        for (Usuario u : usuarioList) {
            System.out.println(u.nome);
        }
    }
}
