package orientado_objeto.encapsulamento.modificadosres_acesso.casaA;

public class Julio {

    Carol esposa = new Carol();

    void testeAcessos() {
        // System.out.println(esposa.segredo); // Não tem acesso pois é 'private'
        System.out.println(esposa.facoDentroDeCasa); // Tem acesso pois esta no mesmo pacote é 'default'
        System.out.println(esposa.formaDeFalar); // Tem acesso, pois é 'protected' e esta no mesmo pacote
        System.out.println(esposa.todosSabem); // Todos tem acesso pois é 'public'
    }
}
