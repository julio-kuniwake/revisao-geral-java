package collections;

import java.util.HashSet;
import java.util.Set;

public class SetHeterogenio { // Hash com valores misturados
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {

        HashSet conjuto = new HashSet();

        conjuto.add(1.2); //Faz o wrapper (converte double -> Double)
        conjuto.add(true);
        conjuto.add("teste");
        conjuto.add(1);
        conjuto.add('X');

        System.out.println("Tamanho é: " + conjuto.size());
        conjuto.add("teste"); // Adicionando a String "teste" novamente
        System.out.println("Tamanho continua: " + conjuto.size());

        // Exemplo de remove
        System.out.println(conjuto.remove("Algum"));
        System.out.println(conjuto.remove("teste"));

        System.out.println("O Tamanho agora é: " + conjuto.size());

        // Exemplo de contains
        System.out.println(conjuto.contains('X'));
        System.out.println(conjuto.contains(true));
        System.out.println(conjuto.contains(false));

        System.out.println(conjuto + "\n");

        // Criando novo Set
        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println("Numeros: " + nums);

        // Fazendo a união entres dois conjuntos
//        conjuto.addAll(nums);
//        System.out.println("Apos junção: " + conjuto);

        // Intercesão entre dois conjuntos
        conjuto.retainAll(nums);
        System.out.println("Valores que são comuns estre os dois conjuntos: " + conjuto);

        conjuto.clear();
        System.out.println(conjuto);

    }
}
