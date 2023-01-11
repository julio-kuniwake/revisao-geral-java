package orientado_objeto.polimorfismo;

public class Pessoa {
    private double peso;

    public Pessoa(double peso) {
        this.setPeso(peso);
    }

    public void comer(Comida comida) { // Metodo quando a pessoa come, Comida seria o tipo mais generico
        this.peso += comida.getPeso(); // Acrescentando o peso da comida a pessoa
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        }
    }
}
