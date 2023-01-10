package orientado_objeto.composicao.exercicios;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    final String nome;
    final List<Compra> compras = new ArrayList<>();

    Cliente(String nome) {
        this.nome = nome;
    }

    void adicionarCompra(Compra compra) {
        this.compras.add(compra);
    }

    public double obterValorTotal() {
        double totalDasCompras = 0;
        for (Compra compra : compras) {
            totalDasCompras += compra.obterValorTotal();
        }
        return totalDasCompras;
    }
}
