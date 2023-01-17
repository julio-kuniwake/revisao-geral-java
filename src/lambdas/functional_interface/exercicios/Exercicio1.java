package lambdas.functional_interface.exercicios;

import lambdas.functional_interface.Produto;

import java.text.NumberFormat;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Exercicio1 {
    public static void main(String[] args) {
        /*
        1. A partir do produto, calcular o preço real (com desconto)
        2. Imposto Municipal: >= 2500 (8.5%) < 2500 isento
        3. Frete >= 3000 (100) / < 3000 (50)
        4. Arredondar: Deixar duas casa decimais
        5. Formatar: R$:1500,52
         */

        Produto produto = new Produto("Ps5", 5001.00, 0.5);

        // Aceita um único argumento(T) e produz um resultado(R)
        Function<Produto, Double> precoRealComDesconto = p -> (p.getPreco() * (1 - p.getDesconto()));
        System.out.println("O preço do produto com desconto foi de: " + precoRealComDesconto.apply(produto));

        UnaryOperator<Double> precoImpostoMunicipal = preco -> preco >= 2500 ? (preco * 1.085) : preco;
        System.out.println("Já o preço com imposto: " + precoRealComDesconto.andThen(precoImpostoMunicipal).apply(produto));

        UnaryOperator<Double> valorFrete = preco -> preco >= 3000 ? preco + 100 : preco + 50;

        String valorFormatado = NumberFormat.getCurrencyInstance().format(precoRealComDesconto
                .andThen(precoImpostoMunicipal
                        .andThen(valorFrete))
                .apply(produto));
        System.out.println("O preço acrescentando o frete: " + valorFormatado);
    }
}
