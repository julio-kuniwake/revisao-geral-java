package lambdas.exemplo_lambda;

// Neste exeplo sem expressoes lambda tem a necessidade de ter as classes 'Multiplicar e Somar'
public class CalculoMainNormal {
    public static void main(String[] args) {

        Calculo calculo = new Somar(); // Instancia de 'Somar'
        System.out.println("Somando: " + calculo.executar(2, 3));
//  ******************************************************************************************

        calculo = new Multiplicar(); // Usando aqui o 'Polimorfismo', mudando o comportamento de 'calculo', usando instancia de 'Multiplicar'
        System.out.println("Multiplicando: " + calculo.executar(2, 3));

    }
}
