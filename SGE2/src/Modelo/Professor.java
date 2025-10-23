package Modelo;

public class Professor {
    private String nome;
    private String especialidade;
    private int registro;

        public Professor(String nome, String especialidade, int registro) {

            if (nome == null || nome.isEmpty()) {   //isEmpty Verifica se veio string vazia
                System.out.println("Nome não pode ser vazio!");
                return;
            }
            if (especialidade == null || especialidade.isEmpty()) {
                System.out.println("Especialidade não é valida!");
                return;
            }
            if (registro <= 0) {
                System.out.println("Registro não é valido!");
                return;
            }

        this.nome = nome;
        this.especialidade = especialidade;
        this.registro = registro;
    }

    public String getNome() {
            return nome;
    }
    public String getEspecialidade() {
            return especialidade;
    }
    public int getRegistro() {
            return registro;
    }

    public void setNome(String nome) {
            this.nome = nome;
    }
    public void setEspecialidade(String especialidade) {
            this.especialidade = especialidade;
    }
    public void setRegistro(int registro) {
            this.registro = registro;
    }

    @Override
    public String toString() {
        return "Professor: " + nome + " | Especialidade: " + especialidade + " | Registro: " + registro;
    }
}
