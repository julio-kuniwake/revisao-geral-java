package orientado_objeto.interfaces;

public interface Luxo {

    void temArDigital();

    void direcaoAutonoma();

    default boolean temSaidaArAtraz() { // Exemplo de uma implementação padrão 'default'
        return true;
    }
}
