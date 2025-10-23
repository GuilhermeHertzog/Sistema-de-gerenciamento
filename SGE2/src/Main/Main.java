package Main;

import Modelo.Aluno;
import Modelo.Curso;
import Modelo.Professor;

public class Main {

    public static void main(String[] args){

        Curso curso = new Curso("Analise e Desenvolvimento de Sistemas", "153654", 2269);
        Aluno aluno = new Aluno("Maria Silva", "2024001",curso);
        Professor professor = new Professor("João Antonio", "POO", 5698);

        System.out.println(aluno);
        System.out.println(curso);
        System.out.println(professor);
    }

}
