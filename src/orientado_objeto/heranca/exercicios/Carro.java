package orientado_objeto.heranca.exercicios;

public class Carro {
    double velocidadeAtual = 0.0;

    public void acelerar() {
        velocidadeAtual += 5;
    }

    public void frear() {
        if (velocidadeAtual <= 0) {
            return;
        }
        velocidadeAtual -= 5;
    }

    public String toString(){
        return "Velocidade atual é " + velocidadeAtual + " Km/h.";
    }
}
