package orientado_objeto.heranca.enums;

public class JogoMain {
    public static void main(String[] args) {

        Vilao vilao = new Vilao();
        vilao.x = 10;
        vilao.y = 10;

        Heroi heroi = new Heroi();
        heroi.x = 10;
        heroi.y = 11;

        System.out.println("Vida do vilão -> " + vilao.vida);
        System.out.println("Vida do heroi -> " + heroi.vida);

        System.out.println();
        System.out.println("Vilão atacou");
        System.out.println();
        vilao.atacar(heroi);

        System.out.println("Vida do vilão -> " + vilao.vida);
        System.out.println("Vida do heroi -> " + heroi.vida);

    }
}
