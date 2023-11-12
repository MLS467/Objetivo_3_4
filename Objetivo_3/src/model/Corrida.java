package model;

import java.util.Date;

public class Corrida {
    private long id;
    private  String tipoPagamento;
    private String detalhesPagamento;
    private Date dataInicio;
    private double preco;
    private int atributo;
    Usuario usuario;
    Motorista motorista;

    public Corrida() {
    }

    public Corrida(long id, String tipoPagamento, String detalhesPagamento, Date dataInicio, double preco, int atributo, Usuario usuario, Motorista motorista) {
        this.id = id;
        this.tipoPagamento = tipoPagamento;
        this.detalhesPagamento = detalhesPagamento;
        this.dataInicio = dataInicio;
        this.preco = preco;
        this.atributo = atributo;
        this.usuario = usuario;
        this.motorista = motorista;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getDetalhesPagamento() {
        return detalhesPagamento;
    }

    public void setDetalhesPagamento(String detalhesPagamento) {
        this.detalhesPagamento = detalhesPagamento;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getAtributo() {
        return atributo;
    }

    public void setAtributo(int atributo) {
        this.atributo = atributo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "\nCorrida{" +
                "id=" + id +
                ", tipoPagamento='" + tipoPagamento + '\'' +
                ", detalhesPagamento='" + detalhesPagamento + '\'' +
                ", dataInicio=" + dataInicio +
                ", preco=" + preco +
                ", atributo=" + atributo +
                ", usuario=" + usuario +
                ", motorista=" + motorista +
                '}';
    }
}
