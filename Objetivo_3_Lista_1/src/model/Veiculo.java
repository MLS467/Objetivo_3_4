package model;

import java.util.Date;

public class Veiculo {
    private long id;
    private  String tipo;
    private String placa;
    private Integer anoFabricacao;

    Motorista motorista;

    public Veiculo(long id, String tipo, String placa, Integer anoFabricacao) {
        this.id = id;
        this.tipo = tipo;
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
    }

    public Veiculo() {
    }

    public Veiculo(long id, String tipo, String placa, Integer anoFabricacao, Motorista motorista) {
        this.id = id;
        this.tipo = tipo;
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
        this.motorista = motorista;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    @Override
    public String toString() {
        return "\nVeiculo{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                ", placa='" + placa + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                '}';
    }
}
