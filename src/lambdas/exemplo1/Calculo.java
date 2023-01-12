package lambdas.exemplo1;

@FunctionalInterface
// Quer dizer que esta interface tem apenas um unico metodo, podendo assim usar as expressoes lambda
public interface Calculo {

    double executar(double a, double b);

    // String teste(); // Da ruim, alem de dar erros nas expressões lambdas no 'CalculoMainLambda'
}
