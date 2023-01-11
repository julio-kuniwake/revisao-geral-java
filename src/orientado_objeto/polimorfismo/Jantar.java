package orientado_objeto.polimorfismo;

public class Jantar {
    public static void main(String[] args) {
        Pessoa convidado = new Pessoa(97.00);

        // Usando o Polimorfismo
        Comida arroz = new Arroz(1.00);
        Comida feijao = new Feijao(1.00);
        Comida sorvete = new Sorvete(2.00);

        System.out.println("Peso inicial do convidado é: " + convidado.getPeso());
        convidado.comer(arroz);
        convidado.comer(feijao);
        convidado.comer(sorvete);
        System.out.println("\nO peso do convidado apos comer é: " + convidado.getPeso());
    }
}
