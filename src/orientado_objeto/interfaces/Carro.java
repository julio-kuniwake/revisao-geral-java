package orientado_objeto.interfaces;

public class Carro {
    private String tipoCombustivel;

    Carro(String tipoCombustivel) {
        this.setTipoCombustivel(tipoCombustivel);
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
}
