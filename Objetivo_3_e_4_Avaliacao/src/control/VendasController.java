package control;

import exceptions.MyException;
import model.*;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VendasController {
    public static void main(String[] args) {
        Fornecedor fornecedor1 = new Fornecedor(123456789, "Shunsui Kyoraku", "Divisão 8");
        Fornecedor fornecedor2 = new Fornecedor(987654321, "Byakuya Kuchiki", "Divisão 6");

        Produto produto1 = new Produto(1, "Zanpakuto", 10, 100.0, fornecedor1);
        Produto produto2 = new Produto(2, "Senkaimon", 5, 500.0, fornecedor2);

        Fornecimento fornecimento1 = new Fornecimento(LocalDate.of(2023, 11, 15), produto1.getQuantidade() * produto1.getPreco(), fornecedor1, produto1);
        Fornecimento fornecimento2 = new Fornecimento(LocalDate.of(2023, 11, 15), produto2.getQuantidade() * produto2.getPreco(), fornecedor2, produto2);

        Vendedor vendedor1 = new Vendedor(123, "Goku", "Rua Kame", "Distrito 9", "12345-678", "Cidade X", "Estado Y", "Local A");

        Item item1 = new Item(101, 5.0, 2, produto1);
        Item item2 = new Item(102, 10.0, 1, produto2);

        Pedido pedido = new Pedido(1, LocalDate.of(2023, 11, 15), Tipo.ATENDIDO);

        pedido.setValor(fornecimento1.getValorTotal() - item1.getDesconto());
        pedido.setVendedor(vendedor1);
        pedido.getItemList().add(item1);
        produto1.setQuantidade(produto1.getQuantidade() - item1.getQuantidade());

        Pedido pedido2 = new Pedido(2, LocalDate.of(2023, 11, 15), Tipo.ATENDIDO);

        pedido2.setValor(fornecimento2.getValorTotal() - item2.getDesconto());
        pedido2.setVendedor(vendedor1);
        pedido2.getItemList().add(item2);
        produto2.setQuantidade(produto2.getQuantidade() - item2.getQuantidade());


        List<Pedido> pedidoList = new ArrayList<>();
        pedidoList.add(pedido);
        pedidoList.add(pedido2);
        System.out.println("Relatório de vendas");
        System.out.println(pedidoList);
        System.out.println();
        System.out.println("---> Estoque");
        System.out.println();
        System.out.println("Estoque Atual ---> " + produto1.getQuantidade() + " unidades");
        System.out.println("Estoque Atual ---> " + produto2.getQuantidade() + " unidades");
        System.out.println();


        // teste exception
        // produto1.setQuantidade(0);


        if (produto1.getQuantidade() >= item1.getQuantidade() && produto2.getQuantidade() >= item2.getQuantidade()) {
            produto1.setQuantidade(produto1.getQuantidade() + 13);
            produto2.setQuantidade(produto2.getQuantidade() + 45);
            fornecimento1.setValorTotal(produto1.getQuantidade() * produto1.getPreco());
            fornecimento2.setValorTotal(produto2.getQuantidade() * produto2.getPreco());

            List<Fornecimento> fornecimentoList = new ArrayList<>();
            fornecimentoList.add(fornecimento1);
            fornecimentoList.add(fornecimento2);
            System.out.println();
            System.out.println("Relatório de fornecimento");
            System.out.println(fornecimentoList);
            System.out.println();
            double custoTotal = fornecimentoList.stream().mapToDouble(s -> s.getValorTotal()).sum();
            System.out.println("Custo total ---> " + NumberFormat.getCurrencyInstance().format(custoTotal));
        } else {
            myThrowException();
        }

    }

    private static void myThrowException() {
        try {
            throw new MyException("Erro, estoque insuficiente.");
        } catch (MyException e) {
            e.printStackTrace();
        } finally {
            System.err.println("Finally executado em MyException()");
        }
    }

}
