package streams.list_iterator_stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Lu", "Gui", "Ana", "Maria");

        System.out.println("For Normal...");
        for (int i = 0; i < aprovados.size(); i++) {
            System.out.println(aprovados.get(i));
        }

        System.out.println("\nUsando o foreach...");
        for (String nome : aprovados) {
            System.out.println(nome);
        }

        System.out.println("\nUsando Iterator...");
        Iterator<String> it = aprovados.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nUsando Stream");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println);
    }
}
