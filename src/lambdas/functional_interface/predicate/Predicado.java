package lambdas.functional_interface.predicate;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {

        // Recebe um unico parametro e retorna true ou false
        Predicate<Produto> isCaro =
                prod -> (prod.getPreco() * (1 - prod.getDesconto())) >= 2500.00;

        Produto p = new Produto("Notebook", 4600.00, 0.5);
        System.out.println(isCaro.test(p));
    }
}
