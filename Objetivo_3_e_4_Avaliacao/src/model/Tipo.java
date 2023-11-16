package model;

public enum Tipo {

    ATENDIDO("Atendido"),
    PENDENTE("Pedente"),
    CANCELADO("Cancelado");

    private String tipo;
    Tipo() {
    }

    Tipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "\nTipo{ " + super.toString() + "}";
    }
}
