package collections;


import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();

        // Adicionando no Map
        // put(), ele pode adicionar e subistituir caso exista o elemento
        usuarios.put(1, "Ana");
        usuarios.put(22, "Caroline");
        usuarios.put(3, "Julio");
        usuarios.put(45, "Paulo");
        usuarios.put(5, "Araci");

        System.out.println(usuarios);
        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty() + "\n");

        // Pegando todas as chaves
        System.out.println("Retornando todas as chaves do map " + usuarios.keySet());

        // Pegando todos os valores
        System.out.println("Retornando todos os valores " + usuarios.values());

        // Pegando chaves e valores
        System.out.println("Retornando chaves e valores " + usuarios.entrySet() + "\n");

        // Contains
        System.out.println("Contem a chave 22? " + usuarios.containsKey(22));
        System.out.println("Contem o valor? " + usuarios.containsValue("Paulo") + "\n");

        // Buscando o valor pela chave
        System.out.println("Buscando o valor pela chave 22 -> " + usuarios.get(22) + "\n");

        // Removendo
//        System.out.println(usuarios.remove(1));
//        System.out.println(usuarios.remove(22, "teste"));

        // Formas de percorrer os elementos de um Map
        System.out.println("Percorrendo os valores pela chave");
        for (int chave : usuarios.keySet()) {
            System.out.print(chave + " ");
        }
        System.out.println();

        System.out.println("\nPercorrendo os valores pelo valor");
        for (String value : usuarios.values()) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.println("\nPercorrendo chave e valor");
        for (Map.Entry<Integer, String> registro : usuarios.entrySet()) {
            System.out.print(registro.getKey() + " ");
            System.out.println(registro.getValue());
        }

    }
}
