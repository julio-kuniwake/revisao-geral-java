package orientado_objeto.abstrato;

public class Main {
    public static void main(String[] args) {
        Mamifero cachorro = new Cachorro();
        System.out.println(cachorro.mover());
        System.out.println(cachorro.mamar());
        System.out.println(cachorro.respirar());

    }
}
