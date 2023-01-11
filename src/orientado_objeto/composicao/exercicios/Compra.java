package orientado_objeto.composicao.exercicios;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    final List<Item> itens = new ArrayList<>();

    public void adicionarItem(Produto p, int qtd) {
        this.itens.add(new Item(p, qtd));
    }

    public void adicionarItem(String nome, double preco, int qtd) {
        this.itens.add(new Item(new Produto(nome, preco), qtd));
    }

    double obterValorTotal() {
        double total = 0;
        for (Item item : this.itens) {
            total += item.qtd * item.produto.preco;
        }
        return total;
    }
}
