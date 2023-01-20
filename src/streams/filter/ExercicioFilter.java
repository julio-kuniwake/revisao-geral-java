package streams.filter;

import streams.Produto;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ExercicioFilter {
    public static void main(String[] args) {

        Produto p = new Produto("PS5", 5000.00, 0.25, 0);
        Produto p1 = new Produto("PS4", 4000.00, 0.23, 0);
        Produto p2 = new Produto("PS3", 3000.00, 0.20, 30);
        Produto p3 = new Produto("PS2", 2000.00, 0.50, 0);
        Produto p4 = new Produto("PS1", 1000.00, 0.33, 10);

        List<Produto> produtos = Arrays.asList(p, p1, p2, p3, p4);

        // Recebe um único parâmetro(T) e retorna true ou false
        Predicate<Produto> valorDesconto = vd -> vd.getDesconto() >= 0.25;

        Predicate<Produto> freteGratis = fg -> fg.getValorFrete() == 0;

        // Aceita um único argumento(T) e produz um resultado(R)
        Function<Produto, String> superPreco = sp ->
                sp.getNome() + " está em uma super promoção, saindo de "
                        + sp.getPreco() + " por "
                        + (sp.getPreco() - sp.getPreco() * sp.getDesconto())
                        + " e frete gratis";


        produtos.stream()
                .filter(valorDesconto)
                .filter(freteGratis)
                .map(superPreco)
                .forEach(System.out::println);
    }
}
