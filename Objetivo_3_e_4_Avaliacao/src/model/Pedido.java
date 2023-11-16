package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido{

    private int numero;
    private LocalDate data;
    private  double valor;

    private Vendedor vendedor;

    private Tipo tipo;

    private List<Item> itemList = new ArrayList<>();

    public Pedido() {
    }

    public Pedido(int numero, LocalDate data, Tipo tipo) {
        this.numero = numero;
        this.data = data;
        this.tipo = tipo;
    }

    public Pedido(int numero, LocalDate data, double valor, Vendedor vendedor, List<Item> itemList) {
        this.numero = numero;
        this.data = data;
        this.valor = valor;
        this.vendedor = vendedor;
        this.itemList = itemList;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    @Override
    public String toString() {
        return "\nPedido{" +
                "numero=" + numero +
                ", data=" + data +
                ", valor=" + valor +
                ", vendedor=" + vendedor +
                ", tipo=" + tipo +
                ", itemList=" + itemList +
                '}';
    }
}
