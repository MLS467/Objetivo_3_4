package controller;

import model.Aluno;
import model.Disciplina;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Aluno_Disciplina_Controller {
    public static void main(String[] args) {

        Aluno a1 = new Aluno(123456, "Ichigo", "Kurosaki");
        Aluno a2 = new Aluno(789012, "Rukia", "Kuchiki");

        Disciplina d1 = new Disciplina(1, "Matemática");
        Disciplina d2 = new Disciplina(2, "Português");
        Disciplina d3 = new Disciplina(3, "História");

        a1.getDisciplinaList().add(d1);
        a1.getDisciplinaList().add(d2);

        a2.getDisciplinaList().add(d1);
        a2.getDisciplinaList().add(d2);
        a2.getDisciplinaList().add(d3);

        List<Aluno> alunoList = new ArrayList<>();
        alunoList.add(a1);
        alunoList.add(a2);

        a1.getDisciplinaList().sort(Comparator.comparing(Disciplina::getNome));
        System.out.println(a1);
        a2.getDisciplinaList().sort(Comparator.comparing(Disciplina::getNome));
        System.out.println(a2);

        a2.getDisciplinaList().clear();


        System.out.println(a1);
        System.out.println(a2);


    }
}
