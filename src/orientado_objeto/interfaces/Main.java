package orientado_objeto.interfaces;

public class Main {
    public static void main(String[] args) {

        Ferrari ferrari = new Ferrari("Gasolina");
        System.out.println("Ferrari");
        ferrari.temArDigital();
        ferrari.direcaoAutonoma();
        System.out.println("Tipo combustivel: " + ferrari.getTipoCombustivel());
        System.out.println("O preço da ferrari foi de: " + ferrari.getPreco() +  "\n");

        Casa casa = new Casa();
        System.out.println("O preço da casa foi de: " + casa.getPreco());

    }
}
