package lambdas.functional_interface.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
    public static void main(String[] args) {

        // Não recebe nenhum parametro e retorna alguma coisa, no caso aqui retorna List<String>
        Supplier<List<String>> umaLista = () -> Arrays.asList("Ana", "Bia", "Ray", "Abc");

        System.out.println(umaLista.get());
    }
}
