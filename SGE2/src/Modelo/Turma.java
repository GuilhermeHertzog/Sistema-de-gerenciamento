package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private String codigo;
    private Professor professor;
    private Curso curso;
    private List<Aluno> listaAlunos;

    public Turma(String codigo, Professor professor, Curso curso) {
        this.codigo = codigo;
        this.professor = professor;
        this.curso = curso;
        this.listaAlunos = new ArrayList<>();
    }
    // GETTERS
    public String getCodigo() { return codigo; }
    public Professor getProfessor() { return professor; }
    public Curso getCurso() { return curso; }
    public List<Aluno> getListaAlunos() { return listaAlunos; }

//     Adicionar aluno na turma
    public void adicionarAluno(Aluno aluno) {
        if (aluno != null)
        {
            listaAlunos.add(aluno);
            System.out.println("Aluno " + aluno.getNome() + " adicionado á turma.\n");
        }
    }

//    Remove aluno da turma
    public  void removerAluno(Aluno aluno){
        if(listaAlunos.remove(aluno))
        {
            System.out.println("Aluno "+ aluno.getNome() + " removido da turma.\n");
        }else{
            System.out.println("Aluno não encontrado na turma");
        }
    }
//    Resumo da turma
    public void resumoTurma() {
        System.out.println("==== RESUMO DA TURMA ====");
        System.out.println("Código: " + codigo);
        System.out.println("Professor: " + professor.getNome());
        System.out.println("Curso: " + curso.getNome());
        System.out.println("Alunos matriculados: " + listaAlunos.size());

        for (Aluno aluno : listaAlunos) {
            System.out.println("  - " + aluno.getNome());

            System.out.println("============================");
        }
    }
}

