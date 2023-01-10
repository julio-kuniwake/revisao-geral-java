package orientado_objeto.composicao.um_para_um;

public class Carro {
    final Motor motor;

    Carro() {
        this.motor = new Motor(this); // Relação BiDirecional, um carro tem um motor e um motor tem um carro
    }

    void acelerar() {
        if (motor.fatorInjecao < 2.5) {
            motor.fatorInjecao += 0.4;
        }
    }

    void frear() {
        if (motor.fatorInjecao > 0.5) {
            motor.fatorInjecao -= 0.4;
        }
    }

    void ligar() {
        motor.ligado = true;
    }

    void desligar() {
        motor.ligado = false;
    }

    boolean estaLigado() {
        return motor.ligado;
    }
}
