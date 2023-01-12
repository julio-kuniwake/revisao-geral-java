package lambdas.exemplo1;

@FunctionalInterface
// Quer dizer que esta interface tem apenas um unico metodo ABSTRATO, podendo assim usar as expressoes lambda
public interface Calculo {

    double executar(double a, double b);

    // String teste(); // Da ruim, alem de dar erros nas expressões lambdas no 'CalculoMainLambda'

    default String defaultPode() {
        return "Metodos default em interface não afetam as expressões lambda";
    }

    static String staticPode() {
        return "Metodos staticos dentro de interface não afetam as expressões labdas";
    }
}
