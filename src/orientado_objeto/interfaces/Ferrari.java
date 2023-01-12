package orientado_objeto.interfaces;

public class Ferrari extends Carro implements Luxo, ItemCaro { // Ferrari é um Carro e implementa Luxo e ItemCaro
    Ferrari(String tipoCombustivel) {
        super(tipoCombustivel); // tipoCombustivel vem de 'Carro'
    }

    @Override
    public void temArDigital() {
        System.out.println("Ar Digital de duas zonas!");
    }

    @Override
    public void direcaoAutonoma() { // Sobrescrevendo metodo de Veiculo
        System.out.println("É direção autonoma, sem limite de quilometragem");
    }

    @Override
    public double getPreco() { // Sobrescrevendo o metodo da interface ItemCaro
        return 60000.00;
    }
}
