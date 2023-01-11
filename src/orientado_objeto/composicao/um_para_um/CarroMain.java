package orientado_objeto.composicao.um_para_um;

public class CarroMain {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        System.out.println("O carro esta ligado? " + c1.estaLigado());

        c1.ligar();
        System.out.println("O carro esta ligado? " + c1.estaLigado());

        System.out.println("O giro do motor está em: " + c1.motor.giros());
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        System.out.println("O giro do motor agora está em: " + c1.motor.giros());

        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        System.out.println("O giro do motor agora está em: " + c1.motor.giros());

        // Exemplo de uma relação BiDirecional
        System.out.println(c1.motor.carro.motor.carro.motor.giros());
    }
}
