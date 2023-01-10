package orientado_objeto.composicao.um_para_muitos;

public class CompraMain {
    public static void main(String[] args) {
        Compra compra1 = new Compra();
        compra1.cliente = "julio";
        compra1.itens.add(new Item("PS5", 1, 4500.00));
        compra1.itens.add(new Item("TV", 2, 1500.50));
        compra1.itens.add(new Item("Celular", 5, 500.00));

        System.out.printf("Quantidade de itens comprados por %s: %d ", compra1.cliente, compra1.itens.size());
        System.out.println();
        System.out.printf("O valor total da compra de %s é: %.2f", compra1.cliente, compra1.getValorTotal());
    }
}
