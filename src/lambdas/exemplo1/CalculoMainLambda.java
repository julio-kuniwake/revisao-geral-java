package lambdas.exemplo1;

// Para usar a expressão lambda a interface tem que ter apenas um metodo.
// para que assim o java saiba que se trata do metodo especifico da interface.

// Usando expressões lambida neste exemplo, não tem a necessidade das classes 'Multiplicar e Somar'
public class CalculoMainLambda {
    public static void main(String[] args) {

        // Exemplo de expressão lambda usando '{}'
        // Quando se tem mais de uma sentenca de codigo
        Calculo calculo = (a, b) -> {
            double result = a + b;
            return result;
        };
        System.out.println(calculo.executar(2, 3));

        // Exemplo de expressão lambda sem '{}'
        // Quando se tem apenas uma sentença de codigo.
        calculo = (a, b) -> a * b;
        System.out.println(calculo.executar(2, 3));

        System.out.println("\n" + calculo.defaultPode());
        System.out.println(Calculo.staticPode());
    }
}
