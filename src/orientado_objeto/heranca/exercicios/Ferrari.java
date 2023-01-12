package orientado_objeto.heranca.exercicios;

public class Ferrari extends Carro {

    @Override
    public void acelerar() {
        velocidadeAtual += 15;
    }

    @Override
    public void frear() {
        if (velocidadeAtual <= 0) {
            return;
        }
        velocidadeAtual -= 15;
    }
}
