package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        // Metodos de adicionar na fila
        // A Diferença é quando a fila esta cheia
        fila.add("Ana"); // Add, lança uma exceptio
        fila.offer("Julio"); // offer, retorno false
        fila.add("Carol");
        fila.offer("Paulo");
        fila.add("Alex");

        // Lendo o elemento da fila mas não remove
        // A diferença é quando a fila esta vazia
        System.out.println(fila.peek()); // Quando a fila esta vazia retorna null
        System.out.println(fila.element() + "\n"); // Quando a fila esta vazia lamça uma exception

        System.out.println("Tamanho da fila -> " + fila.size());
        System.out.println("Fila esta vazia? " + fila.isEmpty());
        System.out.println("Tem? " + fila.contains("Alex") + "\n");
        // fila.clear();

        // Ler a fila e removendo o elemento que foi lido
        // A diferença é quando a fila esta vazia
        System.out.println(fila.poll());
        System.out.println(fila.poll()); // poll(), retorna null, quando a fila esta vazia
        System.out.println(fila.remove()); // remove(), lança um exception, quando a fila esta vazia

        for (String e : fila) {
            System.out.println(e);
        }

    }
}
