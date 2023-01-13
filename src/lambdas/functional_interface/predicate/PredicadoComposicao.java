package lambdas.functional_interface.predicate;

import java.util.function.Predicate;

public class PredicadoComposicao {
    public static void main(String[] args) {

        // Recebe um unico parametro e retorna true ou false
        Predicate<Integer> isPar = num -> num % 2 == 0;
        Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;

        System.out.println(isPar.and(isTresDigitos).test(123));
        System.out.println(isPar.or(isTresDigitos).test(123));
    }
}
