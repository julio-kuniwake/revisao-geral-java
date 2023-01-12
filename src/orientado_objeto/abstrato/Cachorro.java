package orientado_objeto.abstrato;

// A classe Cahorro por ser uma classe concreta, é obrigatorio implementar o(s) metodo(s) abstrato da classe 'super()'
public class Cachorro extends Mamifero {

    @Override
    public String mamar() { // Metodo abstrato da classe 'Mamifero'
        return "Usando leite";
    }

    @Override
    public String mover() { // Metodo abstrato da classe 'Animal'
        return "Usando as patas";
    }
}
