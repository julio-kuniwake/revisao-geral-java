package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetHomogenio {
    public static void main(String[] args) {
//        Set<String> listaCandidatos = new HashSet<>(); // Não garante a ordem de inserção
        SortedSet<String> listaCandidatos = new TreeSet<>(); // Para garantir a ordem de inserção
        listaCandidatos.add("Ana");
        listaCandidatos.add("Caroline");
        listaCandidatos.add("Julio");
        listaCandidatos.add("Kuniwake");

        for (String candidato : listaCandidatos) {
            System.out.println(candidato);
        }

        //
        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        // AltoBox, convertendo um Integer para int
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
