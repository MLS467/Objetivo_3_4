package controller;

import model.Fornecedor;
import model.Fornecimento;
import model.Produto;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Fornecedor_Fornecimento_Produto {
    public static void main(String[] args) {
        Fornecedor fornecedor1 = new Fornecedor(123456789, "João Silva", "Empresa A");
        Fornecedor fornecedor2 = new Fornecedor(987654321, "Maria Oliveira", "Empresa B");

        Produto produto1 = new Produto(1, "Produto A", 50, 19.99, fornecedor1);
        Produto produto2 = new Produto(2, "Produto B", 30, 29.99, fornecedor2);
        Produto produto3 = new Produto(3, "Produto C", 40, 9.99, fornecedor1);

        Fornecimento fornecimento1 = new Fornecimento(LocalDate.of(2023,11,15),produto1.getQuantidade() * produto1.getPreco(),fornecedor1,produto1);
        Fornecimento fornecimento2 = new Fornecimento(LocalDate.of(2023,11,15),produto2.getQuantidade() * produto2.getPreco(),fornecedor1,produto2);
        Fornecimento fornecimento3 = new Fornecimento(LocalDate.of(2023,11,15),produto3.getQuantidade() * produto3.getPreco(),fornecedor2,produto3);

        List<Fornecimento> fornecimentoList = new ArrayList<>();
        fornecimentoList.add(fornecimento1);
        fornecimentoList.add(fornecimento2);
        fornecimentoList.add(fornecimento3);

        double total = 0;
        for (Fornecimento a: fornecimentoList) {
            System.out.println(a);
            total += a.getValorTotal();
        }

        System.out.println("\n");
        System.out.println("VALOR TOTAL FORNECIDO ");
        System.out.print("Valor total =");
        System.out.println(NumberFormat.getCurrencyInstance().format(total));



    }
}
