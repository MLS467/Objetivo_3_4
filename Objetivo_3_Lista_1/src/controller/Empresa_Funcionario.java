package controller;

import model.Empresa;
import model.Funcionario;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Comparator;


public class Empresa_Funcionario {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario(1, "123.456.789-01", "Ichigo", "Kurosaki", LocalDate.of(1990, 1, 1));
        Funcionario f2 = new Funcionario(2, "234.567.890-12", "Rukia", "Kuchiki", LocalDate.of(1985, 5, 15));
        Funcionario f3 = new Funcionario(3, "345.678.901-23", "Renji", "Abarai", LocalDate.of(1988, 9, 3));
        Funcionario f4 = new Funcionario(4, "456.789.012-34", "Orihime", "Inoue", LocalDate.of(1987, 12, 23));
        Funcionario f5 = new Funcionario(5, "567.890.123-45", "Uryu", "Ishida", LocalDate.of(1992, 7, 6));
        Funcionario f6 = new Funcionario(6, "678.901.234-56", "Yasutora", "Sado", LocalDate.of(1983, 3, 10));

        Empresa empresa1 = new Empresa("12345678901234", "Empresa A Ltda.", "Fantasia A");
        Empresa empresa2 = new Empresa("56789012345678", "Empresa B S/A", "Fantasia B");

        empresa1.getFuncionarioList().add(f1);
        empresa1.getFuncionarioList().add(f2);
        empresa1.getFuncionarioList().add(f3);
        empresa2.getFuncionarioList().add(f4);
        empresa2.getFuncionarioList().add(f5);
        empresa2.getFuncionarioList().add(f6);

        System.out.println("ORDENADO PELO NOME");
        System.out.println();
        empresa1.getFuncionarioList().sort(Comparator.comparing(Funcionario::getNome));
        System.out.println(empresa1);

        empresa2.getFuncionarioList().sort(Comparator.comparing(Funcionario::getNome));
        System.out.println(empresa2);

        System.out.println();

        System.out.println("ORDENADOS POR IDADE");
        System.out.println();

        empresa1.getFuncionarioList().sort(Comparator.comparing(Funcionario::IdadeAtual).reversed());
        System.out.println(empresa1);
        System.out.println();
        empresa2.getFuncionarioList().sort(Comparator.comparing(Funcionario::IdadeAtual).reversed());
        System.out.println(empresa2);


    }
}
