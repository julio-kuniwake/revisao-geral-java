package orientado_objeto.heranca.exercicios;

public class CarroMain {
    public static void main(String[] args) {

        Carro ferrari = new Ferrari();
        Carro civic = new Civic();

        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        System.out.println("Ferrari -> " + ferrari);
        ferrari.frear();
        ferrari.frear();
        System.out.println("Ferrari apos frear -> " + ferrari + "\n");

        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        System.out.println("Civic -> " + civic);
        civic.frear();
        civic.frear();
        civic.frear();
        civic.frear();
        System.out.println("Civic apos frear -> " + civic);
    }
}
