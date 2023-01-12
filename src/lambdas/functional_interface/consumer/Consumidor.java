package lambdas.functional_interface.consumer;

import lambdas.functional_interface.Produto;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {

        // Recebe um unico parametro e não retorna nada
        Consumer<Produto> imprimir = p
                -> System.out.println(p.getNome() + " \nPreço: " + p.getPreco() + " \nDesconto: " + p.getDesconto() + "\n");

        Produto produto = new Produto("PS6", 6000.00, 0.25);
        imprimir.accept(produto); // É necessario usar o accept para imprimir

//  ****************************************************************************************************************

        Produto p1 = new Produto("PS5", 5000.00, 0.20);
        Produto p2 = new Produto("PS4", 4000.00, 0.15);
        Produto p3 = new Produto("PS3", 3000.00, 0.10);
        Produto p4 = new Produto("PS2", 2000.00, 0.05);
        Produto p5 = new Produto("PS1", 1000.00, 0.01);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        produtos.forEach(imprimir); // forEach recebendo como parametro o consumer 'imprimir'

        produtos.forEach(p -> System.out.println(p.getPreco())); // Imprimindo apenas os preços

        System.out.println();
        produtos.forEach(System.out::println); // Method Reference

    }
}
