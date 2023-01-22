package streams.reduce;

public class MediaMain {
    public static void main(String[] args) {

        Media m1 = new Media().adicionar(6.7).adicionar(7.8);
        Media m2 = new Media().adicionar(5.0).adicionar(7.0);

        System.out.println(m1.getValorMedia());
        System.out.println(m2.getValorMedia());

        System.out.println(Media.combinar(m1, m2).getValorMedia());
    }
}
