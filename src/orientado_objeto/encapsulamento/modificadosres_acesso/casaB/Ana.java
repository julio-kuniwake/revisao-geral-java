package orientado_objeto.encapsulamento.modificadosres_acesso.casaB;

import orientado_objeto.encapsulamento.modificadosres_acesso.casaA.Carol;

public class Ana extends Carol {

    void testeAcessos() {
        // System.out.println(segredo); // Não tem acesso pois é 'private'
        // System.out.println(facoDentroDeCasa); // Não tem acesso pois esta em pacotes diferentes
        System.out.println(formaDeFalar); // Tem acesso, Ana é filha de Carol
        System.out.println(todosSabem); // Tem acesso pois é 'public'

        // Outra forma de acessar é criando a instancia de 'Ana'
        System.out.println(new Ana().formaDeFalar);
        System.out.println(new Ana().todosSabem);
    }
}
