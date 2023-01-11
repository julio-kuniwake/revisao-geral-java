package orientado_objeto.composicao.exercicios;

public class ClienteMain {
    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 10.00, 100);
        compra1.adicionarItem(new Produto("PS5", 5000.00), 1);

        Compra compra2 = new Compra();
        compra1.adicionarItem("Borracha", 1.00, 1000);
        compra1.adicionarItem(new Produto("Caderno", 50.00), 10);

        Cliente cliente1 = new Cliente("julio kuniwake");
        cliente1.adicionarCompra(compra1); // Chamando metodo
        cliente1.compras.add(compra2); // diretamente

        System.out.println(cliente1.obterValorTotal());
    }
}
