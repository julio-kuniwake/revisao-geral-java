package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();

        livros.add("O pequeno principe");
        livros.push("Livro 2");
        livros.push("Livro 3");

        System.out.println(livros.peek());
        System.out.println(livros.element() + "\n");

        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
//        System.out.println(livros.poll()); // Lança exception
//        System.out.println(livros.remove()); // Lança exception

        // Outros metodos
//        livros.size();
//        livros.clear();
//        livros.isEmpty();
//        livros.contains("Livro 2");
    }
}
