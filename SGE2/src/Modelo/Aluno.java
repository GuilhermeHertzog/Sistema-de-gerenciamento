package Modelo;

public class Aluno{

    private String nome;
    private String matricula;
    private Curso cursoAluno;

    public Aluno(String nome, String matricula, Curso cursoAluno) {

        // Validaçao simples
        if (nome == null || nome.isEmpty()) {   //isEmpty Verifica se veio string vazia
            System.out.println("Nome não pode ser vazio!");
            return;
        }
        if (matricula == null || matricula.isEmpty()) {
            System.out.println("Matrícula não pode ser vazia!");
            return;
        }
        if (cursoAluno == null) {
            System.out.println("Curso não pode ser nulo!");
            return;
        }

        this.nome = nome;
        this.matricula = matricula;
        this.cursoAluno = cursoAluno;
    }
    // GETTERS
    public String getNome() {
        return this.nome;
    }
    public String getMatricula() {
        return this.matricula;
    }
    public Curso getCursoAluno() {
        return this.cursoAluno;
    }
    // SETTERS
    public String setNome(String nome){
        return this.nome = nome;
    }
    public String setMatricula(String matricula) {
        return this.matricula = matricula;
    }
    public void setCurso(Curso curso) {
        this.cursoAluno = curso;
    }

    @Override
    public String toString() {
        return "Aluno: " + nome + " | Matrícula: " + matricula +  " | " + cursoAluno.getNome();
    }

}
