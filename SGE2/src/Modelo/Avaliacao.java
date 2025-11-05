package Modelo;

public class Avaliacao {

    private double nota;
    private String descricao;
    private Aluno aluno;
    private Turma turma;

    public Avaliacao(double nota, String descricao, Aluno aluno, Turma turma){
        this.nota = 0; // serve para informar nota não atribuida
        this.descricao = descricao;
        this.aluno = aluno;
        this.turma = turma;
    }

    public void atibuirNota(double valor){
        if(valor >=0 && valor <=10){
            this.nota = valor;
        }else {
            System.out.println("\nErro ao atribuir a nota ao Aluno\n");
        }
    }

    // Getters
    public double getNota() {
        return nota; }
    public String getDescricao() {
        return descricao; }
    public Aluno getAluno() {
        return aluno; }
    public Turma getTurma() {
        return turma; }

    @Override
    public String toString() {
        return "\nAluno: " + aluno.getNome() + " | Avaliação: " + descricao + " | Nota: " + nota;
    }

}
