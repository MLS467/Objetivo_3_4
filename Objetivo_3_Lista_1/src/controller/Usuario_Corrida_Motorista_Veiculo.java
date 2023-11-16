package controller;

import model.Corrida;
import model.Motorista;
import model.Usuario;
import model.Veiculo;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Comparator;

public class Usuario_Corrida_Motorista_Veiculo {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario(1, "Goku Son", "goku@example.com", "123-456-7890");
        Veiculo veiculo1 = new Veiculo(1, "Carro", "ABC1234", 2022);
        Motorista motorista1 = new Motorista(1L, "Ichigo Kurosaki", "ichigo@example.com", "123-456-7890", veiculo1);
        Corrida corrida1 = new Corrida(1, "Cartão de Crédito", "Detalhes do pagamento", LocalDate.of(2023, 11, 15), 50.0, 1);
        Corrida corrida2 = new Corrida(2, "Dinheiro", "Detalhes do pagamento", LocalDate.of(2023, 11, 16), 40.0, 2);


        corrida1.setUsuario(usuario1);
        corrida1.setMotorista(motorista1);
        corrida2.setUsuario(usuario1);
        corrida2.setMotorista(motorista1);

        usuario1.getCorridas().add(corrida1);
        usuario1.getCorridas().add(corrida2);

        usuario1.getCorridas().sort(Comparator.comparing(Corrida::getDataInicio).reversed());
        System.out.println();
        System.out.println("(Usuário) Ordenado por Corrida DataInicio");
        System.out.println(usuario1.getCorridas());


        System.out.println();
        System.out.println("(Motorista) Ordenado por Corrida DataInicio");

        motorista1.getCorridas().add(corrida1);
        motorista1.getCorridas().add(corrida2);
        motorista1.getCorridas().sort(Comparator.comparing(Corrida::getDataInicio).reversed());

        System.out.println(motorista1.getCorridas() + "\n");

        System.out.println();
        System.out.println("Valor total de todas as corridas por motorista");
        System.out.println();
        double valorTotal = motorista1.getCorridas().stream().mapToDouble(corrida -> corrida.getPreco()).sum();
        System.out.println("Motorista "+ motorista1.getNome() +" Valor total =  "+NumberFormat.getCurrencyInstance().format(valorTotal));
    }
}
