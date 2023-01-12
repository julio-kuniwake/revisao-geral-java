package orientado_objeto.abstrato;

public abstract class Animal {

    public String respirar() { // Metodo com implementação
        return "Usando o fucinho";
    }

    // So é possivel ter metodos abstratos em classes abstrata
    public abstract String mover();
}
