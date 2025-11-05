package Main;

import Modelo.*;

public class Main {

    public static void main(String[] args){

        Curso curso = new Curso("Analise e Desenvolvimento de Sistemas", "153654", 2269);
        Aluno aluno = new Aluno("Maria Silva", "2024001",curso);
        Professor professor = new Professor("João Antonio", "POO", 5698);
        Turma turma = new Turma("ADS54", professor, curso);
        Avaliacao avaliacao = new Avaliacao(0, "POO", aluno, turma);

        turma.adicionarAluno(aluno);
        turma.resumoTurma();
        turma.removerAluno(aluno);
        turma.resumoTurma();

        avaliacao.atibuirNota(8);

        System.out.println(avaliacao);
    }
}
