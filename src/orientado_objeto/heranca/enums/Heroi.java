package orientado_objeto.heranca.enums;

public class Heroi extends Jogador {

    // É uma maneira de sobreecrever o metodo sem dar um Ctrl C, Ctrl V
    boolean atacar(Jogador oponente) {
        boolean atacar1 = super.atacar(oponente); // Chamando o metodo da hierarquia superior
        boolean atacar2 = super.atacar(oponente);

        return atacar1 || atacar2;
    }
}
