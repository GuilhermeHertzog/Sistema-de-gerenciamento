package Modelo;

public class Curso {
    private String nomeCurso;
    private String codigo;
    private int cargaHoraria;

    public Curso(String nomeCurso, String codigo, int cargaHoraria) {

        // Validaçao simples
        if (nomeCurso == null || nomeCurso.isEmpty()) {   //isEmpty Verifica se veio string vazia
            System.out.println("Nome não pode ser vazio!");
            return;
        }
        if (codigo == null || codigo.isEmpty()) {
            System.out.println("Código não pode ser vazio!");
            return;
        }
        if (cargaHoraria <= 0) {
            System.out.println("Carga Horaria não pode ser Zero!");
            return;
        }

        this.nomeCurso = nomeCurso;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return nomeCurso;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setNome(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso: " + nomeCurso + " | Código: " + codigo + " | Caraga Horaria: " + cargaHoraria;
    }
}

