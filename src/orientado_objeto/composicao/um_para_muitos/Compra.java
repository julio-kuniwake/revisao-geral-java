package orientado_objeto.composicao.um_para_muitos;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    String cliente;
    List<Item> itens = new ArrayList<>();

    double getValorTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.preco * item.qtd;
        }
        return total;
    }
}
