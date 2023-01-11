package orientado_objeto.encapsulamento.modificadosres_acesso.casaB;

import orientado_objeto.encapsulamento.modificadosres_acesso.casaA.Carol;

public class Fulano {

    Carol sogra = new Carol();

    void testeAcessos() {
        // System.out.println(sogra.segredo); // Não tem acesso pois é 'private'
        // System.out.println(sogra.facoDentroDeCasa); // Não tem acesso pois esta em pacotes diferentes
        // System.out.println(sogra.formaDeFalar); // Não tem acesso, pois é 'protected' e não esta no mesmo pacote, alem de não herdar nada de 'Carol'
        System.out.println(sogra.todosSabem); // Todos tem acesso pois é 'public'
    }
}
